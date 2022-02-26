package collections1;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Examples {

	public static void main(String[] args) {
		Set<String> vowels = new LinkedHashSet<String>(); 
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		List <String> vowelslist = new ArrayList<String>(vowels);
		System.out.println("VowelsSet : " + vowels);
		System.out.println("VowelsList : " + vowelslist);
		vowels.add("a");
		vowelslist.add("e");
		vowelslist.add("u");
		System.out.println("VowelsSet : " + vowels);
		System.out.println("VowelsList : " + vowelslist);
		vowels = new HashSet<>(vowelslist);
		System.out.println("VowelsSet : " + vowels);

	}

}
