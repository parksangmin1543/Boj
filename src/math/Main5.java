package math;
//진법변환
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int K = sc.nextInt();
		int total = 0;
		int temp = 1;
		for (int i = N.length() - 1; i >= 0; i--) {
			if ('A' <= N.charAt(i) && N.charAt(i) <= 'Z')
				total += (N.charAt(i) - 'A' + 10) * temp;
			else
				total += (N.charAt(i) - '0') * temp;
			temp *= K;
		}
		System.out.println(total);
	}

}
