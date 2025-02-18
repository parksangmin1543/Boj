package deep;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chess = new int[] {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < 6; i++) {
			chess[i] -= sc.nextInt();
			System.out.print(chess[i] + " ");
		}
	}
}
