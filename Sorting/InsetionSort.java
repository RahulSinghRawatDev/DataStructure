package HackerEarth;

public class InsetionSort {
	
	public static void main(String args[]) {
		
		int arr[] = {5,4,2,1,8,5};
	
		System.out.println("*****************UNSORTED ARRAY**********************");
				
		printArray(arr);
		
		InsetionSort insetionSort = new InsetionSort();
		insetionSort.sort(arr);

		System.out.println("*****************SORTED ARRAY**********************");
		printArray(arr);
				
	}
	
	
	void sort(int arr[]) {
		
		for(int pos = 1; pos < arr.length; pos++) {
		    int key = arr[pos];
		    int j = pos - 1;
					    
			while(j >= 0  && arr[j] > key) {
				
			    arr[j + 1] = arr[j];
			    j = j-1;
			    
				
			}
			arr[j+1] = key;
		    
		}
		
	}

	
	static void printArray(int arr[]) {
		for(int pos = 0; pos < arr.length; pos++) {
			System.out.println(arr[pos]);
		}
	}	
}
