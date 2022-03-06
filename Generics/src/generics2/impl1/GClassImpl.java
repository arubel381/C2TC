package generics2.impl1;

import generics2.GInterface;

public class GClassImpl<E> implements GInterface <E> {

	private E e;
	@Override
	public void setValue(E e) {
		this.e =e;
		
	}

	@Override
	public E getValue() {
		return e;
	}

}
