package com.Service;

public interface ProductInfo 
{
	public boolean PoductDeliver(double amount);
	public void shipped(String status);
	public void payment(String price);

}
