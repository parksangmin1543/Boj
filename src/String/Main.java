package String;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.nextLine();
		int inputValue = sc.nextInt();
		System.out.println(inputString.charAt(inputValue - 1));
	}
}
