package com.Service;

public class Amazon implements ProductInfo
{
	@Override
	public boolean PoductDeliver(double amount)
	{
		System.out.println("Deliver the product through Amazon with price of $ "+amount);
		return true;
	}
	@Override
	public void shipped(String status)
	{
		System.out.println("Your package is shipped through Amazon "+status);
	}
	@Override
	public void payment(String price)
	{
		System.out.println("Your total price is  with tax is $"+price);
	}

}
