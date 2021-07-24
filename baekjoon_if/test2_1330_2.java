package baekjoon_if;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_1330_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// split 을 이용한 문자열 분리   
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.print((a>b) ? ">" : ((a<b) ? "<" : "=="));  //삼항 연산자 

	}

}
