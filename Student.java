
package cisco.java.programs;

public class Student {
String name;
int age;
char section;
char gender;
int sub1,sub2,sub3,sum;
float percent;
Student(String n,int a,char s,char g,int s1,int s2,int s3)
{
	name=n;
	age=a;
	section=s;
	gender=g;
	sub1=s1;
	sub2=s2;
	sub3=s3;
}
Student(String n,int a,char s,char g,int s2,int s3)
{
	name=n;
	age=a;
	section=s;
	gender=g;
	sub2=s2;
	sub3=s3;
}
public void  calculate()
{
	sum=sub1+sub2+sub3;
	percent=(sum*100)/300;
	System.out.println("total marks of student : "+sum);
	System.out.println("percentage: "+percent);


}
	public static void main(String[] args) {
int s1,s2,s3;
Student stu1 =new Student("john",21,'A','M',75,80,85);
Student stu2 =new Student("wick",20,'B','M',55,50);
Student stu3 =new Student("mary",22,'C','F',70,81);
Student stu4 =new Student("aish",23,'D','F',66,90);
stu1.calculate();
stu2.calculate();
stu3.calculate();
stu4.calculate();


	}

}