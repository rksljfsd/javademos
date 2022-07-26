package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("C:\\javafsd\\temp\\emp3.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Employee emp1 = new Employee(3, "Ajay", 50000, 56342);
			
			oos.writeObject(emp1);
			
			System.out.println("Serialized Employee object");
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
