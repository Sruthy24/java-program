package lab;
import java.util.Scanner;
public class Oddeven {
	public static void main(String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num");
		int number =sc.nextInt();
		if(number %2 ==0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
