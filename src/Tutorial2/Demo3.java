package Tutorial2;

public class Demo3 {
	//non ststic with return type 0 arg
	public String m1() {
		String a="Mukund";
		String b="Mukund";
		return a.concat(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 obj=new Demo3();
		String c=obj.m1();
		System.out.println(c);
	}

}
