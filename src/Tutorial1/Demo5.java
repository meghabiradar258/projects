package Tutorial1;

public class Demo5 {
//non static method without return type 0 args
	public void m1() {
		System.out.println("m1 method start demo 5");
	}
	public void m2() {
		System.out.println("m2 method start demo 5");
	}
	public static void main(String[] args) {
		Demo5 obj=new Demo5();
		obj.m1();
		obj.m2();
		
	}

}
