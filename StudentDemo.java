package constructor;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollNumber,String name,int m1, int m2,int m3){
		this.rollNumber=rollNumber;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public void calculateAverage() {
		avg=(m1+m2+m3)/3;
	}
	public void displyDetails() {
		System.out.println("rollNumber" +rollNumber);
		System.out.println("name: " +name);
		System.out.println("mark1: " +m1);
		System.out.println("mark2: " +m2);
		System.out.println("mark3: " +m3);
		System.out.println("average: "+avg);
	}
}
public class StudentDemo {
	public static void main(String[]arg) {
		Student s1 =new Student(1,"priya",50,55,60);
		s1.calculateAverage();
		s1.displyDetails();
		Student s2 =new Student(2,"riya",40,45,60);
		s2.calculateAverage();
		s2.displyDetails();
		
		
	}

}
