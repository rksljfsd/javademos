package printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("C:\\javafsd\\temp\\input.txt", true);
			pw = new PrintWriter(fw);
			
			pw.println("some new text is being added");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
