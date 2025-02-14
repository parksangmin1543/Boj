package array;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			if (X > array[i]) {
				System.out.print(array[i]);
				System.out.print(" ");				
			}
		}
	}
}
