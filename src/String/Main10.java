package String;
//1152 단어의 개수
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		int cnt = 0;
		while (sc.hasNext()) {
			str[cnt] = sc.nextLine();
			cnt++;
		}
		sc.close();
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(str[i]);
		}
		
	}
}
