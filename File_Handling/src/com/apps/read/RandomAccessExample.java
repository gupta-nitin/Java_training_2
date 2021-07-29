package com.apps.read;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {

	public static void main(String[] args) {
		RandomAccessExample accessExample = new RandomAccessExample();
		accessExample.readFile("resources/student.txt");
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
