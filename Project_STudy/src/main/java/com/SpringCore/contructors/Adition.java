package com.SpringCore.contructors;

public class Adition 
{
	private int a ;
	private int b;
	public Adition(int a ,int b) 
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor :int="+this.a +",int="+this.b);
		
	}
	public Adition(double a ,double b) 
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor :double ,double ");
		
	}
	public Adition(String a,String b) 
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor :String,String");
		
	} 
	public void dosum() 
	{
		System.out.println("SUm is "+(this.a+this.b));
	}
	
	
}
