package baekjoon_bruteforce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());
		
		int rst = 0;
		for(int i=0; i<N; i++) {
			
			int num = i; // 0~N 까지 해당하는 수 찾아야 함 
			int sum = 0; // 각 자릿수 합 넣어줄 변수  
			
			while(num != 0) {
			    sum += num%10; // 각 자릿수 더하기 (뒤에서부터)
			    num /= 10;     // 더해준 뒷자리 잘라주기  
			}
			
			// 생성자를 찾으면 저장 
			if(sum+i == N) {
				rst = i;
				break;
			}		
		}
		System.out.print(rst);
	}
}
