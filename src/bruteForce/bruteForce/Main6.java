package bruteForce.bruteForce;
//설탕배달
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ans = 0;
		
		while (N >= 0) {
			if (N % 5 == 0) {
				ans += (N / 5);
				System.out.println(ans);
				return ;
			}
			N -= 3;
			ans++;
		}
		System.out.println(-1);	
	}
}
