package SortingAlogorithms;

public class QuickSort {
	
	
	//Quick Sort Method
	private void quickSort(int[] array, int low, int high) {
		
		if(low < high) {
			
			//Partition the array and get pivot index
			int pivotIndex = partition(array,low,high);
			
			//Recursively sort left side
			quickSort(array, low, pivotIndex - 1);
			
			//Recursively sort right side
			quickSort(array, pivotIndex + 1, high);
			
			
		}
		
	}

	
	//Partiton Method
	private int partition(int[] array, int low, int high) {
		
		//Choosing Last element as pivot
		int pivot = array[high];
		
		int i = low - 1; //Pointer for smaller element
		
		for(int j = low; j< high; j++) {
			
			if(array[j] < pivot) {
				 i++;
				 
				 //Swap array[i] and array[j]
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
				 
			
			}
			
		}
		
		//Place pivot in correct position
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		
		return i+1; //Return pivot index
	}
	

	//Print Array Method
	void printArray(int[] array) {
		
		int count = 0;
		
		for (int num : array) {
			System.out.print(num);
			
			count++;
			
			if(count != array.length) {
				System.out.print(",");
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		QuickSort q1 = new QuickSort();
		
		int []array = {5,2,1,10,7,6,19};
		
		System.out.println("\n Before Sorting:");
		
		
		q1.printArray(array);
		
		q1.quickSort(array,0,array.length-1);
		
		
		//Lets print the elements
		
		System.out.println();
		System.out.println("\n After Sorting:");
		
		q1.printArray(array);
		
	}

	

}
