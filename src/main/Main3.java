package main;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        
        String bol;
        if (input1 > input2)
        	bol = ">";
        else if (input1 < input2)
        	bol = "<";
        else
        	bol = "==";
    	System.out.println(bol);
    }
}