package com.apps.data.entry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DataEntryApp {

	private static String filePath;
	private static Map<Integer, Student> cache = new LinkedHashMap<>();
	private static int id = 100;
	private static boolean isSaved;

	public static void main(String[] args) {
		loadFilePath(args);
		int selection = 0;
		do {
			displayMenu();
			Scanner scanner = new Scanner(System.in);
			selection = scanner.nextInt();

			switch (selection) {
			case 1:
				addRecord();
				break;

			case 2:
				deleteRecord();
				break;
			case 3:
				displayData();
				break;
			case 4:
				saveData();
				break;

			case 5:
				exit();
				break;
			default:
				System.out.println("Invalid selection......");
				break;
			}
		} while (selection != 5);

	}

	public static void loadFilePath(String[] args) {
		if (args != null && args.length == 1) {
			filePath = args[0];
			FileOperations fileOperations = new FileOperations(filePath);
			try {
				Map<Integer, Student> pre_saved_data = fileOperations.loadDataFRomFile();
				cache.putAll(pre_saved_data);
			} catch (IOException e) {
				filePath = "";
				System.err.println("Failed to load data from file : " + filePath);
			}

		}

	}

	public static void displayMenu() {

		System.out.println("***************Data Entry Application *****************");
		System.out.println("1) Add Record");
		System.out.println("2) Delete Record");
		System.out.println("3) Display Data");
		System.out.println("4) Save");
		System.out.println("5) Exit");
		if (filePath != null && !filePath.isEmpty()) {
			System.out.println("***************[" + filePath + "]*****************");
		} else {
			System.out.println("**************************************************");
		}

	}

	public static void addRecord() {
		Scanner scanner = new Scanner(System.in);
		int newId = ++id;

		System.out.println("Enter Name : ");
		String name = scanner.next();

		System.out.println("Enter Age : ");
		int age = scanner.nextInt();

		scanner.reset();

		System.out.println("Enter Address : ");
		String address = scanner.next();

		Student newStudent = new Student(newId, name, age, address);
		cache.put(newId, newStudent);

		isSaved = false;
		System.out.println("Data added sucessfully....");

	}

	public static void deleteRecord() {
		System.out.println("Please enter student id to delete");
		Scanner scanner = new Scanner(System.in);
		int id_ToDelete = scanner.nextInt();
		if (cache.containsKey(id_ToDelete)) {
			Student student = cache.remove(id_ToDelete);
			System.out.println(
					"ID : " + student.getId() + " | NAME : " + student.getName() + " is deleted sucessfully...");
			isSaved = false;
		} else {
			System.err.println("Unable to delete as Id Does'nt exists....");
		}
	}

	public static void displayData() {
		System.out.println("Total Record Count : " + cache.size());
		System.out.println("Id \t Name \t Age \t Address");
		for (Entry<Integer, Student> entry : cache.entrySet()) {
			Student student = entry.getValue();
			System.out.println(
					student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
		}
	}

	public static void saveData() {
		if (filePath == null || filePath.isEmpty()) {
			Scanner scanner = new Scanner(System.in);
			filePath = scanner.nextLine();
		}
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			for (Entry<Integer, Student> entry : cache.entrySet()) {
				StringBuffer buffer = new StringBuffer();
				Student student = entry.getValue();
				buffer.append(student.getId() + "\t");
				buffer.append(student.getName() + "\t");
				buffer.append(student.getAge() + "\t");
				buffer.append(student.getAddress() + "\n");
				fileWriter.write(buffer.toString());
			}
			isSaved = true;
			System.out.println("Data Saved Successfully to file - " + filePath);
		} catch (IOException e) {
			System.err.println("Failed to save data.... [ " + e.getMessage() + "] ");
		}

	}

	public static void exit() {
		if(!isSaved){
			System.out.println("Recent cahnges is not saved in file..");
			System.out.println("Please confirm if you want to save, type 'Y' to save or 'N' to terminate ");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.next();
			if(userInput.equals("Y") || userInput.equals("y") ){
				saveData();
			}
		}
		System.out.println("Terminating Application....");
	}
}

class FileOperations {

	String filePath;

	public FileOperations(String filePath) {
		this.filePath = filePath;
	}

	public Map<Integer, Student> loadDataFRomFile() throws IOException {
		Map<Integer, Student> data = new LinkedHashMap<>();

		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] fields = line.split("\t");
			if (fields.length == 4) {
				int id = Integer.parseInt(fields[0]);
				String name = fields[1];
				int age = Integer.parseInt(fields[2]);
				String address = fields[3];
				Student student = new Student(id, name, age, address);
				data.put(id, student);
			}
		}
		return data;
	}

	public void saveDataToFile() {

	}
}