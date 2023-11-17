package net.minecraftforge.fml.common;

import net.minecraftforge.fml.relauncher.Side;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mod {

    String modid();

    String name() default "";

    String version() default "";

    String dependencies() default "";

    boolean useMetadata() default false;

    boolean clientSideOnly() default false;

    boolean serverSideOnly() default false;

    String acceptedMinecraftVersions() default "";

    String acceptableRemoteVersions() default "";

    String acceptableSaveVersions() default "";

    String certificateFingerprint() default "";

    String modLanguage() default "java";

    String modLanguageAdapter() default "";

    boolean canBeDeactivated() default false;

    String guiFactory() default "";

    String updateJSON() default "";

    CustomProperty[] customProperties() default {};

    @Retention(RetentionPolicy.RUNTIME)
    @Target({})
    @interface CustomProperty {

        String k();

        String v();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface EventHandler {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface Instance {

        String value() default "";

        String owner() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface Metadata {

        String value() default "";

        String owner() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface InstanceFactory {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface EventBusSubscriber {

        Side[] value() default {Side.CLIENT, Side.SERVER};

        String modid() default "";
    }
}
