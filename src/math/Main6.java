package math;
//진법변환2
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		String total = "";
		while (0 < N) {
			if (N % K < 10)
				total += (char)((N % K) + '0');
			else
				total += (char)((N % K) + 'A' - 10);
			N /= K;
		}
		StringBuffer sb = new StringBuffer(total);
		String reverse = sb.reverse().toString();
		System.out.print(reverse);
	}
}
