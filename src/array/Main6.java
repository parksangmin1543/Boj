package array;
//10813 공 바꾸기
//swap 개념
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a = 0,b = 0, temp = 0;
		int[] array = new int[N + 1];
		
		for (int i = 0; i < N; i++)
			array[i] = i + 1;
		
		for (int i = 0; i < M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			temp = array[a - 1];
			array[a - 1] = array[b - 1];
			array[b - 1] = temp;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}

