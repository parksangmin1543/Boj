package sort;

import java.util.*;
import java.io.*;
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Arrays.sort(list);
		
		for (int value : list) {
			sb.append(value).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
