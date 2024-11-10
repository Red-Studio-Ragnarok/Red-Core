package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
interface VectorVector2Operations<T> extends VectorPrimitiveOperations<T> {

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    T add(final Vector2D vector);

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    T subtract(final Vector2D vector);

    // endregion

    // endregion
}
