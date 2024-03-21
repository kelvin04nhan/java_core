package helloworld;

import java.util.Scanner;

public class baiTap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Typing edge: ");
		int edge = scanner.nextInt();
		System.out.println("Volume: " + (edge * edge * edge));
		System.out.println("The other way to caluate Volume: " + Math.pow(edge, 3));
		scanner.close();
	}
}
