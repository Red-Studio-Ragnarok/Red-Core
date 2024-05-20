package io.redstudioragnarok.redcore.logging;

import org.apache.logging.log4j.Logger;

import java.net.URI;
import java.util.Random;

/**
 * @author Luna Lage (Desoroxxx)
 * @deprecated See methods for details.
 */
@Deprecated // Todo: Remove in 0.8
public final class RedLogger extends dev.redstudio.redcore.logging.RedLogger {

    /**
     * @deprecated Use your own random
     */
    @Deprecated
    public static final Random RANDOM = new Random();

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#RedLogger(String, String, Logger, String...)}
     */
    @Deprecated
    public RedLogger(final String modName, final String newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        super(modName, newIssueLink, logger, customRecomfortMessages);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#RedLogger(String, URI, Logger, String...)}
     */
    @Deprecated
    public RedLogger(final String modName, final URI newIssueLink, final Logger logger, final String... customRecomfortMessages) {
        super(modName, newIssueLink, logger, customRecomfortMessages);
    }

    /**
     * @deprecated Use {@link dev.redstudio.redcore.logging.RedLogger#logFramedError}
     */
    @Override
    @Deprecated
    public void printFramedError(final String category, final String whatHappened, final String whatNow, final String... additionalInformation) {
        super.logFramedError(category, whatHappened, whatNow, additionalInformation);
    }
}
