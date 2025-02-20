package bruteForce.bruteForce;
//영화감독 숌
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = String.valueOf(i);
			if (str.indexOf("666") != -1)
				cnt++;
			if (cnt == N) {
				System.out.println(i);
				break;
			}
		}
			
	}
}
