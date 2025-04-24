package Tutorial1;

public class Demo6 {
//nom static method without return type multiple arg
	public void m1(int a) {
		System.out.println("print a : "+a);
	}
	public static void main(String[] args) {
		Demo6 obj =new Demo6();//obj create
		obj.m1(10);

	}

}
