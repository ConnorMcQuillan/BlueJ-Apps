import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of student who are enrolled
 *
 * @author Derek Peacock
 * @modified by Connor McQuillan
 * @version 2.0 01/10/2021
 */
public class Course
{
    // A unique identifier e.g. BT1CTG1
    private String code;
    // The full title including qualification and subject
    private String title;
    // The course must have a module 
    private Module module;
    
    /**
     * This is a constructor which will require a code and title variable
     * for the course
     */
    public Course(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    /**
     * Adds a module to the course class, to later be able to print the module
     * details attached to the course.
     */
    public void addModule(Module module)
    {
        this.module = module;
    }
    
    /**
     * Print the details of the course and later on when a module is added, 
     * can print module details
     */
    public void print()
    {
        printHeading();
        
        System.out.println(" Course Code: " + code + ": " + title);
        System.out.println();
        module.print();
    }
    
    /**
     * Print out a heading for the course and module details.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Course Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
