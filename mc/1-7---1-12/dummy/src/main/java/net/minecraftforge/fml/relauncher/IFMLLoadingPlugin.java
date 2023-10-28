package net.minecraftforge.fml.relauncher;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/**
 * Dummy class to keep compat with old fml
 * <p>
 * If it's 1.7.10, having this class will change nothing
 * If it's later, forge's class will take precedence
 * <p>
 * Credits to cpw for the original class signature
 *
 * @author Glease <a href="https://github.com/Minecraft-Malware-Prevention-Alliance/PipeBlocker/commit/45244693452996c8248d9b8c7281e8f15134faae">PipeBlocker Commit</a>
 */
public interface IFMLLoadingPlugin {

    /**
     * Return a list of classes that implements the IClassTransformer interface
     *
     * @return a list of classes that implements the IClassTransformer interface
     */
    String[] getASMTransformerClass();

    /**
     * Return a class name that implements "ModContainer" for injection into the mod list
     * The "getName" function should return a name that other mods can, if need be,
     * depend on.
     * Trivially, this modcontainer will be loaded before all regular mod containers,
     * which means it will be forced to be "immutable" - not susceptible to normal
     * sorting behaviour.
     * All other mod behaviours are available however- this container can receive and handle
     * normal loading events
     */
    String getModContainerClass();

    /**
     * Return the class name of an implementor of "IFMLCallHook", that will be run, in the
     * main thread, to perform any additional setup this coremod may require. It will be
     * run <strong>prior</strong> to Minecraft starting, so it CANNOT operate on minecraft
     * itself. The game will deliberately crash if this code is detected to trigger a
     * minecraft class loading
     * TODO: implement crash ;)
     */
    String getSetupClass();

    /**
     * Inject coremod data into this coremod
     * This data includes:
     * "mcLocation" : the location of the minecraft directory,
     * "coremodList" : the list of coremods
     * "coremodLocation" : the file this coremod loaded from,
     */
    void injectData(Map<String, Object> data);

    /**
     * Return an optional access transformer class for this coremod. It will be injected post-deobf
     * so ensure your ATs conform to the new srgnames scheme.
     *
     * @return the name of an access transformer class or null if none is provided
     */
    String getAccessTransformerClass();

    /**
     * Annotate your load plugin with a list of package prefixes that will *not* be
     * processed by the ASM transformation stack.
     * <p>
     * Your plugin, and any transformers should *definitely* be in this list, because
     * otherwise you can face problems with the classloader trying to transform classes
     * with your transformer, whilst it is *loading* your transformer. Not pretty.
     *
     * @author cpw
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface TransformerExclusions {

        String[] value() default "";
    }

    /**
     * Use this to target a specific minecraft version for your coremod. It will refuse to load with an error if
     * minecraft is not this exact version.
     *
     * @author cpw
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface MCVersion {

        String value() default "";
    }

    /**
     * Name this coremod something other than the "short class name"
     *
     * @author cpw
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Name {

        String value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface DependsOn {

        String[] value() default {};
    }

    /**
     * A simple sorting index, interleaved with other tweakers from other sources, as well as FML
     *
     * @author cpw
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface SortingIndex {

        int value() default 0;
    }
}
