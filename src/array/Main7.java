package array;
//5597 과제 안 내신 분
//28개라는 것에 잠식되면 왜틀린지 헷갈리는문제
//예제에도 29, 30을 안넣은걸 보면 의도한 것 같다.
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 30;
		int n = 0;
		int[] k = new int[N];
		for (int i = 0; i < N; i++)
			k[i] = i + 1;
		for (int i = 0; i < 28; i++) {
			n = sc.nextInt();
			for (int j = 0; j < N; j++) {
				if (n == k[j]) {
					k[j] = 0;
					break;
				}
			}
		}
		
		for (int i = 0; i < 30; i++) {
			if (k[i] != 0) {
				System.out.println(k[i]);
			}
		}
	}
}

