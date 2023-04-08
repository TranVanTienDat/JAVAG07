package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Person {
	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\sinhvien.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String s = scanner.nextLine();
				System.out.println((s));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
