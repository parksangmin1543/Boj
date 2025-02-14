package array;
//10810 공넣기
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] array = new int[N + 1];
		int a = 0,b = 0,c = 0;
		for (int i = 0; i < M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			for (int j = a; j <= b; j++) {
				array[j] = c;
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}
