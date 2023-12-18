class E
{
	static
	{
		System.out.println("SIB1");
	}
	{
		System.out.println("IIB1");
	}
	E()
	{
		System.out.println("D()");
	}
	E(int i)
	{
		this();
		System.out.println("D(int)");
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("------------");
		E e2 = new E(10);
		System.out.println("------------");
	}
		{
			System.out.println("IIB2");
		}
		static
	{
		System.out.println("SIB2");
	}

}
