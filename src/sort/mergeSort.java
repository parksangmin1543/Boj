package sort;

import java.util.*;
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class mergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> arrInt = new ArrayList<>();
		for (int i = 0; i < N; i++)
			arrInt.add(sc.nextInt());
		sc.close();
		
		arrInt = mergeSort(arrInt);
		
		for (int value : arrInt)
			System.out.println(value);
		
	}
	
	public static ArrayList<Integer> mergeSort(List<Integer> list) {
		if (list.size() < 2)
			return new ArrayList<Integer>(list);
			
		int mid = list.size() / 2;
		
		ArrayList<Integer> low = new ArrayList<>();
		ArrayList<Integer> high = new ArrayList<>();
		ArrayList<Integer> mergedArray = new ArrayList<>();
		
		low = mergeSort(list.subList(0, mid));
		high = mergeSort(list.subList(mid, list.size()));
		
		int l = 0, h = 0;
		
		while (l < low.size() && h < high.size()) {
			if (low.get(l) < high.get(h)) {
				mergedArray.add(low.get(l));
				l++;
			}
			else {
				mergedArray.add(high.get(h));
				h++;
			}
		}
		
		mergedArray.addAll(low.subList(l, low.size()));
		mergedArray.addAll(high.subList(h, high.size()));
		
		return mergedArray;
	}
}
