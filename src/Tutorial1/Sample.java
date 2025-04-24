package Tutorial1;

public class Sample {
	public void m1(String l) {
		int mm=l.length()-1;
		for(int i=mm;i>=0;i--)
				System.out.println(l.charAt(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.m1("java");
		obj.m1("kumkum");

	}

}
