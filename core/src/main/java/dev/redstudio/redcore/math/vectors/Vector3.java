package dev.redstudio.redcore.math.vectors;

/// @author Luna Mira Lage (Desoroxxx)
/// @version 2025-02-01
/// @since 0.6
interface Vector3<T> extends Vector<T> {

    // region Assignment
    /*================================ Assignment ================================*/

    T copy(final Vector3B vector);
    T copy(final Vector3S vector);
    T copy(final Vector3I vector);
    T copy(final Vector3L vector);
    T copy(final Vector3F vector);
    T copy(final Vector3D vector);

    // endregion

    // region Math
    /*================================ Math ================================*/

    // region Addition
    /*================================ Addition ================================*/

    T add(final Vector3B vector);
    T add(final Vector3S vector);
    T add(final Vector3I vector);
    T add(final Vector3L vector);
    T add(final Vector3F vector);
    T add(final Vector3D vector);

    // endregion

    // region Subtraction
    /*================================ Subtraction ================================*/

    T subtract(final Vector3B vector);
    T subtract(final Vector3S vector);
    T subtract(final Vector3I vector);
    T subtract(final Vector3L vector);
    T subtract(final Vector3F vector);
    T subtract(final Vector3D vector);

    // endregion

    // endregion
}
