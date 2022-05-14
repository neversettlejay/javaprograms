package javaprograms.javaprogram;
import javaprograms.javaprogram.javatemplates.*;
import java.util.*;
import java.util.logging.Logger;
import java.io.*;
import java.util.logging.*;
/**
* The JavaProgram template implements an application that
* serializes and deserializes one int and one string dummy data,
* Throws user defined exception.
*
* @author  Jay Rathod
* @version 1.0
* @since   2022-05-13 
* @see main
}
* 
*/



/* ****************Main class************** */
public class App extends Thread {
	

              
       
	static {Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO,  "Start of the " +Thread.currentThread().getName() + "thread.");}

    public static final Logger log = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    
     public static final long serialVersionUID = 746589L;
     
     

    
    
    public static void main(String[] args) throws Exception{
    	
        
    	
    	
    	try
        {   /**
            * <h1>Write your code from here</h1>
            *****************************************************/
    	     throw new HumanDefinedException("That is a human defined exception");
            /****************************************************
            * <h1>End your code from here</h1>
            */
        }  
        catch (HumanDefinedException humanDefinedException)  
        {  
            log.log(Level.INFO,"Exception occured: " + humanDefinedException);
        }  
        finally
        {
            /*log.log(Level.INFO,"no use of finally right now");*/
        }
   
    	
    	
    	log.log(Level.INFO, "End of the " +Thread.currentThread().getName() + " method.");
    }       
}



