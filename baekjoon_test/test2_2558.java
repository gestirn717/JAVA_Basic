package baekjoon_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2558 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		sb.append(a*(b%10)).append('\n');        // 1의 자리  
		sb.append(a*(b/10%10)).append('\n');     // 10의자리 
		sb.append(a*b/100).append('\n');         // 100의 자리 
		sb.append(a*b);                          
		
		System.out.print(sb);
		

	}
}
