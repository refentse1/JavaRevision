package org.example.OOP;

public class Packages_API {
    /**
     * <h1>Packages/API</h1>
     * <p>A package in Java is used to group related classes. It can be thought of as a folder in a file directory</p>
     * <small>Packages are used to avoid name conflicts and to write a better maintainable code</small>
     * <br>
     * <h5>Packages are divided into 2 categories: </h5>
     * <ul>
     *     <li>Build-in Packages(Packages from the Java API</li>
     *     <li>User-defined Packages(create your own packages)</li>
     * </ul>
     * <br>
     * <h2>Built-in Packages</h2>
     * <p>The Java API is a library/package of pre-written classes, that are free to use included in the Java Development Environment</p>
     * <p>We can import the entire package or just the class from a the package</p>
     * <br>
     * <code>
     *     import package.name.ClassName; //This imports a single class.<br>
     *     import package.name.* //This imports the whole package.
     * </code>
     *<br>
     * <p>To add a class to a package we use the package keyword</p>
     * <br>
     * <code>
     *     package mypack;<br>
     *     class MyPackageClass{<br>
     *         MyPackageClass(){}<br>
     *     }
     * </code>
     * <p><strong>This will add the MyPackageClass to the package called mypack</strong></p>
     *
     * <p>If a directory, for this package was not created as of yet, we can save the file and compile it using the java cli commands</p>
     */
    Packages_API(){}
}
