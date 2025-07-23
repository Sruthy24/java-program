package lab;
import java.util.Scanner;
public class grades {
	public static void main(String [] arg) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("enter the marks");
		double marks= Sc.nextDouble();
		if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks>=75){
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else if(marks>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("fail");
		}
	}

}
