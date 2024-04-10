package november_2022_A_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int count;
		String p1;
		String p2;
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pattern 1 : ");
		p1 = scanner.nextLine();
		
		System.out.println("Enter pattern 2 : ");
		p2 = scanner.nextLine();
		
		System.out.println("Enter iteration count : ");
		count = scanner.nextInt();
		
		Object lock = new Object();
		Pattern01 pattern01 = new Pattern01(lock, p1, count);
		pattern01.setName("Pattern 01 Thread");
		pattern01.start();
		
		Pattern02 pattern02 = new Pattern02(lock, p2, count);
		pattern02.setName("Pattern 02 Thread");
		pattern02.start();
		
		scanner.close();
		
	}

}
