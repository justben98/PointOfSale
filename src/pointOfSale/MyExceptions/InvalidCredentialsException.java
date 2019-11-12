/*
 * 
 * 
 * Date: 7th November, 2019.
 */
package pointOfSale.MyExceptions;

/**
 *
 * @author justech.com
 */
public class InvalidCredentialsException extends Exception {
    //My default constructor
    public InvalidCredentialsException (){
        super ("Invalid username or password!");
    }
    
    //Parameterized constructor
    public InvalidCredentialsException (String message){
        super (message);
    }
}