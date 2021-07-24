package baekjoon_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test2_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.print((n>=90) ? "A" :  (n>=80) ? "B" : (n>=70) ? "C" : (n>=60) ? "D" : "F");
		
	}
}
