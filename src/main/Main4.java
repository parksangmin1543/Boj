package main;
//2753 윤년
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int i = 0;
        if ((inputValue % 4) == 0) {
        	if ((inputValue % 100) > 0 || (inputValue % 400) == 0)
        		i = 1;
        }
    	System.out.println(i);
    }
}