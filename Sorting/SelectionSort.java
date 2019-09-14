package HackerEarth;

/*********************************************Selection Sort***************************************************************
* It selects the minimum value and swap it in the front of an array.
* As Array contains Minimum value in the front positions so we keep on increasing the first value for the iteration. 
************************************************************************************************************/

public class SelectionSort {

	public static void main(String args[]) {
	
		int[] data = {2,35,1,68,53,3,99,54,4};
		
		int temp = 0;

		System.out.println("*****************UnSorted Array********************************");			

		for(int pos = 0; pos < data.length;pos++) {
			System.out.println(data[pos]);			
		}
		
		System.out.println("*****************Sorted Array********************************");			
		

		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j < data.length; j++) {
				 
				if(data[i] > data[j]) {
					    temp = data[j];
					    data[j] = data[i];
					    data[i] = temp;
				 }				
			}
		}
		
		for(int pos = 0; pos < data.length;pos++) {
			System.out.println(data[pos]);			
		}
	}
}
