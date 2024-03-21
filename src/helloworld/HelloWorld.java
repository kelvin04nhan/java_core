package helloworld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("The program start");
		System.out.println("Enter student name: ");
		String name = scanner.nextLine();
		System.out.println("Enter grade: ");
		int grade = scanner.nextInt();
		System.out.println(name + " has " + grade);
//		int firstNumber = scanner.nextInt();
//		System.out.println("Your second is: ");
//		int secondNumber = scanner.nextInt();
//		int thirdNumber = Math.max(firstNumber, secondNumber);
//		System.out.println("The max value is: " + thirdNumber);
		scanner.close();
	}
}
