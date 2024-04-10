package ex1_a;

public class Sort {

	void bubbleSort(int arr[])
	 {
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		
		System.out.println();
		System.out.println("Sorted Array : ");
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i] + " " );
		}
	 }
	
	public static void main(String[] args) {

		int [] arr = {41,12,35,14,55,36,97,8,29,43};
		
		Sort sort = new Sort();
		sort.bubbleSort(arr);
	}

}
