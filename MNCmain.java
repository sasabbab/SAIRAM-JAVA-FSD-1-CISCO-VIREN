package oops;

abstract class MNC
{ MNC()
	{
	System.out.println("Im in mnc default constructor"); 
}
public void method1()
{
	System.out.println("method in mnc");
}
abstract public void dept();

abstract public void org();
}
abstract class infosys extends MNC {

abstract public void dept();

public void org() {

System.out.println(" in Infosys");

}
}
 class Hello2 extends infosys
{
	public void dept()
	{
		System.out.println("Dept method in hello2");
	}
	public void method2()
	{
		System.out.println("method in hello2");
	}
}
public class MNCmain{
	 public static void main(String[]args)
	 {
		 infosys i  = new Hello2();
		 Hello2 ob =new Hello2();
		 i.method1();
		 ob.method1();
		 ob.method2();
		 i.dept();
		 i.org();
	 }
}