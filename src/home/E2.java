package home;

import java.io.*;

public class E2 {
	public static void main(String[] args) {
		BufferedReader b1 = null;
		String input = null;
		try {
			b1 = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = b1.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}
