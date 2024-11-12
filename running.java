import java.awt.Color;
import java.awt.color.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class running{
    Color vsBlue = new Color(0,0,0);
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("So we use a coding language called Java. Java looks like this:\n public class running{\r\n" + //
                        "    public static void main(String[] args) {\r\n" + //
                        "        System.out.println(\"So we use a coding language called Java\\n" + //
                        " Java looks like this \");\r\n" + //
                        "    }\r\n" + //
                        "}");
        System.out.println("If you have an good idea on what this ^ means let a lead know\n\nGeneral Programming Terms :");
        
        System.out.println("IDE/Text Editor - Integrated Development Engine - Applications used to write, test, run, and debug code. One of the most popular free IDE's is Visual Studio Code.\nJDK - Java Development Kit - An extension package for Java developers that allows us to run code by providing us necessary tools to compile and execute java code.\r\n" + //
                        "VSCode - Visual Studio Code - A downloadable IDE/Text Editor that we will use everywhere\r\n" + //
                        "Replit - Online Text Editor with a Runtime Environment - Essentially VSCode on the cloud/web but has limitations like not being able to use specific FRC libraries and tools.\r\n" + //
                        "Repls - Replit’s form of a Project - Create a Repl in Replit to write your project\r\n" + //
                        "Github - A Online Source Control Application - Lets you upload your code and access others people project (ie: download others project to edit on your own)");
        System.out.println("\nVariables : \r\n" + //
                        "What are Variables?\r\n" + //
                        "In Java, a variable is like a container that holds data. Just like you might have a jar to hold cookies or a box to hold toys, a variable holds information that your program needs to work with. Instead of using fixed values, we can use variables to store and manipulate data. Think of a variable as a reference to an item that exists in the world that can hold values. Now because of the strongly typed restriction attached to Java, you will need to explicitly declare the datatype of the value you are attaching to a variable.\n\r\n" + //
                        "Types of Java Variables\r\n" + //
                        "In Java, there are primarily 2 types of variables: Primitive and Reference variables\r\n" + //
                        "Primitive Variables: These are basic types of variables that hold simple values like Integers or Single Characters.\r\n" + //
                        "Reference Variables: These are more complex types of items such as Strings.\n\r\n" + //
                        "How do you Declare Variables?\r\n" + //
                        "To use a variable in Java, you first need to declare it. This means you're telling Java  strictly the datatype of information the variable will hold and giving it a name.\r\n" + //
                        "Notice how we write down the datatype prior to the variable name before assigning a value to that token with an “=” sign.");
        System.out.println("\nExample : \n    int age = 25;\r\n" + //
                        "    char grade = 'A';\r\n" + //
                        "    String name = \"John\";\r\n" + //
                        "    double price = 19.99;\r\n" + //
                        "    boolean is_Apple = true;");
        
    }
}