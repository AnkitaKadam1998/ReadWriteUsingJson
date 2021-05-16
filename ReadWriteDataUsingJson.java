package briglabz.Watch_Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class ReadWriteDataUsingJson {
	
public static final String path = "C:\\Users\\Ankita\\eclipse-workspace\\Watch-Service\\Contact.json";
private static Object personobj;
	
	public static void writeJsonData() throws IOException {	
		Contact contactobj = new Contact();
		
		contactobj.setFirstname("Ankita");
		contactobj.setLastname("Kadam");
		contactobj.setCity("Mumabi");
		contactobj.setState("Maharashtra");
		contactobj.setZip("750064");
		contactobj.setphoneNumber("54726382619");
		contactobj.setemail("ankita@gmail.com");
		
		Gson gson = new Gson();
		String json = gson.toJson(personobj);
		
		FileWriter writer = new FileWriter(path);
     	writer.write(json);
	
		writer.close();
		
	}
	
	public static void readJsonData() throws IOException {
		Gson gson = new Gson();
		FileReader reader = new FileReader(path);
		
		Contact contactobj = gson.fromJson(reader, Contact.class);
		
		System.out.println("FirstName: "+contactobj.getFirstname());
		System.out.println("LastName: "+contactobj.getLastname());
		System.out.println("City: "+contactobj.getCity());
		System.out.println("State: "+contactobj.getState());
		System.out.println("ZipCode: "+contactobj.getZip());
		System.out.println("PhoneNumber: "+contactobj.getphoneNumber());
		System.out.println("EmailId: "+contactobj.getemail());
		
		reader.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		writeJsonData();
		readJsonData();
	}

}


