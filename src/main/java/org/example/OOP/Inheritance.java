package org.example.OOP;

public class Inheritance {
    /**
     * <h1>Inheritance</h1>
     * <p>Inheritance is the concept of inheriting or passing attributes and methods from one class to another.</p>
     * <p>Inheritance is grouped into 2 categories:</p>
     * <ul>
     *     <li>
     *         <strong>subclass(child):</strong> the class that inherits from another class.
     *     </li>
     *     <li>
     *         <strong>superclass(parent):</strong> the class that is being inherited from
     *     </li>
     * </ul>
     * <br>
     * <p>
     *     <strong>To inherit from a class when you create a class you use the extends keyword.</strong>
     * </p>
     * <br>
     * <p><strong>The final keyword can be used on a class to make it that other classes cannot inherit from it</strong></p><br>
     * <p>When implementing a class using an interface, the class must implement all of the methods and override them. The bodies will be written in this class.</p>
     * @Example:
     * <br>
     * <code>
     *     <strong>
     *         class Person{
     *             String firstname;<br>
     *             public void setFirstName(String value){<br>
     *                  this.firstname = value;<br>
     *             }<br>
     *             public String getFirstName(){<br>
     *                  return this.firstname;
     *             <br>}<br>
     *         }<br>
     *         class Student extend Person{
     *             <br>
     *             String studentNumber;<br>
     *         }
     *     </strong>
     * </code>
     * <br><br>
     * <small>
     *     <strong>
     *         The example above has a class person, and another class called student, the student class inherits from the Person, class. This is shown by the use of the `extends` keyword.<br>
     *         This would mean the student class will have all the fields and methods, that belong to the person class and any additional methods that are declared in it.
     *     </strong>
     * </small>
     * <br>
     */
    public Inheritance(){}

}
