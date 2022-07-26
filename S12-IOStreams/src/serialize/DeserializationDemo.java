package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\javafsd\\temp\\emp3.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Employee emp1 = (Employee) ois.readObject();
			
			System.out.println("Employee object Deserialized");
			
			System.out.println(emp1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
