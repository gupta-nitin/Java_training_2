package com.apps.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFilewLineByLine {

	public static void main(String[] args) {

		ReadFilewLineByLine byLine = new ReadFilewLineByLine();
		byLine.readFile("resources/student.txt");
	}

	public void readFile(String relativePath) {

		try (FileReader fileReader = new FileReader(relativePath);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
