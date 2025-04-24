package Tutorial1;

public class Demo8 {
public void m1(String a,String b) {
	System.out.println(a==b);
	System.out.println(a.equals(b));
	System.out.println(a.concat(b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 obj =new Demo8();
		obj.m1("Mukund", "mukund");
		System.out.println("============");
		obj.m1("ashu", "ashu");

	}

}
