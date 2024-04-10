package october_2019_B_03;

// not completed

import java.util.List;
import java.util.SortedSet;

// part2

import java.util.TreeSet;

class AscendingList <T extends Number>{
	
	TreeSet<T> listSet;
	
	public AscendingList(TreeSet<T> listSet) {
		super();
		this.listSet = listSet;
	}

	private void displayMyList(TreeSet<T> listSet) {
		System.out.println("Displaying Ascending list...");

		for(int i = hashCode(); i < listSet.size(); i++) {
			System.out.println(listSet);
		}
		/*
		for(T value : listSet) {
			System.out.println(value);
		}
		*/
		System.out.println();
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		AscendingList<SortedSet<Integer>> asscendingList = new AscendingList<>();
		SortedSet<Integer> list = new TreeSet<>();
		
		list.add(80);
		list.add(50);
		list.add(100);
		
		asscendingList.displayMyList(asscendingList);
	}

}
