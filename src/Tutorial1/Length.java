package Tutorial1;

public class Length {
public void m1(String a) {
	int kk=a.length()-1;
	for(int i=kk;i>=0;i--) {
		System.out.print(a.charAt(i));
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length obj =new Length();
		obj.m1("mukund");

	}

}
