package array;
//2562 최댓값
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		int maxNum = -1000000;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			if (maxNum < array[i]) {
				maxNum = array[i];
				cnt = i + 1;
			}
		}

		System.out.println(maxNum);
		System.out.println(cnt);
	}
}
