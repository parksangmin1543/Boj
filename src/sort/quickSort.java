package sort;

import java.util.Scanner;
import java.util.*;
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class quickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> arrInt = new ArrayList<>();
		for (int i = 0; i < N; i++)
			arrInt.add(sc.nextInt());
		sc.close();
		
		arrInt = quickSort(arrInt);
		
		for (int value : arrInt)
			System.out.println(value);
		
	}
	
	public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
		if (arr.size() <= 1)
			return arr;
		
		int piv = arr.get(arr.size() / 2);
		ArrayList<Integer> small = new ArrayList<>();
		ArrayList<Integer> big = new ArrayList<>();
		ArrayList<Integer> equal = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		
		for (int num : arr) {
			if (num < piv)
				small.add(num);
			else if (num > piv)
				big.add(num);
			else
				equal.add(num);
		}
		System.out.println();
		
		sorted.addAll(quickSort(small));
		sorted.addAll(equal);
		sorted.addAll(quickSort(big));
		
		return  sorted;
	}
}
