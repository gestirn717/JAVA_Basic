package baekjoon_bruteforce;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class test_2798_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr [] = new int [N];
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = get(arr, N, M);
		System.out.println(result);
	}
	
	
	   static int get(int arr[], int N, int M) {
		   
		   // 값 비교를 위한 변수생성   
		   int result = 0;
		   
		   // N장의 카드중에서 3장의 카드 뽑는 3중 for문 
		   for (int i=0; i<N-2; i++) {
			   
			   // 첫번째 카드가 M 보다 크면 skip  
			   if(arr[i]>M) continue;
			   
			  for(int j=i+1; j<N-1; j++) {
				  
				  // 첫번째 카드와 두번째 카드의 합이 M보다 크면 skip 
				  if(arr[i]+arr[j]>M) continue;
				  
				  for(int k = j+1; k<N; k++) {
					  
					  int temp = arr[i] + arr[j] + arr[k];
					  if (temp == M) return temp;
					  
					  if(result < temp && temp < M) {
						  result = temp;
					  }				  
				  }
			  }
		   }
		 return result;
		   		   
	   }
}
