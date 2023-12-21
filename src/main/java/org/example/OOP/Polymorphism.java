package org.example.OOP;

public class Polymorphism {
    /**
     * <h1>Polymorphism</h1>
     * <p>The concept of polymorphism deals, with numerous classes inheriting from one parent class, but being able to implement the parent's class's method differently by overriding the methods.</p>
     * <p>We can use the Java @override annotation, to show that we want to override a method from the class we are inheriting from</p>
     * <p>If the Override annotation is used, we then have to define the method exactly as in the parent clas,, meaning if one passes the parameter, the method definition in the subclass need to have a parameter, however if the annotation is not specified we do not need the parameter.</p>
     *<br>
     * @Example:
     * <br>
     * <code>
     *     <strong>
     *         class Person{
     *             String firstname;<br>
     *             public void setEmail(String value){<br>
     *                  this.firstname = value;<br>
     *             }<br>
     *         }<br>
     *         class Student extend Person{
     *         <br>
     *      `@Override`<br>
     *          public void setEmail(String value){br>
     *              super.setEmail(this.studentNumber+"@school.ac.za");<br>
     *          }<br>
     *         }
     *     </strong>
     * </code>
     */
    Polymorphism(){}
}
