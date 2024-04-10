package star_patterns;

public class Triangle01 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 8; i++) {
			for(int r = 8; r > i; r--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
