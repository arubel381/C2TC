package regularexpression;

import java.util.regex.Pattern;

public class RegexEx5 {

	public static void main(String[] args) {
		System.out.println("+ quantifier ...");
		System.out.println(Pattern.matches("[amn]+", "aa"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));
		System.out.println(Pattern.matches("[amn]+", "aazzta"));
		System.out.println("* quantifier ...");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));
		

	}

}
