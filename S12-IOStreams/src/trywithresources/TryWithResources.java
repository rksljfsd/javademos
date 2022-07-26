package trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResources {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\\\javafsd\\\\temp\\\\input.txt");
			 BufferedReader br = new BufferedReader(fr);) {
			
			String line;
			int count = 0;
			while ( (line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				count += st.countTokens();
			}
			System.out.println("count of words in the file = " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
}
