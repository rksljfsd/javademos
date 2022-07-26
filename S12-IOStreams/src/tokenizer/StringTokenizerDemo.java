package tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		stringToTokens("When life gives you lemons, make lemonade.", " ");
		
		stringToTokens("When,life,gives,you,lemons,make,lemonade.", ",");
		
		stringToTokens("When-life-gives-you-lemons-make-lemonade.", "-");
		
	}

	private static void stringToTokens(String stmt, String delim) {
		StringTokenizer st = new StringTokenizer(stmt, delim);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("--------------------------");
	}
	
}
