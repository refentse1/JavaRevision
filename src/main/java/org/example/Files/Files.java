package org.example.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    File file ;
    /**
     * <h1>File Handling</h1>
     * <p>The file class from the java.io package allows us to work with files.</p>
     * <p>To work with files we create an instance of the File class and pass the path to the file in the constructor</p>
     * <h3>Useful methods from the File class:</h3>
     * <ul>
     *     <li>
     *         <strong>canRead()</strong>, tests whether a file is readable or not.
     *     </li>
     *     <li>
     *         <strong>canWrite()</strong>, tests whether the file is writable or not
     *     </li>
     *     <li>
     *         <strong>createNeFile()</strong>,creates an empty file
     *     </li>
     *     <li>
     *         <strong>delete()</strong>, deletes a file
     *     </li>
     *     <li>
     *         <strong>getName()</strong>, returns the name of the file
     *     </li>
     *     <li>
     *         <strong>getAbsolutePath()</strong>, returns the absolute path to the file
     *     </li>
     *     <li>
     *         <strong>length()</strong>, returns the size of file in bytes
     *     </li>
     *     <li>
     *         <strong>list()</strong>, returns an array of the files in the directory.
     *     </li>
     *     <li>
     *         <strong>mkdir()</strong>, creates a directory
     *     </li>
     * </ul>
     */
    public Files(){ }

    /**
     *
     * <h1>Creating a file</h1>
     * <p>To create a file we can use the createNewFile() method.</p>
     * <p><small>The method returns a boolean value, being true if the file was successfully created and false if the file exists.</small></p>
     * <p><small><strong>The method should be enclosed in a try...catch, this is because it throws an IOException if an error occurs</strong></small></p>
     *
     *
     */
    public void createFile (String name){
        file = new File("./"+name+".txt");
        try{
            if(file.createNewFile()){
                System.out.print("File created successfully");
            }else{
                throw new IOException("Error creating file: "+file.getName());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * <h1>Write to a file</h1>
     * <p>To write to a file the FileWriter class is used together with its write() method, to write text to the file that was created</p>
     * <p>The file will then have to be closed after being written to, this allows other programs to access it.</p>
     * <p>
     *     <strong>We firstly create an instance of the file writer then pass the content or the text as an argument to the constructor used to create a filewriter instance</strong>
     * </p>
     */
    public void writeFile(String content){
        try {
            FileWriter fileWriter = new FileWriter("files.txt");
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully wrote to file.");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * <h1>Reading a file</h1>
     * <p>We can use the Scanner class to read the contents of a file.</p>
     * <p>The instance of the File class is passed to the Scanner constructor.</p>
     * <p>
     *     <strong>From here we have to iterate through the content of the file. We can use the while loop where the condition is to check if the file still has a next line by using the method hasNextLine()</strong>
     * </p>
     * <p>We then get each line by using the scanner nextLine() method.</p>
     *
     */
    public void readFile(){
        try{
//            System.out.print(file.getName());
            Scanner myReader = new Scanner(this.file);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println("Data from file:\n"+data);
            }
        }catch (FileNotFoundException e){
            System.out.print(e.getMessage());
        }
    }


    public File getFile(){
        return this.file;
    }


}