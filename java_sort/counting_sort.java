package java_sort;

public class counting_sort {

	public static void main(String[] args) {
		
		
		//수의 범위 : 0 ~ 100  
		//for 문 돌면서  0 ~ 100 까지 나온숫자 있을때마다 ++  
		// 0부터 시작하므로 각 인덱스 번호가 해당 숫자임 
		
		int []arr = new int [101];
		
		
		// 숫자는 50개만   
	    for(int i=0; i < 50; i++) {
	    	arr[(int)(Math.random()*101)] ++;
	    }
	    
	  

        // arr 배열은 1 ~ 순서대로 있고 인덱스 번호가 각 숫자 arr[99] = 99
	    // 해당 인덱스  값이 0 이 될때까지 출력해주면 중복된 숫자들 어려번 출력 
	    
	    
	    for(int i=0; i < arr.length; i++) {
	    	
	    	while(arr[i]-- > 0) {
	    		System.out.print(i + " ");
	    	}
	    }
	}
}
