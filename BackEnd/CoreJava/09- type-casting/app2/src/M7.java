class M7 
{
	public static void main(String[] args) //reference casting
	{
		A a1 = null;
		B b1 = null;
		C c1 = null;
		D d1 = null;

		a1 = b1;//a1 = (A) b1;
		b1 = c1;
		c1 = d1;

		System.out.println("Hello World!");
	}
}
