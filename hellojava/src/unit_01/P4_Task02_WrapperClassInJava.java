package unit_01;

public class P4_Task02_WrapperClassInJava {
	 
	public static void main(String[] arge) {
		//Converting int into Integer
		int a = 20;
		String s ="" + a + "";
		Integer i = Integer.valueOf(a);
		Integer j = a;
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		//a.toString() Can not be done due to a is int not object
		
		// Autoboxing: Converting primitive into objective
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//unboxing: Converting Objects to primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
		
	}

}
