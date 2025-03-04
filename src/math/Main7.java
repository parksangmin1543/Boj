package math;
//세탁소 사장 동혁
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int[][] arrStr = new int[N][4];
		int[] str = {25, 10, 5, 1};
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				arrStr[i][j] = arr[i] / str[j];
				arr[i] %= str[j];				
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arrStr[i][j] + " ");				
			}
			System.out.println();
		}
	}
}
