package sort;

import java.util.Scanner;
// 버블정렬, 삽입정렬, 선택정렬 => 먼저 해보기
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class selectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arrInt[] = new int[N];
		int temp = 0;
		int index = 0;
		for (int i = 0; i < N; i++)
			arrInt[i] = sc.nextInt();

		for (int i = 0; i < N; i++) {
			index = i;
			for (int j = i + 1; j < N; j++)
				if (arrInt[j] < arrInt[index])
					index = j;
			temp = arrInt[i];
			arrInt[i] = arrInt[index];
			arrInt[index] = temp;
		}
		
		
		for (int i = 0; i< N; i++)
			System.out.println(arrInt[i]);
		
	}

}
