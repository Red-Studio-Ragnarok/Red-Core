package dev.redstudio.redcore.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated element is experimental and may change or be removed in future versions.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Experimental {

    String value() default "This feature is experimental and subject to change";
}
