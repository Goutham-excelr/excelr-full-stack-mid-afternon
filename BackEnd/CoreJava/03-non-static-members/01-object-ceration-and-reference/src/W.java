class W 
{
	int i;
	static W test(W obj)
	{
		System.out.println("test(W) log 1:" +obj.i);
		W ref = new W();
		ref.i = obj.i;
		System.out.println("test(W) log2:" +ref.i);
		return ref;
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("main log 1:" +w1.i);
		w1.i = 10;
		System.out.println("main log 2:" +w1.i);
		W w2 = W.test(w1);
		System.out.println("main log 3:" +w2.i);
	}
}
