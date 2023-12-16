package org.example.basics;

public class Methods {
    /**
     * <h1>Methods/Functions</h1>
     * <p>A method is block of code that runs only after being called. It allows us to reuse blocks of codes</p>
     * <p>A method must be created within a class. <br>We write the method name followed by parentheses</p>
     * <p>
     *     <strong>
     *         public class Main {
     *   static void myMethod() {
     *     // code to be executed
     *   }
     * }
     *     </strong>
     * </p>
     * <br>
     * <ul>
     *     <li>static: means that the method belongs to the main class and not an object of the main class.</li>
     * </ul>
     * <br>
     * <p>
     *     A method is created in this manner:<br>
     *     <strong>
     *         <accessModifier> <nonAccessModifiers(optional to include)> <returnType> <methodName>(DataType parameter1,DataType parameter2){}
     *     </strong>
     *     <br>
     * </p>
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
    Methods(){}
}
