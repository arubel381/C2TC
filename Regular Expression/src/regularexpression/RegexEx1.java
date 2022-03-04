package regularexpression;

import java.util.regex.*;

public class RegexEx1 {

	public static void main(String[] args) {
	//1st Way	
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
	//2nd Way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
	//3rd Way
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b+" "+b2+" "+b3);
		
		
		
	}

}
