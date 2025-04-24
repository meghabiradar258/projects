package Tutorial1;

public class Demo2 {
public void m1() {
	System.out.println("M1 method create");//3
}
	public static void main(String[] args) {
		System.out.println("main method started");//1
		Demo2 obj=new Demo2();
		System.out.println("Objective Created");//2
		obj.m1();
		System.out.println("main method ended");//4
		

	}

}
