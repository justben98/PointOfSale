/*
 * Here is my exceptions' class defination
 * 
 * Date 6th Nov, 2019.
 */
package pointOfSale.MyExceptions;

/**
 *
 * @author justech.com
 */
public class InSufficientBalException extends Exception {
    //My default constructor
    public InSufficientBalException (){
        super ("Sorry, your account Balance is insufficient!");
    }
    
    //Parameterized constructor
    public InSufficientBalException (String message){
        super (message);
    }
}