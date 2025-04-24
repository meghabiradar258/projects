package Tutorial2;

public class Sample5 extends Sample4 {

	public void m1(int a) {
		System.out.println("m1 method sample5");
		System.out.println("m1 method sample5");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample5 obj =new Sample5();
		obj.m1(10);
		obj.m1(10, 10);
		obj.m1(5, "Mukund");
		obj.m1("ashu", 55);
	}

}
