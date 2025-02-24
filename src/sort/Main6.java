package sort;
// 좌표 정렬하기

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arrInt[][] = new int[N][2];
		
		for (int i = 0; i < N; i++ ) {
			arrInt[i][0] = sc.nextInt();
			arrInt[i][1] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arrInt, (e1,e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}
			else {
				return e1[0] - e2[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(arrInt[i][0] + " " + arrInt[i][1]);
		}
	}
}
