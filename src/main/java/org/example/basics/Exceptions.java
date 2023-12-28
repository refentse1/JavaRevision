package org.example.basics;

public class Exceptions {
    /**
     * <h1>Exceptions</h1>
     * <h2>Java Exception Hierarchy</h2>
     * <ul>
     *    <li><strong>Throwable(Parent)</strong></li>
     *    <ul>
     *        <li>
     *            <strong>Errors</strong><br>
     *            Errors, represent irrecoverable conditions, such as JVM running out of memory, memory leaks, stack overflow errors and so on. <br>They are usually beyond programmer's control
     *        </li>
     *    </ul>
     *    <ul>
     *        <li>
     *            <strong>Exception</strong><br>
     *            Exceptions can be caught and handled by a program. When an exception is occurs within a method, it creates an object, this object is called an exception object.<br>
     *            This object contains information about the exception such as the name and description of the exception and state the program when exception occurred.
     *        </li>
     *        <ul>
     *            <li>
     *                <strong>RuntimeException</strong><br>
     *                Runtime exception happens due to a programming error. They are also known as unchecked exceptions.(They are not checked at compile time but runtime)<br>
     *
     *            </li>
     *            <li>
     *                <strong>IOException</strong><br>
     *                IOException is known as a checked exception. They are checked by the compiler at compile-time and the programmer is prompted to handle these exceptions.
     *            </li>
     *        </ul>
     *    </ul>
     * </ul>
     * <br>

     * <p>We use exceptions, to handle any error that will be thrown and cause the program to stop when running.</p>
     * <br>
     * <ul>
     *     <li>
     *         <strong>try:</strong>this block defines the block of code to be tested for errors while it is being executed.
     *     </li>
     *     <li>
     *         <strong>catch:</strong>this block defines the code to be executed, if an error occurs in the try block
     *     </li>
     *     <li>
     *         <strong>finally:</strong>this allows us to execute after the try...catch, regardless of the try...catch results
     *     </li>
     * </ul>
     *
     * <h3>Throw and Throws</h3>
     * <p>
     *     <strong>The throws keyword is used in the method declaration to declare the type of exceptions that might occur.</strong>
     * </p>
     * <p>The throw statement allows us to create a custom error.</p>
     * <p><strong>It is used together with the exception type</strong></p>
     * <p><small>There are many exception types, such as ArithmeticException,FileNotFoundException,SecurityException,RunTimeException,etc</small></p>
     * <p><strong>We can also use the logical OR to check for multiple exceptions, to handle for multiple Exception that might occur in the try block</strong></p>
     * <p>try-with-resources statement automatically, closes all resources at the end of the statement. <br>
     *  A resource is an object tp be closed at the end of a program, such as files/
     * </p>
     * @Example:
     * <br>
     * <code>
     *     int age = 15;<br>
     *     try{
     *         <br>
     *          if(age<18){
     *              <br>
     *              throw new ArithmeticException("AccessDenied - You must be at least 18 years old");
     *              <br>
     *          }else{
     *              <br>
     *              System.out.println("Access granted - You are old enough");
     *              <br>
     *          }
     *     }catch(Exception e){
     *         <br>
     *         System.out.println(e.getMessage());
     *         <br>
     *     }
     *     <br><br>
     *     public static double getNumber throws ArithmeticException(){}
     *     <br><br>
     *     try{}<br>
     *     catch(Exception1 | Exception2){}
     *     <br>
     *     //Try-with-resources
     *     <br>
     *     try(resource declaration(){using the resource}<br>
     *     catch(ExceptionType e){}
     * </code>
     */
    Exceptions(){}
}
