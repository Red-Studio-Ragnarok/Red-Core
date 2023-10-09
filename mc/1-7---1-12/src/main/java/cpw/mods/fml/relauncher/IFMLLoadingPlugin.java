package cpw.mods.fml.relauncher;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Dummy class to keep compat with old fml
 * <p>
 * If it's 1.7.10, forge's class will take precedence
 * If it's later, having this class will change nothing
 * <p>
 * Credits to cpw for the original class signature
 *
 * @author Glease <a href="https://github.com/Minecraft-Malware-Prevention-Alliance/PipeBlocker/commit/45244693452996c8248d9b8c7281e8f15134faae">PipeBlocker Commit</a>
 */
public interface IFMLLoadingPlugin {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Name {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface SortingIndex {
        int value();
    }
}
