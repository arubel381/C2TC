package collections1;

import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<Integer> thelist = new TreeSet<Integer>();
		thelist.add(10);
		thelist.add(20);
		thelist.add(40);
		thelist.add(60);
		thelist.add(120);
		System.out.println("Tree Set : "+thelist);
        System.out.println("Head Set : "+thelist.headSet(40));
        System.out.println("Tree Set : "+thelist);
        System.out.println("Tail Set : "+thelist.tailSet(40));
	}

}
