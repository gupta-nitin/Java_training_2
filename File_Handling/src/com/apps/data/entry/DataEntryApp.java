package com.apps.data.entry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataEntryApp {

	private static String filePath;
	private static List<Student> cache = new ArrayList<>();
	private static int id = 100;
	
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
				List<Student> pre_saved_data = fileOperations.loadDataFRomFile();
				cache.addAll(pre_saved_data);
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
		String name = scanner.nextLine();
		
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		
		System.out.println("Enter Address : ");
		String address = scanner.nextLine();
		
		Student student = new Student(newId, name, age, address);
		cache.add(student);
		
		System.out.println("Data added sucessfully....");
		
	}

	public static void deleteRecord() {

	}

	public static void displayData() {
		System.out.println("Total Record Count : "+cache.size());
		System.out.println("Id \t Name \t Age \t Address");
		for(Student student : cache){
			System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
		}
	}

	public static void saveData() {

	}

	public static void exit() {
		System.out.println("Terminating Application....");
	}
}

class FileOperations {

	String filePath;

	public FileOperations(String filePath) {
		this.filePath = filePath;
	}

	public List<Student> loadDataFRomFile() throws IOException {
		List<Student> data = new ArrayList<>();

		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] fields = line.split("\t");
			if (fields.length == 4) {
				Student student = new Student(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]),
						fields[3]);
				data.add(student);
			}
		}
		return data;
	}

	public void saveDataToFile() {

	}
}