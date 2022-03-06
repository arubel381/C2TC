package generics1;

import java.util.List;

public class MyGenericClass1<T> {
	
	private List<T> list;
	
	public List<T> getList()
	{
		return list;
	}
	public void setList(List<T> list) 
	{
		this.list = list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
