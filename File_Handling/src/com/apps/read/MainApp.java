package com.apps.read;

import java.io.FileInputStream;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) {
		ReadFileUtil fileUtil = new ReadFileUtil("resources/student.txt");
		fileUtil.readFileData();
	}
}

class ReadFileUtil {

	private String relativeFilePath;

	public ReadFileUtil(String relativeFilePath) {
		this.relativeFilePath = relativeFilePath;
	}

	public void readFileData() {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(relativeFilePath);
			int i;

			while ((i = fileInputStream.read()) != -1) {
				System.out.println((char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e) {
				System.err.println("Error occured while closing the file");
			}
		}

	}

}