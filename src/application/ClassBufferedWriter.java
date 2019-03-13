package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ClassBufferedWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "C:\\Users\\Usuario\\Documents\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
