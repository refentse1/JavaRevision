package org.example.basics;

import org.example.Main;

public class Arrays {
    /**
     * <h1>Arrays</h1>
     * <p>Arrays are used to store multiple variables of the same data type instead of having to create the separate variables for each</p>
     * <p>To declare an array, we declare the variable data type with square brackets</p>
     * <p>We then equate the variable to values that are written within curly braces and separated with a comma</p>
     * <p>
     *
     *     <strong>We can access an array element, by using the element's index<br></strong>
     *     e.g: <br>
     *     int[] numbers = {1,2,3};<br>
     *     System.out.println(numbers[1]);>
     * </p>
     * <br>
     * <p>
     *
     *     <strong>We can also change an array element's value, by using it's index and equating it to the new desired value.<br></strong>
     *     e.g:
     *     <br>  numbers[1] = 5;
     * </p>
     * <p>
     *    <strong> We can also get the length of an array, by using the length property, that belongs to arrays.</strong>
     *     <br>
     *     e.g:
     *     <br>
     *        System.out.println(numbers.length);
     * </p>
     * <br>
     *
     * <h1>Looping through an array using for each</h1>
     * <p>
     *     <strong>for(type variable:arrayname){//code to be executed}</strong>
     * </p>
     */
    Arrays(){}

    /**
     * <h1>Multidimensional Arrays</h1>
     * <p>Arrays that contain other arrays as their value are referred to as multidimensional arrays</p>
     * <p><strong>These forms of arrays are useful, when we want to store data in a table format</strong></p>
     * <p>To create a 2-D array, we add each array into its own set of curly braces and we use 2 square brackets for when we declare the type</p>
     * <br>
     * <p>
     *     <strong>
     *         int [][] myNumbers = {{1,2,3},{4,5,6}};
     *     </strong>
     * </p>
     * <br>
     * <p>To access elements we would need to refer to the row and column in which the element is situated. The first index stands for the row and the second one for the column</p>
     * <p><strong>To loop through the array we also se 2 loops which allows us to loop through the first array(the main one) and the second one loops through the inner arrays</strong></p>
     */
    void multiDimensionalArray(){}

}
