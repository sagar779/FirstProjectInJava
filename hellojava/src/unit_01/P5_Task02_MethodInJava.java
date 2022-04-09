package unit_01;

public class P5_Task02_MethodInJava {
	
	public static void main(String[] args) {
		ABC3 Obj = new ABC3();
		
		//Calling display method definition
		Obj.display();
		System.out.println(Obj.a);
		
	}

}

class ABC3 {
	
	static int a= 10;
	
	static void display() {
		
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2() {
		 
		System.out.println(a);
		
		return a;
	}
	
}
