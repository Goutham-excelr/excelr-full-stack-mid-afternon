class P 
{
	int i;
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println(i);

 		P p1 = new P();
		P p2 = p1;
		System.out.println(p1.i);
		System.out.println(p2.i);
		p1.i = 10;
		System.out.println(p1.i);
		p2.i = 20;
		System.out.println(p2.i);
	}
}
