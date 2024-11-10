package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
interface VectorPrimitiveOperations<T> {

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
