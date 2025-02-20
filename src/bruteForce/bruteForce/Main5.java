package bruteForce.bruteForce;

import java.util.Scanner;
//똑같은걸 만든후에 대조를 하는 방식으로 풀기
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp = 0;
		int cnt = 0;
		int min = M * N;
		String str = "";
		char[][] chess = new char[N][M];
		char[][] chessCopy = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			str = sc.next();
			for (int j = 0; j < M; j++) {
				chess[i][j] = str.charAt(j);
			}
		}
		if (chess[0][0] == 'W')
			temp = 1;
		sc.close();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (j % 2 == temp)
					chessCopy[i][j] = 'B';
				else
					chessCopy[i][j] = 'W';
				System.out.print(chessCopy[i][j]);
			}
			System.out.println();
			if (temp == 1)
				temp = 0;
			else
				temp = 1;
		}

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				cnt = 0;
				for (int k = i; k < 8 + i; k ++) {
					for (int m = j; m < 8 + j; m++) {
						if (chess[k][m] != chessCopy[k - i][m - j]) {
							cnt++;
//							System.out.print(chess[k][m] + " " + chessCopy[k - i][m - j] + "----" );
						}
					}
//					System.out.println();
				}
				System.out.println(cnt);
				if (cnt < min)
					min = cnt;
			}
		}
		
		System.out.println(min);
	}
}
