package cisco.java.programs;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Project1
{
public static void menu() { //Method for Menu Options to choose
System.out.println(" "); //for the space
System.out.println("Select The Options:-");
System.out.println("1- To Check Directory list");
System.out.println("2- Add a File To Existing Directory List");
System.out.println("3- Delete a File From The Existing Directory List");
System.out.println("4- Search a File From The directory");
System.out.println("5- Exit");
System.out.println(" ");
}

public static void main(String[] args) { 

boolean Check = false;

Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to the project...");
System.out.println("-------------------------");
System.out.println("Name Of Project :- Virtual Key for Your Repositories ");
System.out.println("Developed By :- S.Sairam");
System.out.println("Designation :- Software Engineer Trainee");

System.out.println(" ");


do {
File file = new File("\\User\\sasabba\\Desktop\\Sairam");
String contents[] = file.list(); //Storing files & Name Of The Folder into a String array

menu(); // Calling The Menu Method

int data = scanner.nextInt();

switch (data)
{
case 1:

System.out.println("List of files and directories in the specified directory:\n");
for (int Fs = 0; Fs < contents.length; Fs++)
System.out.println(contents[Fs]);

break;
case 2: // To Add File In To The Directory
System.out.println("You Can Add Files Into Directory!");

try {
String str = scanner.next();
file = new File("\\User\\sasabba\\Desktop\\Sairam" + str);//path where you want to add a file

if (file.createNewFile()) { //If it returns True ,Then file was created
System.out.println("New File is created:" + file.getName());
} else {
if (file.exists()) {
System.out.println("File is already exist");
} else {
System.out.println("File doesn't exists");
}

}
} catch (IOException e) {
e.printStackTrace();
}

break;

case 3://To Delete a file In the Directory
System.out.println("Specify the correct file name you want to delete");
String str = scanner.next();

File file1 = new File("\\User\\sasabba\\Desktop\\Sairam"+ str);

int flag1 = 0;
for (int i = 0; i < contents.length; i++) {
Object check = contents[i];
if (str.equals(check)) {
flag1 = 1; //Flag Indicates,Given name of the file in directory got matched
if (file1.delete())
System.out.println("File deleted Successfully :" + file1.getName());
else
System.out.println("File Were Not deleted " + file1.getName());
break;
}
}
if (flag1 == 0)
System.out.println("Given File Input were doesn't exist");

break;

case 4:// To Search a file In the Directory
System.out.println("Enter the file name you want to search:");
String str1 = scanner.next();

String content[] = file.list();
boolean flag = false;

for (int i = 0; i < content.length; i++) {

Object check1 = content[i];
if (str1.equals(check1)) {
flag = true;
break;
}
}

if (flag == true)
System.out.println("File is FOUND..!");
else
System.out.println("File NOT FOUND..!");

break;

case 5: //To Close the Application
System.out.println("The application has been closed, Thank you");
Check = true;
scanner.close();

break;

}

} while (Check == false);

}

}