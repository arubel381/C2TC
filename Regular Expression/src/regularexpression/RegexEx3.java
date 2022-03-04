package regularexpression;
import java.util.regex.*;
public class RegexEx3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
	}

}
