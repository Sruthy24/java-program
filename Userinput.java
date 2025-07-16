package lab;
import java.util.Scanner;
public class Userinput {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		System.out.println("the number: "+number);
	}


}
