package String;
//9086 문자열
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		int[] arrInt = new int[in];
		String[] arrStr = new String[in];
		
		for (int i = 0; i < in; i++) {
			arrInt[i] = sc.nextInt();
			arrStr[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < in; i++) {
			for (int j = 0; j < arrStr[i].length(); j++) {
				for (int k = 0; k < arrInt[i]; k++) {
					System.out.print(arrStr[i].charAt(j));					
				}
			}
			System.out.println();
		}
	}
}
