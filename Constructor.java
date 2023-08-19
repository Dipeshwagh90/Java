class abc
{
  abc()
  {
   System.out.println("Constructor function is Calling");
  }
  public void finalize()
  {
   System.out.println("Destructor function is Calling");
   }
}
class Constructor
{
 public static void main(String args[])
 {
  abc a1=new abc();
  a1.finalize();
 }
}