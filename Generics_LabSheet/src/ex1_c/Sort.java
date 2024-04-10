package ex1_c;


public class Sort <T extends Number>{
T []t;
	
	public void setval(T []t) {
		this.t = t;
	}
	
	public T[] get() {
		return this.t;
	}
	
	public void bubbleSort() {
		
		for(int i = 0; i < t.length; i++) {
			for(int r = 0; r < t.length - i -1; r++) {
				if(t[r].doubleValue() > t[r + 1].doubleValue()) {
					T temp = t[r];
					t[r] = t[r+1];
					t[r+1] = temp;
				}
			}
		}
	}
	
	
	public void display() {
		System.out.println();
		for(int i = 0; i < t.length; i++) {
			System.out.println(t[i]);

		}
	}

	public static void main(String[] args) {
		
		Float arr1[] = {41f, 56f,11f, 51f, 10f};
		Double arr2[] = {1.1,2.3,3.3,4.4,5.5,6.6,7.7};
		
		Sort<Float> s1 = new Sort<>();
		s1.setval(arr1);
		s1.bubbleSort();
		s1.display();
		
		Sort<Double> s2 = new Sort<>();
		s2.setval(arr2);
		s2.bubbleSort();
		s2.display();
				
	}

}
