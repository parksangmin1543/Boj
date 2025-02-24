package sort;
// 단어정렬

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String arrStr[] = new String[N];
		
		for (int i = 0; i < N; i++ ) {
			arrStr[i] = sc.next();
		}
		sc.close();
		
		Arrays.sort(arrStr);
		for (int i = 0; i < N; i++) {
			System.out.println(arrStr[i]);
		}
	}
}
