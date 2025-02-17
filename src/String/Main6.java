package String;
//9086 문자열
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int[] input = new int[26];
		
		for (int i = 0; i < 26; i++) {
			input[i] = -1;
		}
		
		for (int i = 0; i < in.length(); i++) {
			if (input[in.charAt(i) - 97] == -1)
				input[in.charAt(i) - 97] = i;
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
