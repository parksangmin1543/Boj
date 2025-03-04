package math;
//배수와 약수
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		while (a != 0 && b != 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 || b == 0) {
				continue;
			}
			if (b % a == 0)
				System.out.println("factor");
			else if (a % b == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}
	}

}
