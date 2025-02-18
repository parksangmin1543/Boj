package String;
//1152 단어의 개수
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(sc.hasNext()) {
			sc.next();
			cnt++;
		}
		System.out.println(cnt);
	}
}
