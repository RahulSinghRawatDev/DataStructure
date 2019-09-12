package HackerEarth;

public class BubbleSort {

	public static void main(String args[]) {
	
		int[] data = {2,35,1,68,53,3,99,54,4};
		
		int temp = 0;
		System.out.println("*****************UnSorted Array********************************");			

		for(int pos = 0; pos < data.length;pos++) {
			System.out.println(data[pos]);			
		}
		
		System.out.println("*****************Sorted Array********************************");			
		

		for(int i = 0; i < data.length-1; i++) {
			for(int j = 0; j < data.length-i-1; j++) {
				 
				if(data[j] > data[j+1]) {
					    temp = data[j];
					    data[j] = data[j+1];
					    data[j+1] = temp;
				 }				
			}
		}
		
		for(int pos = 0; pos < data.length;pos++) {
			System.out.println(data[pos]);			
		}
	}
}
