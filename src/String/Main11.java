package String;
//1152 단어의 개수
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		int[] time = new int[]{3, 3, 3, 4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			total += time[(str.charAt(i) - 'A')];
		}
		System.out.println(total);
	}
}
