package main;
//2480 주사위 세개


import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iV = sc.nextInt();
        int iV1 = sc.nextInt();
        int iV2 = sc.nextInt();
        int result = 0;
        int maxNum = 0;
        
        if ((iV == iV1) && (iV == iV2) && (iV1 == iV2))
        	result = 10000 + iV * 1000;
        else if ((iV == iV1))
        	result = 1000 + iV * 100;
        else if ((iV1 == iV2))
        	result = 1000 + iV1 * 100;
        else if ((iV == iV2))
        	result = 1000 + iV * 100;
        else {
        	maxNum = iV > iV1 ? iV > iV2 ? iV : iV2 : iV1 > iV2 ? iV1 : iV2;
        	result = maxNum * 100;
        }

        System.out.println(result);
    }
}