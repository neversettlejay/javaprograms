package javaprograms.javaprogram.javatemplates;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/*
 * 
 * 
 * 
 * @file App.java class' main method of App.java class write:
 *           SerializeAndDeserializeClass serializeAndDeserializeClassObject = new SerializeAndDeserializeClass(101, "This is string to be serialized and deserialized");
 *           SerializeAndDeserializeClass.serialize(serializeAndDeserializeClassObject);
 *           SerializeAndDeserializeClass.deserialize(); 
 *    this will serialize and deserialize your data
 *    modify it the way you want.
 * 
 * 
 * 
 * */

public class SerializeAndDeserializeClass implements java.io.Serializable
{
	
	private static final long serialVersionUID = 746589L;
	/*Below is the code to initialize log object*/
    public static final LogManager logManager = LogManager.getLogManager();
    public static final Logger log = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static String fileName = "serialized-deserialized-data.ser";
    
       /**
         *All the data members to serialize and de-serialize.
         *
         * To serialize and deserialize change the datamembers and code below
         */

    /*below are the data members to serialize*/ 
    public int toSerializeAnInt;
    public String toSerializeAString;
    // Default constructor
    public SerializeAndDeserializeClass(int toSerializeAnInt, String toSerializeAString)
    {
        this.toSerializeAnInt = toSerializeAnInt;
        this.toSerializeAString = toSerializeAString;
    }


    public static void serialize(SerializeAndDeserializeClass serializeAndDeserializeClassObject){
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream fileOutputStream = new FileOutputStream(SerializeAndDeserializeClass.fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            // Method for serialization of object
            objectOutputStream.writeObject(serializeAndDeserializeClassObject);
            objectOutputStream.close();
            fileOutputStream.close();
            log.log(Level.INFO, "Given object has been serialized");
        }
        catch(IOException ex)
        {
            log.log(Level.INFO, "Caught IOException while serializing object");
        }
    }
    
    /*The deserialize methodes does not require any paramenter*/
    public static void deserialize() {
    	SerializeAndDeserializeClass serializeAndDeserializeClassObject= null;
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream fileInputStream = new FileInputStream(SerializeAndDeserializeClass.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            // Method for deserialization of object
            serializeAndDeserializeClassObject = (SerializeAndDeserializeClass)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            log.log(Level.INFO, "Object has been deserialized \n Object Values are:" + "\n a = " + serializeAndDeserializeClassObject.toSerializeAnInt + "\n b = " + serializeAndDeserializeClassObject.toSerializeAString);
        }
        catch(IOException ex)
        {
        	log.log(Level.INFO, "IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
        	log.log(Level.INFO, "ClassNotFoundException is caught");
        }
    	
    }

}


