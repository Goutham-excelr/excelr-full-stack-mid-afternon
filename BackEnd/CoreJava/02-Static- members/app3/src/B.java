class B 
{
	static
	{
		System.out.println("B-SIB1");
	}

	public static void main(String[] args) 
	{
		System.out.println("B-main-begin");
		A.main(args);
		System.out.println("-------");
		A.main(null);
		System.out.println("B-main-end");
	    B.main(args);
		}
	static
	{
		System.out.println("B-SIB2");
	}
}
