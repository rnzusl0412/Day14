package home;

import java.io.*;

class B {
	@SuppressWarnings("resource")
	void run() throws FileNotFoundException, IOException {
		BufferedReader b1 = null;
		String input = null;
		b1 = new BufferedReader(new FileReader("out.txt"));
		input = b1.readLine();
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();

		b.run();

	}
}

public class E3 {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
