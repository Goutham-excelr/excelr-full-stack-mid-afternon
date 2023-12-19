class S
{
	static void test(double d)
	{
		System.out.println("test(double): " +d);
		return (int)d;
	}
	public static void main(String[] args) 
	{
		
		int i = test(200);
		long l = test(10.0);
		System.out.println("i:"+i+","+"l"+l+","+"done");
	}
}
