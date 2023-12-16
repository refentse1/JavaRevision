package org.example.basics;

public class Loops {
    /**
     * <h1>Loops</h1>
     * <p>Loops allow us to repeatedly execute a specific block of code, given that a specific condition is still true</p>
     */
    Loops(){}

    /**
     * <h1><strong>While Loop</strong></h1>
     * <p>The while loop , loops through a block of code as long as a specified condition is true</p>
     * <p>
     *     <strong>When working with a while loop it is important to make sure that we can exit the loop by creating conditions that will help us exit the loop.</strong>
     *     <br>
     *     <strong>Such conditions could be increasing or decreasing the value of the variable used for conditioning the while llo</strong>
     * </p>
     * <p>
     *     <strong>
     *         while(condition){
     *         <br>
     *             //code to be executed <br>
     *         }<br>
     *         e,g
     *         int i = 0;<br>
     *         while(i<5){
     *             <br>
     *             System.out.println(i);<br>
     *             i++;<br>
     *         }
     *     </strong>
     * </p>
     *
     * <h1>do/While Loop</h1>
     * <p>This is similar to the while loop, however it will execute the while loop once before checking if the specified condition is true</p>
     * <p>
     *     <strong>
     *         do{<br>
     *         //code to be executed <br>
     *         }while(condition)
     *     </strong><br>
     *     <strong>
     *         do{
     *             <br>
     *             System.out.println(i);<br>
     *             i++;<br>
     *         }while(i < 5);
     *     </strong>
     * </p>
     */
    void whileLoop(){}

    /**
     * <h1>For Loop</h1>
     * <p>This type of loop is used, when we know the number of times we would want to loop through a block of code.</p>
     * <p>
     *     <strong>
     *         for(statement 1;statement 2; statement 3){//code to be executed}
     *     </strong>
     *     <ul>
     *         <li>Statement 1: This is executed 1 time before the execution of the code block. It is usually used to set the value of the iterator</li>
     *         <li>Statement 2: Defines the condition for executing the code block</li>
     *         <li>Statement 3: This is executed(everytime) after the code block has been executed. It is usually used to change the value of the iterator</li>
     *     </ul>
     *     <br>e.g:
     *     <br>
     *     for(int i = 0;i<5;i++){ <br>System.out.println(i);<br>}
     * </p>
     * <br><br>
     * <h1>Foreach Loop</h1>
     * <p>This form of loop is used to loop through elements in an collection such as an array.</p>
     * <p>
     *     <strong>
     *         int[] numbers = {1,2,3,4,5};<br>
     *         for(in i: numbers){<br>System.out.println;<br>}
     *     </strong>
     * </p>
     */
    void forLoop(){}

    /**
     * <h1>Break and Continue</h1>
     * <br>
     * <h1>Break</h1>
     * <p>The break statement is used to jump out of a loop when a certain condition has been met</p>
     * <br>
     * <h1>Continue</h1>
     * <p>The continue statement is used to skip to the next iteration when a certain condition is met</p>
     */
    void BreakContinue(){}

}
