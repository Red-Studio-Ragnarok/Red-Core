package dev.redstudio.redcore.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/// Indicates that the annotated element is deprecated and will be removed in the future.
///
/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-23
/// @since 0.7
@Retention(RetentionPolicy.SOURCE)
public @interface RedDeprecated {

    String value() default "This feature is deprecated and will be removed in the future";

    /// @return The version in which the element was marked as deprecated.
    String since();

    /// @return The version in which the element will be removed.
    String forRemovalIn();
}
