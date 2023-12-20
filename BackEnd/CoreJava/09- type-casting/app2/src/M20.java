class M20 
{
	public static void test(Object obj)
	{
		if(a1 instanceof Object)
		{
			System.out.println("we can cast to Object");
			Object obj1 = (Object)obj;
		}
		else if (Obj instanceof A)
		{
			system.out.println("we can cast to A");
			A a1  = (A)obj;
		}
		else if (Obj instanceof B)
		{
			system.out.println("we can cast to B");
			B b1  = (B)obj;
		}
		else if (Obj instanceof C)
		{
			system.out.println("we can cast to C");
			C c1  = (C)obj;
		}
		else if (Obj instanceof D)
		{
			system.out.println("we can cast to D");
			D d1  = (D)obj;
		}
	}
	public static void main(String[] args) 
	{
		Object obj1 = new Object();
		test(Obj1);
		System.out.println("------------------");
		Object obj2 = new A();
		test(obj2);
		System.out.println("------------------");
		Object obj3 = new B();
		test(obj3);
		System.out.println("------------------");
		Object obj4 = new C();
		test(obj4);
		System.out.println("------------------");
		Object obj5 = new D();
		test(obj5);
		System.out.println("Hello World!");
	}
}
