package dev.redstudio.redcore.math.vectors;

/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
interface Vector<T> {

    // region Math
    /*================================ Math ================================*/

    // region Multiplication
    /*================================ Multiplication ================================*/

    T multiply(final byte scalar);
    T multiply(final short scalar);
    T multiply(final int scalar);
    T multiply(final long scalar);
    T multiply(final float scalar);
    T multiply(final double scalar);

    // endregion

    // region Division
    /*================================ Division ================================*/

    T divide(final byte scalar);
    T divide(final short scalar);
    T divide(final int scalar);
    T divide(final long scalar);
    T divide(final float scalar);
    T divide(final double scalar);

    // endregion

    //endregion
}
