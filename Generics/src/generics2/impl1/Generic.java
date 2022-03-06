package generics2.impl1;

public class Generic {

	public static void main(String[] args) {
		GClassImpl<Integer> gclassimpl1 = new GClassImpl<Integer>();
		gclassimpl1.setValue(1000);
		Integer value = gclassimpl1.getValue();
		System.out.println(value);

	}

}
