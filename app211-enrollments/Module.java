
/**
 * Write a description of class Module here.
 *
 * @author Connor McQuillan
 * @version 1.0
 */
public class Module
{
    // instance variables - variables to store the code, title and credit 
    // value of the module
    private String code;
    private String title;
    private int value;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title, int value)
    {
        // initialise instance variables - when a certain variable is called
        // it will return a particular objects data
        this.code = code;
        this.title = title;
        this.value = value;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCode()
    {
        return code;
    }
    public String getTitle()
    {
        return title;
    }
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
    
    public void print()
    {
        System.out.println("Module Code: " + code);
        System.out.println("Module Title: " + title);
        System.out.println("Credit Value: " + value);
    }
}
