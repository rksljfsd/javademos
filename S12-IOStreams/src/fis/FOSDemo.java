package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) {
		File myfile = new File("C:\\javafsd\\temp\\tESt-outer.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(myfile);
			System.out.println("File successfully opened");
			String data = "hello world";
			fos.write(data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}
	}
}
