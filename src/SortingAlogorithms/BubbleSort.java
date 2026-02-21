package SortingAlogorithms;

public class BubbleSort {
	
	void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					//swap the values
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		BubbleSort b1 = new BubbleSort();
		
		int [] arr = {4,2,8,9,1,7,18,11,0};
		
		b1.bubbleSort(arr);
		
		System.out.println("Sorted Array");
		
		//lets display the element inside an array
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
