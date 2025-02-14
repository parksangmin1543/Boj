package array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] j = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			j[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int k = 0; k < N; k++) {
			if (j[k] == v)
				cnt++;
		}
		System.out.println(cnt);
	}
}
