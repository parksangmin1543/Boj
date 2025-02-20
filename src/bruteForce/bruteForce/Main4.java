package bruteForce.bruteForce;
//설탕배달
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		int div = N;
		while (N > 5) {
			div /= 5;
			N %= 5;
			cnt += div;
		}
		div = N;
		while (N > 2) {
			div /= 3;
			N %= 3;
			cnt += div;
		}
		
		if (N != 0)
			cnt = -1;
		
		System.out.println(cnt);
	}
}
