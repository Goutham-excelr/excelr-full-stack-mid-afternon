class I //Error because of constructor is cannot appiled
{
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		I i1 = new I(10);
		System.out.println("done");
	}
}
