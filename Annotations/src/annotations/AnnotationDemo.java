package annotations;

import java.util.ArrayList;

@FunctionalInterface
interface abc
{
	void show();
}

class a
{
	public void display()
	{
		System.out.println("A");
	}
}

class b extends a
{
	@Deprecated
	public void show()
	{
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public void display()
	{
		ArrayList obj = new ArrayList();
		System.out.println("B");
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {
		b obj = new b();
		obj.display();
		obj.show();

	}

}
