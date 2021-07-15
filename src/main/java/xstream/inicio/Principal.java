package xstream.inicio;

import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

import xstream.entity.Person;
import xstream.entity.PhoneNumber;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XStream xstream = new XStream();
		
		xstream.alias("person", Person.class);
		xstream.alias("phonenumber", PhoneNumber.class);
		
		Person joe = new Person("Joe", "Walnes");
		joe.setPhone(new PhoneNumber(123, "1234-456"));
		joe.setFax(new PhoneNumber(123, "9999-999"));
		
		String xml = xstream.toXML(joe);
		
		try {
		      FileWriter myWriter = new FileWriter("filename.xml");
		      myWriter.write(xml);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
