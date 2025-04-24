package Tutorial2;

public class Demo4 {
	//non ststic mathod with return type 2 args
	public String m1(String a, String b) {
		String c=a.concat(b);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 obj =new Demo4();
		String c=obj.m1("mukund", "Mukund");
		System.out.println(c);
	}

}
