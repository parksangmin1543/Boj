package array;
//10811 바구니 뒤집기

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double M = 0;
		double total = 0;
		arr[0] = sc.nextDouble();
		M = arr[0];
		for (int i = 1; i < N; i++) {
			arr[i] = sc.nextDouble();
			if (arr[i] > arr[i - 1])
				M = arr[i];
		}
		for (int i = 0; i < N; i++) {
			total += ((arr[i]/M)*100);
		}
		
		System.out.println(total/N);
	}
}

