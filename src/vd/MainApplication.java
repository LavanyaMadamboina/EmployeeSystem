package vd;

import java.util.Scanner;

public class MainApplication {
	public static Scanner sc;
	public static Employee[] arr;
	public static int count = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean cont = true;

		arr = new Employee[10];

		do {

			displayMenu();
			System.out.println("Please enter ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				addEmployee();
				break;
			case 2:
				viewAllEmployee();
				break;
			case 3:
				cont = false;
			}
		} while (cont);

	}

	public static void displayMenu() {

		System.out.format("%20s %20s %40s", "", "Welcome to Employee System", "");
		System.out.println();
		System.out.format("%20s %20s %40s", "", "1. Add Employee", "");
		System.out.println();
		System.out.format("%20s %20s %40s", "", "2. View All Employee", "");
		System.out.println();

		System.out.format("%20s %20s %40s", "", "3. Exit", "");
		System.out.println();
	}

	public static void addEmployee() {
		System.out.println("Please enter name? ");
		String name = sc.next();

		System.out.println("Please enter id? ");
		int id = sc.nextInt();

		System.out.println("Please enter department id? ");
		int deptId = sc.nextInt();

		System.out.println("Please enter department name? ");
		String deptName = sc.next();

		Department dept = new Department(deptId, deptName);
		Employee emp = new Employee(id, name, dept);
		arr[count++] = emp;
	}

	public static void viewAllEmployee() {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}
}
