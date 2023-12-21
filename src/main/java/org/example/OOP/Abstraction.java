package org.example.OOP;

public class Abstraction {
    /**
     * <h1>Abstraction</h1>
     * <p>Data abstraction is the process of hiding certain details and showing only essential information to the user.</p>
     * <p><small>Abstraction can be achieved by the use of abstract classes or interfaces.</small></p>
     * <ul>
     *     <li>
     *         <strong>Abstract Class: is a restricted class that cannot be used to create objects</strong>
     *         <br>
     *         <ul>
     *             <li>
     *                 <small>
     *                     <strong>To access it, it must be inherited from another class.</strong>
     *                 </small>
     *             </li>
     *         </ul>
     *     </li>
     *     <li>
     *         <strong>Abstract Method: can only be used in an abstract class and it does not have a body.</strong>
     *         <br>
     *         <ul>
     *             <li>
     *                 <small>
     *                     <strong>The body is provided by the subclass that inherits from the abstract class</strong>
     *                 </small>
     *             </li>
     *         </ul>
     *     </li>
     * </ul>
     * <br>
     * <p>An abstract class can have both abstract and regular methods</p>
     * <br>
     * <br>
     * <p>
     *     <strong>To create an abstract class we use the Non-Access Modifier `abstract` when defining the class.</strong>
     * </p>
     *<br>
     * <p>If we had to initialize the a value in the constructor/method of the abstract class, we need to do the same for the child class, where by we pass that specific value to the super() method inside of the constructor/method of the subclass</p>
     * <br>
     * @Example:
     * <br>
     * <code>
     *     <strong>
     *         abstract class Person{
     *             String firstname;<br>
     *             public Person(String value){<br>
     *                  this.firstname = value;<br>
     *             }<br>
     *             public abstract void setEmail();<br>
     *         class Student extend Person{
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
    Abstraction(){}
}
