class K 
{
	static int X = 0;
	static void test1()
	{
		System.out.println("test1: "+X);
		X = 1;
	}
	static void test2()
	{
		System.out.println("test2: "+X);
		X = 2;
	}
	public static void main(String[] args) 
	{
		test1();
		System.out.println("main:"+X);
		test2();
		System.out.println("main:"+X);
	}
}
