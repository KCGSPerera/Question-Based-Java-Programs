package november_2022_A_01;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		
		PermanentEmp perEmployee1 = new PermanentEmp(101, "Nimali", 56000.00);
		PermanentEmp perEmployee2 = new PermanentEmp(102, "Amal", 74000.00);
		
		ArrayList<PermanentEmp> list1 = new ArrayList<>();
		list1.add(perEmployee1);
		list1.add(perEmployee2);
		
		perEmployee1.calculateNetSalary();
		perEmployee2.calculateNetSalary();

		TemporaryEmp temEmployee1 = new TemporaryEmp(201, "Sunil", 10, 500.00);
		TemporaryEmp temEmployee2 = new TemporaryEmp(201, "Sunil", 10, 500.00);
		
		ArrayList<TemporaryEmp> list2 = new ArrayList<>();
		list2.add(temEmployee1);
		list2.add(temEmployee2);
		
		temEmployee1.calculateNetSalary();
		temEmployee2.calculateNetSalary();

		
		
		
		
	}

}
