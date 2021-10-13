
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
     * Constructor for objects of class Module which will be stored upon user input
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        creditValue = 0;
    }

    /**
     * The next four methods are setters and getters for the modules instances variables.
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
    
    /**
     * This print method prints the details of a module and also will be called when the course print method is called.
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title + ": " + creditValue);
        System.out.println();
        
    }
    
}
