package loop;
//2739 구구단

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int a = 0, b = 0;
		int total = 0;
		String resultString = "";
		boolean result = true;
		
		for (int i = N; i > 0; i--) {
			a = sc.nextInt();
			b = sc.nextInt();
			total += a * b;
		}
		
		result = (total == X);
		resultString = result == true ? "Yes" : "No";
		System.out.println(resultString);	 
	}
}
