package math;
import java.util.ArrayList;
//약수들의 합
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>() ;
		while (true) {
			list.add(sc.nextInt());
			if (list.get(list.size() - 1) == -1)
				break;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			ArrayList<Integer> perfect = new ArrayList<>() ;
			int result = 0;

			for (int j = 1; j < list.get(i); j++) {				
				if (list.get(i) % j == 0) {
					perfect.add(j);
					result += j;
				}
			}
			
			if (result == list.get(i)) {
				System.out.print(list.get(i) + " = ");
				for (int k = 0; k < perfect.size() - 1; k++) {
					System.out.print(perfect.get(k) + " + " );
				}
				System.out.println(perfect.get(perfect.size() - 1));
			}
			else 
				System.out.println(list.get(i) + " is NOT perfect.");
		}
	}

}
