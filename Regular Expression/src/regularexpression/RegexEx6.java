package regularexpression;

import java.util.regex.Pattern;

public class RegexEx6 {

	public static void main(String[] args) {
		System.out.println("metacharacters d ...");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));

	}

}
