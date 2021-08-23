package cisco.java.programs;

public class Shape {
int s,b,h;
float r;
Shape()
{
	System.out.println("Default constructor");
}
Shape(int i)
{
	s=i;
}
public void Display1()
{
	System.out.println("Area of square is "+(s*s));
}
Shape(int i,int j)
{
	b=i;
	h=j;
}
public void Display2()
{
	System.out.println("Area of rectangle  is "+(b*h));
}
Shape(float i)
{
	r=i;
}
public void Display3()
{
	System.out.println("Area of circle  is "+(0.14*r*r));
}
public void Area(int d1,int d2)
{
	int rh=(1/2)*d1*d2;
	System.out.println("Area of rhombus   is "+rh);
}
public void area()
{
	int s1=5,s2=9;
	int tr=(1/2)*s1*s2;
	System.out.println("Area of Triangle  is "+tr);
}
	public static void main(String[] args) {
Shape s=new Shape();
Shape s1=new Shape(4);
s1.Display1();
Shape s2=new Shape(8,4);
s2.Display2();
Shape s3=new Shape(4.0f);
s3.Display3();
s.area();
s.Area(2,9);
	}

}