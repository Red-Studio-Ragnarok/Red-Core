package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
interface VectorVector3Operations<T> extends VectorPrimitiveOperations<T> {

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    T add(final Vector3D vector);

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    T subtract(final Vector3D vector);

    // endregion
    
    // endregion
}
