package sort;

import java.util.Scanner;
// 버블정렬, 삽입정렬, 선택정렬 => 먼저 해보기
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int k = sc.nextInt();
		int arrInt[] = new int[N];
		int temp = 0;
		int total = 0;
		for (int i = 0; i < N; i++) {
			arrInt[i] = sc.nextInt();
			total += arrInt[i];
		}
		sc.close();

		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (arrInt[j] < arrInt[j - 1]) {
					temp = arrInt[j];
					arrInt[j] = arrInt[j - 1];
					arrInt[j - 1] = temp;
				}
			}
		}
		
//		for (int value : arrInt)
//			System.out.println(value);
		
		System.out.println(arrInt[N - k]);
		
	}

}
