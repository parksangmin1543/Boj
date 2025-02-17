package String;
//9086 문자열
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		String in;
		in = sc.next();
		sc.close();
		
		for (int i = 0; i < N; i++) {
			sum += ((int)in.charAt(i) - 48);
		}

		System.out.println(sum);
	}
}
