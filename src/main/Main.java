package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputValue = scanner.nextLine();
        int inputInt1 = scanner.nextInt();
        int inputInt2 = scanner.nextInt();
        
        int value3 = inputInt2 / 100;
        int value2 = (inputInt2 % 100) / 10;
        int value1 = inputInt2 % 10;
        System.out.println(value1 * inputInt1);
    	System.out.println(value2 * inputInt1);
    	System.out.println(value3 * inputInt1);
//    	System.out.println(inputInt1 / 100);
//    	System.out.println(inputInt1 / 100);
//    	System.out.println(inputInt1 / 100);
    	System.out.println(inputInt1 * inputInt2);
        
    }
}