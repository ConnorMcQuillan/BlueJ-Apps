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
     * This is the constructor for the student which assigns an object 
     * private variables. Each object created must have a name and ID number
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
     * Enrols the student on the course, later allowing the user to
     * print the students course details.
     * /
     */public void enrol(Course course)
    {
        this.course = course;
    }
    
    /**
     * A method that prints the student's name and ID number to 
     * the output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + " Name: " + name);
    }
    
    /**
     * A method that print the course details after the student has been 
     * enrolled on the course. This method is called from the course class.
     */
    public void printCourse()
    {
        course.print();
    }
}
