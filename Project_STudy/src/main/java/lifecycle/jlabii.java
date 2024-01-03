package lifecycle;

public class jlabii
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public jlabii() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() 
	{
		
		System.out.println("Inside init method");
		
	}
	public void destroy() 
	{
		
		System.out.println("Inside destroy method");
	}
	

	@Override
	public String toString() {
		return "jlabii [price=" + price + "]";
	}
}
