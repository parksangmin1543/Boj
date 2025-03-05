package math2;
//약수구하기
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long B = sc.nextInt();
		long gcd = getGCD(A,B);
		System.out.println((long)(A*B)/gcd);
	}
	
	public static long getGCD(long num1, long num2) {
		if (num2 == 0) 
			return num1;
		return getGCD(num2, num1%num2);
	}
}