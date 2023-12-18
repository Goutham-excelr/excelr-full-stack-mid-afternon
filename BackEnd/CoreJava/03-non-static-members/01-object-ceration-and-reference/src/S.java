class S 
{
	int i;

	static void test(S obj)
	{
		obj.i =20;
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 10;
		System.out.println("before calling test(S): "+s1.i);
		//Call by reference or pass by reference
		//Changes in the destination would reflect to the source
		//its like we are  sending the key to the object itself by supplying thr reference
		//if you are sending a reference, there would be a 100% chance to modify the objects data member
		S.test(s1);
		System.out.println("after calling test(S): "+s1.i);
	}
}
