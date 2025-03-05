package math2;
//분수 합
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		for (int i = 0; i < 4; i++)
			arr[i] = sc.nextInt();
		
		int a = arr[1] * arr[3];
		int b = (arr[0] * arr[3]) + (arr[2] * arr[1]);
		
		long mod = getGCD(b, a);
		a /= mod;
		b /= mod;
		System.out.println(b + " " + a);
	}
	
	public static long getGCD(long num1, long num2) {
		if (num2 == 0) 
			return num1;
		return getGCD(num2, num1%num2);
	}
}