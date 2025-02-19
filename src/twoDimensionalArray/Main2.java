package twoDimensionalArray;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 9;
		int M = 9;

		int twoArray[][] = new int[N][M];
		int max = 0;
		int x = 0, y = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				twoArray[i][j] += sc.nextInt();
				if (twoArray[i][j] >= max) {
					max = twoArray[i][j];
					x = i + 1;
					y = j + 1;
				}

			}
		}

		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
