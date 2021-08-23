package cisco.java.programs;
import java.io.*;
import java.util.*;
public class A {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
LinkedHashSet l1=new LinkedHashSet();
TreeSet<String> t =new TreeSet<String>();
LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
System.out.println("Enter hashset inputs");
l1.add(sc.nextInt());
l1.add(sc.nextInt());
l1.add(sc.nextFloat());
l1.add(sc.nextFloat());
l1.add(sc.next());
l1.add(sc.next());
l1.add(sc.nextBoolean());
l1.add(sc.nextBoolean());
System.out.println("values of L1:"+l1);
System.out.println("Enter eight integer values");
for(int i=1;i<=8;i++)
{
	l2.add(sc.nextInt());
}
System.out.println("values of L2"+l2);
t.add("Java");
t.add("C");
t.add("C++");
t.add("Data structures");
t.add("Python");
t.add(".net");
System.out.println(t.remove(".net"));
System.out.println(t.remove("Python"));
System.out.println("After removing :"+t);
t.add("AI");
t.add("ML");
t.add("IOT");
System.out.println("After adding 3 languages:"+t);
System.out.println("Is set containing Java :"+t.contains("Java"));
t.clear();
System.out.println("After removing all the elements :"+t);
	}

}
