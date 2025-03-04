package set;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		HashSet<Integer> set1 = new HashSet<>();
		
		for (int i = 0; i < s1; i++) {
			set1.add(sc.nextInt());
		}
		HashSet<Integer> setCopy = new HashSet<>(set1);
		int s2 = sc.nextInt();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i = 0; i < s2; i++) {
			set2.add(sc.nextInt());
		}
		
		setCopy.retainAll(set2);
		
		for (int i = 0; i < set2.size(); i++) {
			if (set2.contains(i));
		}
		System.out.println(setCopy);

	}

}
