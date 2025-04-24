package Tutorial2;

public class Sample6 {

	public void m1() {
		System.out.println("m1 method start");
	}
	public void m2(int a, int b) {
		System.out.println("addition for a+b :" +(a+b));
	}
		
	public static void main(String[] args) {
	Sample6 obj =new Sample6();
	obj.m1();
	obj.m2(50,50);

	}

}
