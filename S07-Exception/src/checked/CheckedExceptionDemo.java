package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args)  {
		
		CheckedExceptionDemo obj = new CheckedExceptionDemo();
		try {
			obj.readFromFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\temp\\tes.txt");
	}

}
