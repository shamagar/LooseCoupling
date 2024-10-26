package com.buyTheProducts;

import com.Service.DHL;

public class Main 
{

	public static void main(String[] args) 
	{
		ProductStatus pro = new ProductStatus();
		pro.setSer(new DHL());
		
		Boolean status = pro.Done(45.23);
		
		if(status)
			System.out.println("Delivered Successfully");
		else
			System.out.println("Failed ");

	}

}
