package SortingAlogorithms;

public class insetionSort {
	
	
	
	private void insertSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			int currentValue = array[i];
			
			int j = i - 1;
			
			while(j >=0 && array[j] > currentValue) {
				array[j+1] = array[j];
				j--;
			}
			
	    array[j+1] = currentValue;
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		insetionSort i = new insetionSort();
		
	
		int [] array= {4,2,8,10,5,7};
		//lets print the element before sorting
		
		System.out.println("Element before the sorting");
		
		int count = 0;
		
		for(int i1 : array) {
			
			System.out.print(i1);
			
			
			count++;
			if(count != array.length) {
				System.out.print(",");
			}
			
		}
		
		i.insertSort(array);
		
		System.out.println();
		System.out.println();
		System.out.println("Element after the sorting");
		int c = 0;
		for(int num : array) {
			System.out.print(num);
			c++;
			
			if(c != array.length) {
				System.out.print(",");
			}
		}
	}

	

}
