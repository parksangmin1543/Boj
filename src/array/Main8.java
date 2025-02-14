package array;
//3052 나머지

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int cnt = 0;
		int[] array = new int[42];
		for (int i = 0; i < 10; i++) {
			A = sc.nextInt();
			array[A%42] = 1;
		}
		
		for (int i = 0; i < 42; i++) {
			if (array[i] == 1)
				cnt++;
		}
		
		System.out.println(cnt);
//		int A = 0;
//		int B = 42;
//		int cnt = 0;
//		int[] array = new int[10];
//		for (int i = 0; i < 10; i++) {
//			A = sc.nextInt();
//			array[i] = A % B;
//		}
//		for (int i = 0; i < 10; i++) {
//			for (int j = i; j < 9; j++) {
//				if (array[i] == array[j + 1]) {
//					array[i] = -1;
//				}
//			}
//		}
//		for (int i = 0; i < 10; i++) {
//			if (array[i] != -1)
//				cnt++;
//		}
//		System.out.println(cnt);
	}
}