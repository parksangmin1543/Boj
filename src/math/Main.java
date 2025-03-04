package math;
//중앙이동알고리즘
import java.util.Scanner;
// 3/5/9/17/33...
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int piv = 2;
		for (int i = 0; i < N; i++) {
			piv += (piv - 1);
		}
		
		sc.close();
		
		System.out.println(piv * piv);
	}
}
