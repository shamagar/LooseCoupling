package com.buyTheProducts;

import com.Service.ProductInfo;

//import com.Service.ProductInfo;

public class ProductStatus 
{
	//private com.Service.ProductInfo ser;
	private ProductInfo ser;

	public void setSer(ProductInfo ser) 
	{
		this.ser = ser;
	}
	
	public Boolean Done(double amount)
	{
		return ser.PoductDeliver(amount);
	}
	
	public void doneShipped(String str)
	{
		ser.shipped(str);
	}

}
