package cisco.java.programs;
public class HW1 {
		public static int Calculate()
		{
			int num1,num2,ans;
			num1=25;
			num2=30;
			ans=num1+num2;
			System.out.println("addition if two numbers is "+ans);
			return 0;
		}
		public static float circle()
		{
			float circle=7;
			float area=(22*circle*circle)/7;
			System.out.println("area of circle is: "+area);
			return 0;

		}
		public static int Rectangle()
		{
			int length=10;
			int breadth=5;
			int area =length*breadth;
			System.out.println("area of rectangle is "+area);
			return 0;
		}
	public static void main(String[] args) {
		HW1.circle();
		HW1.Rectangle();
		HW1.Calculate();
	}

}