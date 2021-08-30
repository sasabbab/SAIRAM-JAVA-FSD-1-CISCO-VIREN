package cisco.java.programs;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		String input = "";
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter the string to check");
		input =S1.nextLine();
		if(input.length()<50)
		{
			StringPalindrome obj = new StringPalindrome();
			boolean res = obj.Palindrome(input);
			if(res==true) {
				System.out.println(input +" is palindrome");
			}
			else {
				System.out.println(input+" is not a palindrome");
			}
		}
		else {
			System.out.println("OOPS !! your input exceeded the limit of its length");
		
		}
	}
	private boolean Palindrome(String input) {
		String rev ="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		if(rev.equals(input)) {
			return true;
		}
		else return false;
	}

}
