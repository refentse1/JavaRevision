package org.example.DataStructures.Lists;

public class Vector {
    /**
     * <h1>Vector</h1>
     * <p>Vector, implements the List interface, however the Vector class synchronizes each individual operation</p>
     * <p>
     *     <strong>This means that whenever we want to perform operation on vectors, the Vector class automatically applies a lock to that operation</strong>
     * </p>
     * <p>
     *     <small>
     *         <strong>This means when one thread is accessing a vector and at the same time another thread tries to access it,
     *         an exception is generated.
     *         <br>
     *         This continuous use of lock for each operation makes vectors less efficient.
     *         </strong>
     *     </small>
     * </p>
     *
     */
    public Vector(){}
}
