package Tutorial2;

public class Demo7 {
	public void m1() {
		System.out.println("non static method without return type 0 arg");
	}
public void m2(int a, int b) {
	System.out.println("non Static method without return type 2 int arg =" +(a+b));
}
public boolean m3() {
	System.out.println("non static method with ruturn type 0 arg");
	return true;
	}
public String m4(String a,int b) {
	System.out.println("non static method with ruturn type 2 arg");
	return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 obj = new Demo7();
		obj.m1();
		obj.m2(10, 20);
		obj.m3();
		obj.m4("mk", 10);

	}

}
