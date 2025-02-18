package twoDimensionalArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int twoArray[][] = new int[N][M];

		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					twoArray[i][j] += sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(twoArray[i][j] + " ");
			}
			System.out.println();
		}

	}
}
