package Tutorial1;

public class Demo7 {
	//non static method without return type 2 args
	public void m1(int a,int b) {
		System.out.println("print a+b=" +(a+b));
		System.out.println("print a-b" +(a-b));
		System.out.println("print a*b" +(a*b));
		System.out.println("print a%b" +(a%b));
	}

	public static void main(String[] args) {
		Demo7 obj= new Demo7();
		obj.m1(20, 10);
		System.out.println("======================");
		obj.m1(40, 10);
		
		

	}

}
