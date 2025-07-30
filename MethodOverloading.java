package constructor;
class shape{
	public int area(int side) {
		System.out.println("i am square");
		return side *side;                                              
	}
	public int area(int l,int b) {
	System.out.println("i am rectangle");
	return l*b;
	}
	public float area(float radius) {
		System.out.println("iam circle");
		return 3.14f*radius*radius;
	}}
public class MethodOverloading {
public static void main(String[]arg) {
	shape s1 =new shape();
	System.out.println("area is: "+s1.area(5));
	shape s2=new shape();
	System.out.println("area is: "+s2.area(5,4));
	shape s3=new shape();
	System.out.println("area is: "+s1.area(2f));
     }
}


