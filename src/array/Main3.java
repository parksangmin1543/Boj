package array;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		int maxNum = -1000000, minNum = 1000000;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			if (maxNum < array[i])
				maxNum = array[i];
			if (minNum > array[i])
				minNum = array[i];
		}

		System.out.print(minNum);
		System.out.print(" ");				
		System.out.print(maxNum);
	}
}
