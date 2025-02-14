package main;
//14681 사분면고르기
// ++ 1 -+ 2 -- 3 +- 4
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int inputValue1 = scanner.nextInt();
        int i = 1;
        int x = 0;
        int y = 0;
        if (inputValue > 0)
        	x = 1;
        if (inputValue1 > 0)
        	y = 1;
        
        if (x == 1 && y == 1)
        	i = 1;
        else if (x == 0 && y == 1)
        	i = 2;
        else if (x == 0 && y == 0)
        	i = 3;
        else
        	i = 4;
        
    	System.out.println(i);
    }
}