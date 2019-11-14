/*
 * 
 * 
 */
package pointOfSale.MyExceptions;

/**
 *
 * @author root
 */
public class WrongChoiceException extends Exception {
    //My default constructor
    public WrongChoiceException (){
        super ("Meal not in database or wrong login credentials!");
    }
    
    //Parameterized constructor
    public WrongChoiceException (String message){
        super (message);
    }
}