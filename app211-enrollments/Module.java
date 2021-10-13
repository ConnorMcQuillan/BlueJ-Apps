
/**
 * This class contaisn the variables to store the module values and methods to retrieve and set them values.
 *
 * @author Connor McQuillan
 * @version 1.0 01/10/2021
 */
public class Module
{
    // instance variables - variables to store the code, title and credit 
    // value of the module
    private String code;
    private String title;
    private int creditValue;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables - when a certain variable is called
        // it will return a particular objects data
        this.code = code;
        this.title = title;
        creditValue = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCode()
    {
        return this.code;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getCreditValue()
    {
        return this.creditValue;
    }
    
    public void setCreditValue(int value)
    {
        this.creditValue = value;
    }
    
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title + ": " + creditValue);
        System.out.println();
        
    }
    
}
