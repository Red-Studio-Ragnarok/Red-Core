package cpw.mods.fml.relauncher;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@SuppressWarnings({"unused", "UnnecessaryModifier"})
public interface IFMLLoadingPlugin {

    String[] getASMTransformerClass();

    String getModContainerClass();


    String getSetupClass();

    void injectData(Map<String, Object> data);

    String getAccessTransformerClass();

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface TransformerExclusions {

        public String[] value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface MCVersion {

        public String value() default "";
    }


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface Name {

        public String value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface DependsOn {

        public String[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface SortingIndex {

        public int value() default 0;
    }

}
