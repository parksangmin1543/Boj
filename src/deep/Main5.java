package deep;

import java.util.Scanner;

// 같다면 넘어가고 다르다면 그전에 값중에 같은게 있는지 확인하기
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int alphabet[] = new int[26];
		String arrStr[] = new String[N];
		char prev = 0;
		for (int i = 0; i < N; i++) {
			arrStr[i] = sc.next();	
		}
		sc.close();
		
		for (int i = 0; i < N; i++) {
			prev = 0;
			for (int j = 0; j < arrStr[i].length(); j++) {
				System.out.println(arrStr[i].charAt(j));
				if (alphabet[arrStr[i].charAt(j) - 'a'] != 1)
					alphabet[arrStr[i].charAt(j) - 'a'] = 1;
				else {
					if (arrStr[i].charAt(j) != prev) {
						System.out.println(arrStr[i].charAt(j) + " " + prev);
						arrStr[i] = "-1";
						break;
					}
					else
						alphabet[arrStr[i].charAt(j) - 'a'] = 1;
				}
				prev = arrStr[i].charAt(j);
			}
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (arrStr[i] != "-1")
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
