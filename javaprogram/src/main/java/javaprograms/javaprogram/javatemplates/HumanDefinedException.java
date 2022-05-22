package javaprograms.javaprogram.javatemplates;
import java.util.*;
/*This user defined exception is defined by Jay. change it according to need.*/
@SuppressWarnings("unused")
public class HumanDefinedException  extends Exception {  
    private static final long serialVersionUID = 746589L;
    /* Calling the constructor of parent class 'Exception' with 'super(string);'*/ 
    public HumanDefinedException (String string){  super(string); }  
}  