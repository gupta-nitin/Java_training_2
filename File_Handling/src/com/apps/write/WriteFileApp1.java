package com.apps.write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class WriteFileApp1 {

	static String data ;

	public static void main(String[] args) {
		WriteFileApp1 app1 = new WriteFileApp1();
		app1.writeFile("output/student_out.txt");
	}

	public void writeFile(String relativePath) {
		
		System.out.println("Please enter data to write..");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(relativePath);) {
			
			System.out.println("Starting file writing...." + data);
			fileOutputStream.write(data.getBytes());
			
			System.out.println("File Writteen success");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readFile(String relativeFilePath) {
		try {
			RandomAccessFile accessFile = new RandomAccessFile(relativeFilePath, "r");
			String line = null;
			while ((line = accessFile.readLine()) != null) {
				System.out.println(line + "----> " + accessFile.getFilePointer());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

