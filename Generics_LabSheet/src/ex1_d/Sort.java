package ex1_d;


public class Sort {
	
	public <T extends Number> void bubbleSort(T[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int r = 0; r < arr.length - i -1; r++) {
				if(arr[r].doubleValue() > arr[r + 1].doubleValue()) {
					T temp = arr[r];
					arr[r] = arr[r+1];
					arr[r+1] = temp;
				}
			}
		}
	}
	
	public <T extends Number> void display(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Float arr1[] = {41f, 56f,11f, 51f, 10f};
		Double arr2[] = {1.1,2.3,3.3,4.4,5.5,6.6,7.7};
		
		Sort s1 = new Sort();
		s1.bubbleSort(arr1);
		s1.display(arr1);
		
		Sort s2 = new Sort();
		s2.bubbleSort(arr2);
		s2.display(arr2);
	}

}
