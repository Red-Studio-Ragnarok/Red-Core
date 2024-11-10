package dev.redstudio.redcore.math.vectors;

import dev.redstudio.redcore.annotations.Experimental;

@Experimental
@SuppressWarnings("unused")
interface VectorVector3Operations<T> extends VectorPrimitiveOperations<T> {

    // region Assignment
    /*================================ Assignment ================================*/

    T copy(final Vector3F vector);
    T copy(final Vector3D vector);

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    T add(final Vector3D vector);
    T add(final Vector3F vector);

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    T subtract(final Vector3F vector);
    T subtract(final Vector3D vector);

    // endregion
    
    // endregion
}
