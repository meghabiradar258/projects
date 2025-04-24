package Tutorial1;

public class Lg1 {
	public void m1(String m) {
		int kk=m.length()-1;
		for(int i=kk;i>=0;i--)
			System.out.println(m.charAt(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lg1 obj=new Lg1();
obj.m1("pratibha");
	}

}
