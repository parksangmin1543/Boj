package sort;
// 소트인사이드

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int arrInt[] = new int[N.length()];
		for (int i = 0; i < N.length(); i++ ) {
			arrInt[i] = N.charAt(i) - '0';
		}
		Arrays.sort(arrInt);
		
		for (int i = N.length() - 1; i >= 0; i--) {
			System.out.print(arrInt[i]);
		}
		
	}
}
