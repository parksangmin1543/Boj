package main;
//2525 오븐시계


import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int inputValue1 = scanner.nextInt();
        int inputValue2 = scanner.nextInt();
        
        int hour = inputValue;
        int minute = inputValue1 + inputValue2;
        if (60 <= minute) {
        	while (minute >= 60) {
        		hour++;
        		minute -= 60;        		
        	}
        }
        if (hour >= 24)
        	hour -= 24;
        
    	System.out.print(hour + " ");
    	System.out.print(minute);
    }
}