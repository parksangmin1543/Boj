package main;
//2884 알람시계

/*
 * 45보다 작으면 앞에 숫자를 하나뻄
 * 남은값을 60에서 뺌
 * 예외 0일경우에는 23으로
 * */

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int inputValue1 = scanner.nextInt();
        
        int hour = inputValue;
        int minute = 0;
        if (45 > inputValue1) {
        	hour--;
        	minute = 60 - (45 - inputValue1); 
        }
        else
        	minute = inputValue1 - 45;
        if (hour == -1)
        	hour = 23;
        
        	
        	
    	System.out.print(hour + " ");
    	System.out.print(minute);
    }
}