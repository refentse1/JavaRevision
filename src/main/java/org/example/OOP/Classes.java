package org.example.OOP;

public class Classes {
    /**
     * <h1>OOP</h1>
     *
     * <p>Procedural programming is about writing procedures or methods tha perform operations on data, while object oriented programming is about creating objects that contain both data and methods.</p>
     *
     * <h3>OOP Advantages:</h3>
     * <ul>
     *     <li>
     *         It provides a clear structure for the programs.
     *     </li>
     *     <li>
     *         Helps keep the Java code DRY (Don't Repeat yourself),and makes the code easy to maintain, modify and debug.
     *     </li>
     *     <li>
     *         Makes it possible to create full reusable applications with less code and shorter development time.
     *     </li>
     * </ul>
     *
     * <p><strong>Classes are templates for objects and an object is an instance of a class.</strong></p>
     * <p>Objects created from classes, inherit all variables and methods from that class.</p>
     *
     * <p>To create a class, the keyword class is used, followed by the class name.</p>
     * <small>Class Names start with a capital letter</small>
     * <br>
     * <code>
     *     <strong>
     *         accessModifier class ClassName{
     *         }
     *     </strong>
     * </code>
     * <br>
     * <p>To create an object of the class we use this template:</p>
     * <br>
     * <code>
     *     <strong>className objectName = new className();</strong>
     * </code>
     * <br>
     * <p>Arguments, can be passed to the className() constructor if when defining the class, it was specified the constructor will take in parameters</p>
     * <br>
     *<p>Class variables are known as class attributes.<br><small>Another term for attributes is fields.</small></p>
     * <p>Attributes can be accessed by using the dot notation, whereby we create an object of the class, call the object name add a dot after that and write the field name.</p>
     * <br>
     * <code>
     *     <strong>
     *         MyClass myObj = new MyClass();
     *         <br>
     *         System.out.println(myObj.myAttribute);
     *     </strong>
     * </code>
     *<br>
     *
     *
     * <h3>Class Access Modifiers</h3>
     * <ul>
     *     <li>
     *         <strong>public:</strong>This means the class is accessible in any other class.
     *     </li>
     *     <li>
     *         <strong>default:</strong>The class will only be accessible by classes in the same package as it.
     *     </li>
     * </ul>
     * <br>
     * <h3>Class Non-Access Modifiers</h3>
     * <ul>
     *     <li>
     *         <strong>final:</strong>The class cannot be inherited by another class.
     *     </li>
     *     <li>
     *         <strong>abstract:</strong>The class cannot be used to create objects.
     *     </li>
     * </ul>
     *<br>
     * <h1>Method Access Modifiers</h1>
     * <ul>
     *     <li>
     *         <strong>public:</strong>The method can be accessed for all classes
     *     </li>
     *     <li>
     *         <strong>private:</strong>The method can only be accessed within the class it was declared in
     *     </li>
     *     <li>
     *         <strong>default:</strong>The method will only be accessible in the same package.It is used when a modifier is not specified
     *     </li>
     *     <li>
     *         <strong>protected:</strong>The method will only be accessible in the same package and subclasses
     *     </li>
     * </ul>
     * <br>
     * <h1>Method Non-Access Modifiers</h1>
     * <ul>
     *     <li>
     *         <strong>final:</strong>The method cannot be overridden/modified
     *     </li>
     *     <li>
     *         <strong>static:</strong>This will belong to the class, rather than an object
     *     </li>
     *     <li>
     *         <strong>abstract:</strong>This can only be used in an abstract class. The defined method does not have a body.
     *     </li>
     *     <li>
     *         <strong>transient:</strong>The methods are skipped, when serializing the object containing them
     *     </li>
     *     <li>
     *         <strong>synchronized:</strong>The method can only be accessed by one thread at a time
     *     </li>
     * </ul>
     *
     * @Example:
     * <br>
     *<code> public static myMethod(String word1,String word2){
     *     //code here
     *}</code>
     */
    Classes(){}
}
