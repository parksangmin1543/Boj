package sort;
//수정렬하기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
// 퀵정렬, 병합정렬, 합정렬
//셀정렬, 기수정렬, 카운팅정렬, 팀정렬
public class Main5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
//		ArrayList<Integer> list = new ArrayList<>();
		int[] list = new int[N];
		System.out.println(N);
		for (int i = 0; i < N; i++)
			list[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(list);
		
		for (int value : list) {
			sb.append(value).append('\n');
		}
		
//		System.out.println(sb);
		
	}
}
