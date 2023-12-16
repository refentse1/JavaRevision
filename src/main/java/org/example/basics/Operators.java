package org.example.basics;

public class Operators {
     /**
     *<p>Operators are used to perform operations on variables and values</p>
     *<p>Java has the following operators group:</p>
     *<ul>
     *     <li>Arithmetic Operators</li>
     *     <li>Assignment Operators</li>
     *     <li>Comparison Operators</li>
     *     <li>Logical Operators</li>
     *     <li>Bitwise Operators</li>
     *</ul>
     */
    Operators(){}
    /**
    * <h1>Arithmetic Operators</h1>
    * <p>Arithmetic operators are used to perform common mathematical operation</p>
    * <ul>
    *     <li>
    *         <strong>Addition:</strong>
    *         <p>This uses the + sign.</p>
    *         <p>It is used to add together.</p>
    *         <strong>x+y</strong>
    *     </li>
    *     <li>
    *         <strong>Subtraction:</strong>
    *         <p>This uses the - sign.</p>
    *         <p>It is used to subtract one value from another.</p>
    *        <strong>x-y</strong>
    *     </li>
    *     <li>
    *         <strong>Multiplication:</strong>
    *         <p>This uses the * sign.</p>
    *        <p>It is used to multiply values.</p>
    *        <strong>x*y</strong>
    *     </li>
    *     <li>
    *         <strong>Division:</strong>
    *         <p>This uses the / sign.</p>
    *         <p>Divides one value by another.</p>
    *         <strong>x/y</strong>
    *     </li>
    *     <li>
    *         <strong>Modulus:</strong>
    *         <p>This uses the % sign.</p>
    *         <p>This returns the division remainder.</p>
    *         <strong>x%y</strong>
    *     </li>
    *     <li>
    *         <strong>Increment:</strong>
    *         <p>This uses the ++ sign.</p>
    *         <p>This increases a value of a variable by 1.</p>
    *         <strong>x++</strong>
    *     </li>
    *     <li>
    *         <strong>Decrement:</strong>
    *         <p>This uses the -- sign.</p>
    *         <p>This decreases the value of a variable by 1.</p>
    *         <strong>y--</strong>
    *     </li>
    * </ul>
    */
    void ArithMeticOperators(){}
    /**
     * <h1>Assignment Operators</h1>
     * <p>Assignment Operators are used to assign values to variables.</p>
     * <ul>
     *     <li>
     *         <strong>Assign/Equate</strong>
     *         <p>This uses the = sign.</p>
     *         <p>It is used to assign or equate a value to a variable</p>
     *         <strong>int x = 3;</strong>
     *     </li>
     *     <li>
     *         <strong>Addition Assignment</strong>
     *         <p>This uses the =+ sign.</p>
     *         <p>It is used to add a value to a variable</p>
     *         <p><strong>x+=1;</strong></p>
     *         <small>The example is similar to saying x = x + 1</small>
     *     </li>
     *     <li>
     *         <p><strong>Subtraction Assignment</strong></p>
     *         <p>It is used to subtract a value from a variable</p>
     *         <p><strong>x-=1;</strong></p>
     *         <small>The example is similar to saying x = x - 1</small>
     *     </li>
     *     <li>
     *         <p><strong>Multiplication Assignment</strong></p>
     *         <p>It is used to multiply a variable by a value</p>
     *         <p><strong>x*=1;</strong></p>
     *         <small>The example is similar to saying x = x * 1</small>
     *     </li>
     *     <li>
     *         <p><strong>Division Assignment</strong></p>
     *         <p>It is used to divides a variable by a value</p>
     *         <p><strong>x/=1;</strong></p>
     *         <small>The example is similar to saying x = x / 1</small>
     *     </li>
     *     <li>
     *         <p><strong>Modulus Assignment</strong></p>
     *         <p>It is used to get the remainder of a value divided from a variable</p>
     *         <p><strong>x%=1;</strong></p>
     *         <small>The example is similar to saying x = x % 1</small>
     *     </li>
     *     <li>
     *         <p><strong>Exponent Assignment</strong></p>
     *         <p>It is used to raise a variable to the power of a value</p>
     *         <p><strong>x^=1;</strong></p>
     *         <small>The example is similar to saying x = x ^ 1</small>
     *     </li>
     * </ul>
     */
    void AssignmentOperators(){}

    /**
     * <h1>Comparison Operator</h1>
     * <p>Comparison Operators are used to compare 2 values.</p>
     * <p><small>The return value of the comparison is a boolean value. It is either true or false.</small></p>
     * <ul>
     *     <li>
     *         <p><strong>Equal to:</strong></p>
     *         <p>This uses the == sign.</p>
     *         <p>It is used to check if one value is equivalent to another</p>
     *         <p><strong>x==y</strong></p>
     *         <p><small>This checks if x is equivalent to y</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Not Equal:</strong></p>
     *         <p>This uses the != sign.</p>
     *         <p>It is used to check if one value is not equivalent to another</p>
     *         <p><strong>x!=y</strong></p>
     *         <p><small>This checks if x is not equivalent to y</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Greater than:</strong></p>
     *         <p>This uses the > sign.</p>
     *         <p>It is used to check if one value is greater than another</p>
     *         <p><strong>x>y</strong></p>
     *         <p><small>This checks if x is grater than y</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Less than:</strong></p>
     *         <p>This uses the < sign.</p>
     *         <p>It is used to check if one value is less than another</p>
     *         <p><strong>x<y</strong></p>
     *         <p><small>This checks if x is less than y</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Greater than or Equal to:</strong></p>
     *         <p>This uses the >= sign.</p>
     *         <p>It is used to check if one value is greater than or equivalent to another</p>
     *         <p><strong>x>=y</strong></p>
     *         <p><small>This checks if x is greater than or equivalent to y</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Less than or Equal to:</strong></p>
     *         <p>This uses the <= sign.</p>
     *         <p>It is used to check if one value is less than or equivalent to another</p>
     *         <p><strong>x<=y</strong></p>
     *         <p><small>This checks if x is less than or equivalent to y</small></p>
     *     </li>
     * </ul>
     */
    void ComparisonOperators(){}

    /**
     * <h1>Logical Operators</h1>
     * <p>They are used to test for true or false values. They determine the logic between 2 values</p>
     * <ul>
     *     <li>
     *         <p><strong>Logical and: </strong></p>
     *         <p>This uses the && sign.</p>
     *         <p>This returns true if both statements are true</p>
     *         <p><strong>x< 5 && x < 10</strong></p>
     *         <p><small>This will return true if x is less than 5 and also less than 10</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Logical or: </strong></p>
     *         <p>This uses the || sign.</p>
     *         <p>This returns true if one statements is true</p>
     *         <p><strong>x< 5 || x > 10</strong></p>
     *         <p><small>This will return true if x is less than 5 or  greater than 10</small></p>
     *     </li>
     *     <li>
     *         <p><strong>Logical not: </strong></p>
     *         <p>This uses the ! sign.</p>
     *         <p>This reverses the results. If the results were true it will turn them false</p>
     *         <p><strong>!(x< 5 && x < 10)</strong></p>
     *         <p><small>This will return false if x is less than 5 and also less than 10</small></p>
     *     </li>
     * </ul>
     */
    void LogicalOperators(){}

}
