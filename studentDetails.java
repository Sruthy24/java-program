package lab;
import java.util.Scanner;
public class studentDetails {
	String name;
	int rollNumber;
public void studentDetails() {
	System.out.println("name: "+name);
	System.out.println("rollNumber: "+rollNumber);
	}

public static void main(String[]arg) {
	Scanner sc = new Scanner(System.in);
	studentDetails std =new studentDetails();
	System.out.println("enter the name: ");
	std.name = sc.nextLine();
	System.out.println("enter the rollNumber: ");
	std.rollNumber= sc.nextInt();
	std.studentDetails();
}

}
