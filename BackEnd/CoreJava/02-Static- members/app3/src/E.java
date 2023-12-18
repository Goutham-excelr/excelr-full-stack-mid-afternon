class E 
{
	static
	{
		i = 1;//modification is possiable befor its declaration
	}
	static int i = 2;
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
