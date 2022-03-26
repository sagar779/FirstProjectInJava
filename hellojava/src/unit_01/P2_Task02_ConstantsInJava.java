package unit_01;

public class P2_Task02_ConstantsInJava {
	private static final double pi=3.14;
	
	public static void main(string[] args) {
		
		final int a = 10;
		
		System.out.println(pi);
		System.out.println(a);
		
		add(1,2);
		multi(1,2);
		
		Calculator obj =new Calculator();
		System.out.println(obj.add(1,2));
		System.out.println(obj.aj);
	}
	
	static int add(int a,int b) {
		System.out.println(a);
		System.out.println(pi);
		
		return (a+b);
	}

}
class Calculator{
	
	int a=10;
	
	int add(int a,int b) {
		
		System.out.println(pi);
		
		return (a+b);
	}
	
	int multi(int a,int b) {
		
		return(a+b);
	}
}

