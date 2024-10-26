package com.Service;


public class Usps implements ProductInfo
{
	@Override
	public boolean PoductDeliver(double amount)
	{
		System.out.println("Deliver the product through Usps with price of $ "+amount);
		return true;
	}
	@Override
	public void shipped(String status)
	{
		System.out.println("Your package is shipped through Usps "+status);
	}
	@Override
	public void payment(String price)
	{
		System.out.println("Your total price is  with tax is $"+price);
	}
}
