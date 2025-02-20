package bruteForce.bruteForce;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int sum = 0;
		int in[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			in[i] = sc.nextInt();
		}
		
		for (int i = 0; i< N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if (sum < in[i] + in[j] + in[k] && in[i] + in[j] + in[k] <= M) {
						sum = in[i] + in[j] + in[k];
					}
				}
			}
		}
		System.out.println(sum);
	}
}
