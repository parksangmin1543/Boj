package deep;
//단어 공부
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrInt = new int[26];
		
		String str = sc.next();
		int max = 0;
		int cnt = 0;
		int p = 0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) < 'a')
				arrInt[str.charAt(i) - 'A']++;
			else
				arrInt[str.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			if (max < arrInt[i]) {
				max = arrInt[i];
				p = i;
			}
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			if (max == arrInt[i])
				cnt++;
		}
		
		if (cnt > 1)
			System.out.println("?");
		else
			System.out.println((char)(p + 'A'));
	}
}
