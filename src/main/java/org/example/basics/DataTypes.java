package org.example.basics;

/**
 * <p>There are 2 data types:</p>
 * <ul>
 *     <li>Primitive</li>
 *     <li>Non-Primitive</li>
 *  </ul>
 *
 *
 * <h1>Primitive Data Type</h1>
 * <p>Primitive Datatype are those that have a specifies the size and type of variable values, and it has no additional methods</p>
 * <p>Primitive Datatype include:</p>
 * <ul>
 *      <li>byte</li>
 *      <li>short</li>
 *      <li>int</li>
 *      <li>long</li>
 *      <li>float</li>
 *      <li>double</li>
 *      <li>boolean</li>
 *      <li>char</li>
 *</ul>
 *<h1>Non-Primitive Data Types</h1>
 *<p>Non-primitive data types are called reference types, because they refer to objects</p>
 *<p>Non-primitive data types include:</p>
 * <ul><li>Strings</li>
 *  <li>Arrays</li>
 *  <li>Classes</li>
 *  <li>Interface</li>
 * </ul>
 *
 *<p>The difference between the 2 are:</p>
 *<li>Primitive types are predefined, and Non-primitive are created by the programmer(except for the string data type)</li>
 *<li>Non-primitive types can be used to call methods to perform certain operations, while primitive cannot.</li>
 *<li>Primitive Types always has a value and a non-primitive can be null</li>
 * <li>A primitive type starts with a lower case, while a non-primitive starts with an uppercase letter.</li>
 *
 */
public class DataTypes {


    public DataTypes(){

    }
    /**
     * @Description:
     * <p>byte, can store whole numbers from -128 to 127.</p> <p>  It can be used to save memory in an instance that the value will not go beyond this range.
     * </p>
     */
    public byte myByte = 127;

    /**
     * @Description:
     * short, can be used to store whole numbers between -32_768 to 32_767
     */
    public short myShort = 32_456;

    /**
     * @Description:
     * int, can be used to store whole numbers between -2_147_483_648 to 2_147_483_647 (It is the most commonly preferred data type when creating numerical variables)
     */
    public int myInt = 233_435_456;

    /**
     * @Description:
     * long data type can store whole numbers from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
     */
    public long myLong = 233_345_445_678L;

    /**
     * @Description:
     * float, can be used when we write a number with a decimal.Can store numbers with up to seven decimal points
     */
    public float myFloat = 23.44f;

    /**
     * @Description:
     * double, can store a number with a decimal point that is up to 15 digits.
     */
    public double myDouble = 34.05;

    /**
     * @Description:
     * This data type can only take in 2 value, namely true or false
     */
    public boolean myBoolean = true;
    /**
     * @Description: This data type is used to store a single character.
     * <p>The character must be surrounded using single quotes such as 'A'</p>
     */
    public char myCharacter = 'a';
    /**
     * @Description: This data type is used to store a sequence of characters(Text).
     * <p>String values must be surrounded by double quotes</p>
     */
    public String myString = "String is a sequence of characters";

}
