package String;
//9086 문자열
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		
		sc.close();
		
		System.out.println((int)in.charAt(0));
	}
}
