package java_sort;

public class selection_sort {

	
	public static void selection_Sort(int[] a) {
		selection_Sort(a,a.length);
	}
	
	private static void selection_Sort(int[] a, int size) {
		
		for (int i=0; i< size-1; i++) {
			
			int min_index = i;
			
			// 최솟값 갖고있는 인덱스 찾기 
			
			for(int j=i+1; j<size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 찾은 최속값을 서로 교환
			swap(a, min_index, i);
		}		
	}
    
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
