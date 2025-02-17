package String;
//9086 문자열
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String[] inputString = new String[N];
		
		for (int i = 0; i < N; i++) {
			inputString[i] = sc.next();
		}
		sc.close();
		
		for (int i = 0; i< N; i++) {
			System.out.print(inputString[i].charAt(0));
			System.out.println(inputString[i].charAt(inputString[i].length() - 1));						
		}
	}
}
