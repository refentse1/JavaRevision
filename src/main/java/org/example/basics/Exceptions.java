package org.example.basics;

public class Exceptions {
    /**
     * <h1>Exceptions</h1>
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
     * <h3>Throw keywords</h3>
     * <p>The throw statement allows us to create a custom error.</p>
     * <p><strong>It is used together with the exception type</strong></p>
     * <p><small>There are many exception types, such as ArithmeticException,FileNotFoundException,SecurityException,RunTimeException,etc</small></p>
     *
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
     * </code>
     */
    Exceptions(){}
}
