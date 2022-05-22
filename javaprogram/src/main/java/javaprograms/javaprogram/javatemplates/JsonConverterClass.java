package javaprograms.javaprogram.javatemplates;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/*
 * 
 * 
 * 
 * @file App.java class' main method of App.java class write:
 *    JsonConverterClass.convertToJsonData(); 
 *    this will convert the below data to json
 *    modify it the way you want.
 * 
 * 
 * 
 * */
public class JsonConverterClass {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void convertToJsonData() throws FileNotFoundException {
    	JSONObject job = new JSONObject();
    	// Adding data using the created object
    	job.put("fName", "Shobha");
    	job.put("lName", "Shivakumar");
    	job.put("age1", 28);
    	// LinkedHashMap is created for address data
    	Map m1 = new LinkedHashMap(4);
    	m1.put("streetAdd", "4, Ibbani Street");
    	m1.put("city1", "Bangalore");
    	m1.put("state1", "Karnataka");
    	m1.put("pinCode", 560064);
    	// adding address to the created JSON object
    	job.put("address1", m1);
    	// JSONArray is created to add the phone numbers
    	JSONArray jab = new JSONArray();
    	m1 = new LinkedHashMap(2);
    	m1.put("type1", "home1");
    	m1.put("no", "9738128018");
    	// adding map to list
    	jab.add(m1);
    	m1 = new LinkedHashMap(2);
    	m1.put("type2", "fax1");
    	m1.put("no1", "6366182095");
    	// map is added to the list
    	jab.add(m1);
    	// adding phone numbers to the created JSON object
    	job.put("phoneNos", jab);
    	// the JSON data is written into the file
    	PrintWriter pwt = new PrintWriter("jsonConvertedObjectStored.json");
    	pwt.write(job.toJSONString());
    	pwt.flush();
    	pwt.close();
    }
}
