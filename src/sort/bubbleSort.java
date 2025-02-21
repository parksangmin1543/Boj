package sort;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arrInt[] = new int[N];
		int i = 0;
		int temp = 0;
		while (i < N) {
			arrInt[i] = sc.nextInt();
			i++;
		}

		for (i = 0; i < N; i++) {
			for (int  j = 0; j < N - i - 1; j++) {
				if (arrInt[j] > arrInt[j + 1]) {
					temp = arrInt[j];
					arrInt[j] = arrInt[j + 1];
					arrInt[j + 1] = temp;
				}
			}
		}
		
		
		for (i = 0; i< N; i++)
			System.out.println(arrInt[i]);
		
	}

}
