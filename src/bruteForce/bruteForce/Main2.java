package bruteForce.bruteForce;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int tempN = 1;
		int temp = 0;
		int bol = 0;
		
		for (int i = 1; i < N; i++) {
			tempN = i;
			temp = 0;
			while (tempN >= 1) {
				temp += tempN % 10;
				tempN /= 10;
			}
			if (temp + i == N) {
				bol = 1;
				tempN = i;
				break;
			}
		}
		
		if (bol == 1)
			System.out.println(tempN);
		else
			System.out.println(0);
	}
}
