package Tutorial1;

public class Demo4 {
	public void m1(){
		int a=10;
		int b=20;
	    System.out.println("a+b"+(a+b));
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Demo4 obj =new Demo4();
		System.out.println("obj create");
		obj.m1();
		System.out.println("main method ended");

	}

}
