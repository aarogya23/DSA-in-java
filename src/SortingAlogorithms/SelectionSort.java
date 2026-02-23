package SortingAlogorithms;

public class SelectionSort {
	
	//Function to perform selection sort
	 void selectionSort(int[] array) {
		 
		 for(int i = 0; i < array.length; i++) {
			 int min = i;
			 
			 for(int j = i+1; j<array.length; j++) {
				 if(array[j] < array[min]) {
					 min = j;
				 }
			 }
			 
			 //lets swap the position of each value inside the array
			 int temp = array[min];
			 array[min] = array[i];
			 array[i] = temp;
			 
			 
			 
		 }
			
			
		}

	
	public static void main(String[] args) {
		
		SelectionSort s1 = new SelectionSort();
		
		int [] array = {5,3,7,4,2};
		
		s1.selectionSort(array);
		
		int count = 0;
		
		for(int num : array) {
		
			//Lets remove the last comma
			System.out.print(num);
			
			count++;
			
			if(count != array.length) {
				System.out.print(", ");
			}
		}
		
		
	}

	
}
