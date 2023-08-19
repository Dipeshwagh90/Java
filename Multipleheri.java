interface pack
{
 public void get();
}
class A
{
  int a,b;
 void get1()
 {
   a=10;
   b=10;
 }
}
class B extends A implements pack
{
 public void get()
 {
  System.out.println(a+b);
 }
}
class Multipleheri
{
 public static void main(String args[])
 {
  B b1=new B();
  b1.get1();
  b1.get();
 }
}