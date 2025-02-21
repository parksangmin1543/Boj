package sort;

import java.util.Scanner;

public class insertSort {

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

//삽입정렬
//		잘못된 버전 작동은 잘함
//		for (i = 1; i < N; i++) {
//			for (int  j = i; j > 0; j--) {
//				if (arrInt[i] < arrInt[i - j]) {
//					System.out.println(i + " " + (i-j));
//					temp = arrInt[i];
//					arrInt[i] = arrInt[i - j];
//					arrInt[i - j] = temp;	
//				}
//			}
//		}
//		정상적인 버전
		for (i = 1; i < N; i++) {
			for (int  j = i; j > 0; j--) {
				if (arrInt[j] < arrInt[j - 1]) {
					temp = arrInt[j];
					arrInt[j] = arrInt[j - 1];
					arrInt[j - 1] = temp;	
				}
			}
		}
		
		for (i = 0; i< N; i++)
			System.out.println(arrInt[i]);
		
	}

}
