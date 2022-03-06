package generics2.impl3;

public class Generic {

	public static void main(String[] args) {
		GClassImpl<String,Integer> gclassimpl = new GClassImpl<>();
		gclassimpl.setValue("a");
		gclassimpl.setK(1000);
		
		String value = gclassimpl.getValue();
		Integer k = gclassimpl.getK();
		System.out.println(value);
		System.out.println(k);
		

	}

}
