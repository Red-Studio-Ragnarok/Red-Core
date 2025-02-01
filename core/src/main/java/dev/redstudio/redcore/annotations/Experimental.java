package dev.redstudio.redcore.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/// Indicates that the annotated element is experimental and may change or be removed in future versions.
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
@Retention(RetentionPolicy.SOURCE)
public @interface Experimental {

    String value() default "This feature is experimental and subject to change";
}
