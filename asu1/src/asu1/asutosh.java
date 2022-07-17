public class asutosh
{
	void asu1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");
	}
	int asu1(int a, int b, int c)
	{
		System.out.println(a);
		asutosh bobj=new  asu1();
		String s=bobj.asu1(100,"java is awesome");
		System.out.println(s);
		return a-b;
	}
	String asu1(String s,int b,int d)
	{
		System.out.println(b+d);
		return s;
	}
	int meth4(int e,int k)
	{
		System.out.println(k);
		asutosh bobj=new asutosh();
		int result=bobj.asutosh(50,50,50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a,String L)
	{
		System.out.println(a+a);
		asutosh bobj=new asutosh();
		String s = bobj.meth3("Hi", 15, 10);
		System.out.println(s);
		return L;
	}
	public static void main(String[]args)
	{
		asutosh bobj=new asutosh();
		System.out.println("START");
		int result=bobj.meth4(20,10);
		System.out.println(result);
		bobj.asutosh();
	}
	
}
