package baekjoon_bruteforce;


import java.io.*;
public class test_1436 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int n = 666;

	    // 카운터가 입력받은 수와 같을때까지 계속 증가시킴  
		// 증가시키면서 증가시키면서 666이 포함되어있는지  
		
		while(cnt != N) {
			n ++;
			if(String.valueOf(n).contains("666")) {
				cnt ++;
			}
		}
		System.out.println(n);
	}

}
