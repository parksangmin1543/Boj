package twoDimensionalArray;
//2563
import java.util.Scanner;

// 3~13 7~17
// 15~25 7~17
// 5~15 2~12
// x와 y가 겹치는 값을 찾고 
// 겹치는 값을 빼고 x = 8, y = 5
// x * y = 40
//3 = 300
//300 - 40

//이게 아니라 100*100의 배열안에 하나하나 점을 찍고 겹치는 부분이 있으면 1로 바뀌고 그걸 새면됨

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int white[][] = new int[100][100];
		int black[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				black[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = black[i][1]; j < black[i][1] + 10; j++) {
				for (int k = black[i][0]; k < black[i][0] + 10; k++) {
					white[j][k]++;
				}
			}
		}
		int cnt = 0;
		for (int j = 0; j < 100; j++) {
			for (int k = 0; k < 100; k++) {
				if (white[j][k] > 0)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
