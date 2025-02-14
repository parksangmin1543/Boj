package loop;
//2439 별찍기 - 2

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j >= N - i)					
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
