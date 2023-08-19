import java.util.*;
class show
{
    int a,b,c;
	void get(int x)
	{
	  a=x;
	}
	void get(int y,int z)
	{
	  b=y;
	  c=z;
	}
	void get()
	{
	  System.out.println("Addition is"+(a+b+c));
	}
}
class overloading1
{
	public static void main(String args[])
	{
		show s1=new show();
		s1.get(20);
		s1.get(10,20);
		s1.get();
	}
}