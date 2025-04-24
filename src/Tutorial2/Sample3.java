package Tutorial2;

public class Sample3 extends Sample2 {
	public void s1() {
		System.out.println("Sa method start");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj =new Sample3();
		//Sample3 obj =new Sample2(); can't convert child to parent class
		obj.m1();
		obj.m2();
		obj.s1();
		
	}

}
