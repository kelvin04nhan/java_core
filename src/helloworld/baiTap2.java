package helloworld;

import java.util.Scanner;

public class baiTap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("The program start......");
		System.out.println("Typing heigh: ");
		int heigh = scanner.nextInt();
		System.out.println("Typing weight: ");
		int weight = scanner.nextInt();
		System.out.println("The Area: " + (weight * heigh));
		System.out.println("The Para: " + (weight + heigh) * 2);
		System.out.println("The min edge: " + Math.min(heigh, weight));
	}
}
