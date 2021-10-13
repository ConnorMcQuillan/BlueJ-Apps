/**
 * The Student class contains essential information that identifies 
 * a student at BNU.  The class also contains information 
 * concerning the course the student is currently enrolled on
 * 
 * @author Michael Kölling and David Barnes
 * @modified by Connor McQuillan
 * @version 1.0 01/10/2021
 */
public class Student
{
    // A unique 8 digit BNU identifier
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    
    /**
     * This is the constructor for the student which assigns an ojbect private variables.
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

     /**
     * Return the student ID of this student.
     */
    public int getID()
    {
        return id;
    }

    /**
     * Enrols the student on the course, allowing the print the students course details.
     * /
     */public void enrol(Course course)
    {
        this.course = course;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + " Name: " + name);
    }
    
    /**
     * Print the course details
     */
    public void printCourse()
    {
        course.print();
    }
}
