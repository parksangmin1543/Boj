package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//배열로 구현후 
//리스트로 구현해보기
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] stack = new int[N];
		List<Integer> listStack = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			stack[i] = sc.nextInt();
			if (stack[i] == 1)
				//push
				listStack.add(sc.nextInt());
		}

		for (int i = 0; i < N; i++) {
			if (stack[i] == 2) {
				//pop
				if (listStack.size() == 0)
					System.out.println(-1);
				else {
					if (listStack.get(listStack.size() - 1) != null) {
						System.out.println(listStack.get(listStack.size() - 1));
						listStack.remove(listStack.size() - 1);
					} else {
						System.out.println(-1);
					}
				}

			} else if (stack[i] == 3) {
				//peek
				System.out.println(listStack.size());
			} else if (stack[i] == 4) {
				// empty
				if (listStack.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else if (stack[i] == 5) {
				if (listStack.size() == 0) 
					System.out.println(-1);
				else {
					if (listStack.get(listStack.size() - 1) != null) {
						System.out.println(listStack.get(listStack.size() - 1));
					} else {
						System.out.println(-1);
					}
				}
				
			}
		}
	}
	public class ArrayStack {
		int top;
		int size;
		int[] stack;
		public ArrayStack(int size) {
			this.size = size;
			stack = new int[size];
			top = -1;
		}
		
		public void push(int item) {
			stack[++top] = item;
			System.out.println(stack[top]);
		}
		
		public void pop() {
			System.out.println(stack[top]);
			int pop = stack[top];
			stack[top--] = 0;
		}
		
		public void peek() {
			System.out.println(stack[top]);
		}
	}
}


