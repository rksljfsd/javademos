package readerwriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\\\javafsd\\\\temp\\\\tESt.txt");
		FileWriter fw = new FileWriter("C:\\\\javafsd\\\\temp\\\\testwriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		int ch;
		while ( (ch = fr.read()) != -1) {
			fw.write(ch);
		}
		System.out.println(fr);
		fr.close();
		fw.close();
	}

}
