package twoDimensionalArray;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		String arrStr[] = new String[5];
		for (int i = 0; i < 5; i++) {
			arrStr[i] = sc.next();
			if (max < arrStr[i].length())
				max = arrStr[i].length();
		}
		String[][] twoArrayStr = new String[5][max];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < arrStr[i].length(); j++) {
				twoArrayStr[i][j] = arrStr[i].charAt(j) + "";
			}
		}
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (twoArrayStr[j][i] != null)
					System.out.print(twoArrayStr[j][i]);
			}
		}
	}
}
