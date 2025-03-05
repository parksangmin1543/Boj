package math2;
import java.util.ArrayList;
import java.util.List;
//가로수
//거리중 최대공약수 구하기
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		int cnt = 0;
		int piv = 0;
		for (int i = arr[0]; i < arr[arr.length - 1]; i+=2) {
			piv = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					piv = 1;
					break;
				}
			}
			if (piv == 0)
				cnt++;
		}
		System.out.println(cnt);
		
	}

}