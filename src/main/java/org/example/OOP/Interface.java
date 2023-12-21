package org.example.OOP;

public class Interface {
    /**
     * <h1>Interface</h1>
     * <p>Interface is a completely abstract class that is used to group related methods with empty bodies.</p>
     * <p><small>
     *     <strong>To access the interface methods, the interface must be "implemented" by another class using the implements keyword. The body of the interface method is provided by the class implementing it.</strong>
     * </small></p>
     *<p>
     *     <small>
     *         <strong>All of the interface methods must be overridden by the classes that implement the methods.</strong>
     *     </small>
     *</p>
     * <p>
     *     <small>
     *         <strong>Interface cannot contain a constructor as it cannot be used to create an object.</strong>
     *     </small>
     *</p>
     * <br>
     * <p><strong>Classes can implement multiple interfaces, by separating them with a comma.</strong></p>
     * <br>
     * @Example:
     * <br>
     * <code>
     *     <strong>
     *         interface Person{<br>
     *             String firstname;<br>
     *             public Person(String value);<br>
     *             public abstract void setEmail();<br>}<br>
     *         class Student implements Person{
     *         long studentNumber;
     *         public Student(String value){
     *             super(value);<br>
     *             this.studentNumber = new Date().hashcode();<br>
     *         }
     *         <br>
     *         `@Override`<br>
     *          public void setEmail(){br>
     *              this.Email = this.studentNumber+"@school.ac.za";<br>
     *          }<br>
     *         }
     *     </strong>
     * </code>
     */
    Interface(){}
}
