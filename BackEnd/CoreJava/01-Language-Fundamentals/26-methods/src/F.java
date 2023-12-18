class F
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test1();
		System.out.println("from main end");
	}
	public static void test1()
	{
		System.out.println("from test 1 begin");
		if(true)
		{
			for(int i = 1;i<=5;i++)
			{
				int j = 0;
				while (j<=1)
				{
					int K = 10;
					do
					{
						System.out.println("from do-while body");
						k++;
					}
					while (k<=12);
				    j++;
				}
			}
		}
		System.out.println("from main end");
	}
}
	
	