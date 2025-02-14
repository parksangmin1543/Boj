package array;
//10811 바구니 뒤집기

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a = 0, b = 0;
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++)
			array[i] = i + 1;
		
		for (int i = 0; i < M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			array = reverseArray(array, a, b);
		}
		printArray(array);
	}
	
	public static int[] reverseArray(int[] array, int a, int b) {
		int temp = 0;
		for (int i = a - 1; i < b; i++) {
			temp = array[i];
			array[i] = array[b - 1];
			array[b - 1] = temp;
			b--;
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}

