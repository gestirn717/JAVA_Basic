package baekjoon_bruteforce;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		String[]str;
		
		
		// 문자열 배열로 키 몸무게 입력받기   
		for(int i =0; i<N; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]); //[i][0] 몸무게 
			arr[i][1] = Integer.parseInt(str[1]); //[i][1] 키  		
		}
		
		
		for(int i=0; i<N; i++) {
			int rank = 1; // for문 밖에다가 두면 크던 작던 랭크 올라감   
			for(int j=0; j<N; j++) {
				
			   if(i==j) continue;
			   if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
				   rank++; 
			   }			   
			}	
			sb.append(rank).append(" "); //i의 순위를 알아야 하니까 i for 문 안쪽에서  
		}				
     System.out.println(sb);
	}
}
