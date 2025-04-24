package Tutorial3;

public class Demo3 {
	public void m1(String a) {
		int abc =a.length()-1;
		for(int i=abc;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
		
			
	public static void main(String[] args) {
		Demo3 obj= new Demo3();
		obj.m1("shrikant");
		obj.m1("kiran mukund");

	}

}
