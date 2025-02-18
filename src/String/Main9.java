package String;
//1152 단어의 개수
import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrStr = new String[2];
		
		arrStr[0] = sc.next();
		arrStr[1] = sc.next();
		int[] arrInt = new int[2];
		for (int i = 0; i < 2; i++) {
			arrInt[i] = reAtoi(arrStr[i]);
		}
		if (arrInt[0] < arrInt[1]) {
			arrInt[0] = arrInt[1];
		}
		System.out.println(arrInt[0]);
	}
	
	public static int reAtoi(String str) {
		
		int piv = 1;
		int value = 0;
		for (int i = 0; i < str.length(); i++) {
			value += (str.charAt(i) - 48) * piv;
			piv *= 10;
		}
		
		return value;
	}
}
