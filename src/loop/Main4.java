package loop;
//10951 A + B - 4
// eof 종료조건 처리방법을 묻는 문제
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
