package io.redstudioragnarok.redcore.logging;

import dev.redstudio.redcore.annotations.RedDeprecated;
import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.Random;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
public final class RedLogger extends dev.redstudio.redcore.logging.RedLogger {

    /**
     * @deprecated Use your own random
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public static final Random RANDOM = new Random();

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#RedLogger(String, String, Logger, String...)}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public RedLogger(final String modName, final String newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        super(modName, newIssueLink, logger, customRecomfortMessages);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#RedLogger(String, URI, Logger, String...)}
     */
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public RedLogger(final String modName, final URI newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        super(modName, newIssueLink, logger, customRecomfortMessages);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#framedError}
     */
    @Override
    @Deprecated
@RedDeprecated(since = "0.5", forRemovalIn = "0.8")
    public void printFramedError(final String category, final String whatHappened, final String whatNow, final String... additionalInformation) {
        super.framedError(category, whatHappened, whatNow, additionalInformation);
    }
}
