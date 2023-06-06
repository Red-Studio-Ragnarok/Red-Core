package io.redstudioragnarok.redcore.logging;

import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RedLogger {

    private static final Random RANDOM = new Random();

    /**
     * A list of recomfort messages to be displayed when an error occurs.
     */
    private static final List<String> RECOMFORT_MESSAGES = new ArrayList<>(Arrays.asList(
            "Hey there, don't worry!",
            "Oh no! Even Minecraft mods need a hug sometimes.",
            "It's just a small hiccup! Let's get back to mining and crafting.",
            "Exception? More like an opportunity to make it even better!",
            "Think of this as a chance to take a quick snack break!",
            "Rome wasn't built in a day"
    ));

    private static int maxLineLength;

    private final String modName;
    private final URI newIssueLink;
    private final Logger logger;

    private final List<String> customRecomfortMessages = new ArrayList<>();

    public RedLogger(final String modName, final URI newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        this.modName = modName;
        this.newIssueLink = newIssueLink;
        this.logger = logger;
        this.customRecomfortMessages.addAll(Arrays.asList(customRecomfortMessages));
    }

    /**
     * Prints a framed error message with a category, information on what happened, optional additional information and information on what will happen now.
     *
     * @param category The error category.
     * @param whatHappened A description of what happened.
     * @param whatNow A description of what's happening now.
     * @param additionalInformation Optional additional information about the error.
     */
    public void printFramedError(final String category, final String whatHappened, final String whatNow, final String... additionalInformation) {
        // Create a list of formatted text lines containing the descriptions of what happened and what's happening now, as well as optional additional information.
        final List<String> formattedTextLines = new ArrayList<>(Arrays.asList(whatHappened, ""));
        formattedTextLines.addAll(Arrays.asList(additionalInformation));
        formattedTextLines.addAll(Arrays.asList("", whatNow));

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
        final String horizontalBorder = createBorder();

        // Format the header, category, and recomfort message to be centered within the frame
        final String centeredHeader = centeredText(header);
        final String centeredCategory = centeredText(category);
        final String recomfortText = centeredText(recomfort);

        // Format the lines of text to fit within the framed error message
        final String formattedText = formatTextLines(formattedTextLines);

        // Format the report message and link to be centered within the frame
        final String reportMessage = centeredText("Please report this error");
        final String reportLink = centeredText(String.valueOf(newIssueLink));

        // Assemble the framed error message with all the formatted components
        final String framedText = "\n" + horizontalBorder + "\n" + centeredHeader + "\n" + centeredCategory + "\n" + horizontalBorder + "\n" + recomfortText + "\n" + horizontalBorder + "\n" + formattedText + "\n" + horizontalBorder + "\n" + reportMessage + "\n" + reportLink + "\n" + horizontalBorder;

        // Log the framed error message
        logger.error(framedText);
    }

    /**
     * Determines the maximum line length for the framed error message, and sets maxLineLength to the result.
     *
     * @param header The header message.
     * @param category The error category.
     * @param lines The lines of text to be displayed.
     * @param recomfort The recomfort message.
     */
    private static void getMaxLineLength(final String header, final String category, final List<String> lines, final String recomfort) {
        maxLineLength = Math.max(Math.max(Math.max(Math.max(lines.stream().mapToInt(String::length).max().orElse(0), category.length()), lines.get(lines.size() - 1).length()), recomfort.length()), header.length());
    }

    /**
     * Creates a border for the framed error message.
     *
     * @return The horizontal border as a string.
     */
    private static String createBorder() {
        return "+" + repeatString("-", maxLineLength + 2) + "+";
    }

    /**
     * Formats the given text to be centered within the framed error message.
     *
     * @param text The text to be centered.
     * @return The centered text as a string.
     */
    private static String centeredText(final String text) {
        int padding = (maxLineLength - text.length()) / 2;
        return "| " + repeatString(" ", padding) + text + repeatString(" ", maxLineLength - text.length() - padding) + " |";
    }

    /**
     * Formats the given lines of text to fit within the framed error message.
     *
     * @param lines The lines of text to be formatted.
     * @return The formatted lines as a string.
     */
    private static String formatTextLines(final List<String> lines) {
        return lines.stream().map(line -> "| " + line + repeatString(" ", maxLineLength - line.length()) + " |").collect(Collectors.joining("\n"));
    }

    /**
     * Repeats the given string for the specified number of times.
     *
     * @param string The string to be repeated.
     * @param count The number of times to repeat the string.
     * @return The repeated string.
     */
    private static String repeatString(final String string, final int count) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++)
            stringBuilder.append(string);

        return stringBuilder.toString();
    }
}
