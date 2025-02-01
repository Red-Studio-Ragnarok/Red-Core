package dev.redstudio.redcore.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

/// This class provides a logging utility, with an emphasis on ease of use and user-friendliness.
///
/// The logger is equipped with custom messages and error frames that make error reporting more user-friendly.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.2
public class RedLogger {

    private static final Random RANDOM = new Random();

    /// A list of recomfort messages to be displayed when an error occurs.
    private static final List<String> RECOMFORT_MESSAGES = new ArrayList<>(Arrays.asList(
            "Hey there, don't worry!",
            "Oh no! Even Minecraft mods need a hug sometimes.",
            "It's just a small hiccup! Let's get back to mining and crafting.",
            "Exception? More like an opportunity to make it even better!",
            "Think of this as a chance to take a quick snack break!",
            "Rome wasn't built in a day"
    ));

    /// The maximum length of a line used in the formatted error output.
    ///
    /// It is updated dynamically based on the size of the error details.
    private static int maxLineLength;

    /// The maximum length of a line used in the formatted error output.
    /// It is updated dynamically based on the size of the error details.
    private final String modName;
    /// The link where new issues related to the mod can be reported.
    ///
    /// Typically, a link to a GitHub issue creation page.
    private final String newIssueLink;
    /// The underlying logger which will output the error messages.
    private final Logger logger;
    /// A list of custom comforting messages specified during the creation of this logger.
    private final List<String> customRecomfortMessages = new ArrayList<>();

    /// Constructor for the RedLogger class.
    ///
    /// Allows for the specification of custom comforting messages in addition to the default ones.
    ///
    /// @param modName The name to be used for the logger.
    /// @param newIssueLink The link to report new issues.
    /// @param logger The underlying logger to use.
    /// @param customRecomfortMessages Optional custom comforting messages.
    public RedLogger(final String modName, final String newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        this.modName = modName;
        this.newIssueLink = newIssueLink;
        this.logger = logger;
        this.customRecomfortMessages.addAll(Arrays.asList(customRecomfortMessages));
    }

    /// Constructor for the RedLogger class.
    ///
    /// Allows for the specification of custom comforting messages in addition to the default ones.
    ///
    /// @param modName The name to be used for the logger.
    /// @param newIssueLink The URI link to report new issues.
    /// @param logger The underlying logger to use.
    /// @param customRecomfortMessages Optional custom comforting messages.
    ///
    /// @deprecated Use a String instead of a URI for the newIssueLink parameter.
    @Deprecated // Todo: Remove in 0.8
    public RedLogger(final String modName, final URI newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        this.modName = modName;
        this.newIssueLink = newIssueLink.toString();
        this.logger = logger;
        this.customRecomfortMessages.addAll(Arrays.asList(customRecomfortMessages));
    }

    /// Logs a framed message with a title, specified log level, and an array of messages.
    ///
    /// This method formats the message in an easy-to-read manner, perfect for versioning information or other lists type of logging.
    ///
    /// The frame is made of {@code =} and has top, bottom borders.
    ///
    /// @param title The title of the framed message.
    /// @param logLevel The log level at which to log the message.
    /// @param messages The array of messages to be included within the frame.
    public void framed(final String title, final Level logLevel, final String... messages) {
        // Create a StringBuilder and add a new line so everything can be aligned
        final StringBuilder stringBuilder = new StringBuilder().append("\n");

        // Determine the maximum length of the message lines and title
        int maxLength = title.length();
        for (final String message : messages)
            maxLength = Math.max(maxLength, message.length());

        // Calculate the total length of the frame's border and create it
        final int borderLength = maxLength + 4;
        final String fullBorder = repeatString("=", borderLength);

        // Calculate the length of the half-border and create it
        int halfBorderLength = (borderLength - title.length() - 2) / 2;
        final String halfBorder = repeatString("=", halfBorderLength);

        // Append the top border and the title
        stringBuilder.append(halfBorder).append(" ").append(title).append(" ").append(halfBorder);

        // Adjust the border in case the total length is odd
        if ((borderLength - title.length() - 2 * halfBorderLength) == 1)
            stringBuilder.append("=");

        stringBuilder.append("\n");

        // Append each message to the StringBuilder
        for (final String message : messages)
            stringBuilder.append(message).append("\n");

        // Append the bottom border
        stringBuilder.append(fullBorder);

        // Log the framed message at the specified log level
        logger.log(logLevel, stringBuilder.toString());
    }

    /// Logs a framed error message with a category, description of what happened, what's going to happen now, and an optional array of additional information.
    ///
    /// This method formats the message in a user-friendly manner, including a "comforting" message and the link to report the error.
    ///
    /// The frame is made of {@code +} {@code -} {@code |} and has top, bottom, left, and right borders.
    /// It also has separator lines between the title and the "comforting" message, the "comforting" message and the information, the information and the link.
    ///
    /// @param category The error category.
    /// @param whatHappened A description of what happened.
    /// @param whatNow A description of what's happening now.
    /// @param additionalInformation Optional additional information about the error.
    ///
    /// @deprecated Use {@link #framedError(String, String, String, String...)} instead.
    @Deprecated // TODO: Remove in 0.8
    public void printFramedError(final String category, final String whatHappened, final String whatNow, final String... additionalInformation) {
        framedError(category, whatHappened, whatNow, additionalInformation);
    }

    /// Logs a framed error message with a category, description of what happened, what's going to happen now, and an optional array of additional information.
    ///
    /// This method formats the message in a user-friendly manner, including a "comforting" message and the link to report the error.
    ///
    /// The frame is made of {@code +} {@code -} {@code |} and has top, bottom, left, and right borders.
    /// It also has separator lines between the title and the "comforting" message, the "comforting" message and the information, the information and the link.
    ///
    /// @param category The error category.
    /// @param whatHappened A description of what happened.
    /// @param whatNow A description of what's happening now.
    /// @param additionalInformation Optional additional information about the error.
    public void framedError(final String category, final String whatHappened, final String whatNow, final String... additionalInformation) {
        // Create a list of formatted text lines containing the descriptions of what happened and what's happening now, as well as optional additional information.
        final List<String> formattedTextLines = new ArrayList<>(Collections.singletonList(whatHappened));

        // If there is another text apart from what happened, add a blank line
        if (!whatNow.isEmpty() || additionalInformation.length != 0)
            formattedTextLines.add("");

        // If there is additional information, add it
        if (additionalInformation.length != 0)
            formattedTextLines.addAll(Arrays.asList(additionalInformation));

        // If what now is not empty, add it
        if (!whatNow.isEmpty()) {
            // If there is additional information, add a blank line
            if (additionalInformation.length != 0)
                formattedTextLines.add("");

            formattedTextLines.add(whatNow);
        }

        // Create the header
        final String header = modName + " had an exception, category:";

        // Combine the custom and standard comfort messages into a new list
        final List<String> combinedRecomfortMessages = new ArrayList<>();
        combinedRecomfortMessages.addAll(customRecomfortMessages);
        combinedRecomfortMessages.addAll(RECOMFORT_MESSAGES);

        // Get a random recomfort message from the combined list
        final String recomfort = combinedRecomfortMessages.get(RANDOM.nextInt(combinedRecomfortMessages.size()));

        // Calculate the maximum line length for the framed error message
        getMaxLineLength(header, category, formattedTextLines, recomfort);

        // Create a horizontal border for the framed error message
        final String horizontalBorder = "+" + repeatString("-", maxLineLength + 2) + "+";

        // Format the header, category, and recomfort message to be centered within the frame
        final String centeredHeader = centeredText(header);
        final String centeredCategory = centeredText(category);
        final String recomfortText = centeredText(recomfort);

        // Format the lines of text to fit within the framed error message
        final String formattedText = formattedTextLines.stream().map(line -> "| " + line + repeatString(" ", maxLineLength - line.length()) + " |").collect(Collectors.joining("\n"));

        // Format the report message and link to be centered within the frame
        final String reportMessage = centeredText("Please report this error");
        final String reportLink = centeredText(newIssueLink);

        // Assemble the framed error message with all the formatted components
        final String framedText = "\n" + horizontalBorder + "\n" + centeredHeader + "\n" + centeredCategory + "\n" + horizontalBorder + "\n" + recomfortText + "\n" + horizontalBorder + "\n" + formattedText + "\n" + horizontalBorder + "\n" + reportMessage + "\n" + reportLink + "\n" + horizontalBorder;

        // Log the framed error message
        logger.error(framedText);
    }

    /// Determines the maximum line length for the framed error message, based on the provided content.
    ///
    /// The result is stored in the maxLineLength static variable.
    ///
    /// @param header The header message.
    /// @param category The error category.
    /// @param lines The lines of text to be displayed.
    /// @param recomfort The comforting message.
    private static void getMaxLineLength(final String header, final String category, final List<String> lines, final String recomfort) {
        maxLineLength = Math.max(Math.max(Math.max(Math.max(lines.stream().mapToInt(String::length).max().orElse(0), category.length()), lines.get(lines.size() - 1).length()), recomfort.length()), header.length());
    }

    /// Formats the given text to be centered within the framed error message.
    ///
    /// @param text The text to be centered.
    ///
    /// @return The centered text as a string.
    private static String centeredText(final String text) {
        int padding = (maxLineLength - text.length()) / 2;
        return "| " + repeatString(" ", padding) + text + repeatString(" ", maxLineLength - text.length() - padding) + " |";
    }

    /// Repeats the given string for the specified number of times.
    ///
    /// This method is used to create padding spaces for the error message formatting.
    ///
    /// @param string The string to be repeated.
    /// @param count The number of times to repeat the string.
    ///
    /// @return The repeated string.
    private static String repeatString(final String string, final int count) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++)
            stringBuilder.append(string);

        return stringBuilder.toString();
    }
}
