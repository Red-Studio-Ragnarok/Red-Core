package dev.redstudio.redcore.math.vectors;

/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
interface Vector2<T> extends Vector<T> {

    // region Assignment
    /*================================ Assignment ================================*/

    T copy(final Vector2B vector);
    T copy(final Vector2S vector);
    T copy(final Vector2I vector);
    T copy(final Vector2L vector);
    T copy(final Vector2F vector);
    T copy(final Vector2D vector);

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    T add(final Vector2B vector);
    T add(final Vector2S vector);
    T add(final Vector2I vector);
    T add(final Vector2L vector);
    T add(final Vector2F vector);
    T add(final Vector2D vector);


    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    T subtract(final Vector2B vector);
    T subtract(final Vector2S vector);
    T subtract(final Vector2I vector);
    T subtract(final Vector2L vector);
    T subtract(final Vector2F vector);
    T subtract(final Vector2D vector);

    // endregion

    // endregion
}
