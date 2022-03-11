package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
 public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

public void bookProduct(float deliveryCharge )
 {
	 System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: " +deliveryCharge);
 }

@Override
public String toString() {
	return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}


 
}
