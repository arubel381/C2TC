package generics2.impl3;

import generics2.GInterface;

public class GClassImpl<E,K> implements GInterface<E>{

	private E e;
	private K k;

	@Override
	public void setValue(E e) {
		this.e=e;
		
	}

	@Override
	public E getValue() {
		return e;
	}
	
	public void setK(K k) {
		this.k=k;
		
	}

	public K getK() {
		return k;
	}


}
