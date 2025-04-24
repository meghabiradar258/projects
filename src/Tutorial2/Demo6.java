package Tutorial2;

public class Demo6 {
	//non ststic mathod with return type and 2 int args
		public int m1(int a, int b, int d) {
			int c=a+b+d;
			
			return c;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 obj =new Demo6();
		int c=obj.m1(20, 25,5);
		System.out.println(c);
		
	}

}
