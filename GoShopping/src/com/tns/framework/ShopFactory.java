package com.tns.framework;

public abstract class ShopFactory {

	abstract public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges );
	abstract public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
	
}