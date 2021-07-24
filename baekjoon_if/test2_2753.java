package baekjoon_if;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if((n % 4==0 && n%100 !=0) || (n % 400 == 0)) {
			System.out.print(1);
		}
		else System.out.print(0);		
		
		// 삼항 연산자 
        // System.ou.print((n%4 == 0) ? ((n%400==0) ? "1" : (y%100==0) ? "0" : "1") : "0" );
	}

}
