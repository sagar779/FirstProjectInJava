package unit_01;

public class P3_Task02_OperatorsInJava {
	
	/*
	 * operators in java is a symbol that is used to perform operations 
	 * sum=a+b;
	 * 	for example: +,-,*,/
	 * 	#types of operators in java
	 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
	 * 		-Arithmatic operators: {*,-,/,+,%}
	 * 		-Shift operators: {<< , >>}
	 * 		-relational operators: {> < <= >= !=
	 * 		-Bitwise operators : {& ^ |}
	 * 		-Logical operators : {&& ||}
	 * 		-ternary operators: {? : }
	 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
	 */

public static void main(String[] args) {
	
	OperatorsInJava obj = new OperatorsInJava();
	
	obj.unaryop();
	obj.arithmatic();
	obj.shiftop();
	obj.relationalop();
	obj.bitwise();
	obj.TernaryOpeerator();
	obj.AssignementOperators();
		

	}

}
class OperatorsInJava
{
	void unaryop() {
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
	}
	void arithmatic()
	{
		int a=10,b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	void shiftop()
	{
		System.out.println(10<<2);
		System.out.println(10>>2);
	}
	void relationalop() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void bitwise()
	{
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println(a<b && a++<c);
		System.out.println(a);
		System.out.println(a<b & a++<c );
		System.out.println(a);
		
		//Local || and Bitwise |
		System.out.println(a>b||a<c);
		System.out.println(a>b|a<c);
		System.out.println(a>b||a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);
		System.out.println(a);
		
		System.out.println("Biteise include OR"+(12|12));
		System.out.println("Bitwise exclusive OR"+(12^12));
		
		System.out.println("\n");
		
	}
	void TernaryOpeerator() {
		System.out.println("Inside TernaryOpoerator");
		int a = 2;
		int b  = 5;
		int min =(a<b)? a:b;
		System.out.println(min);
		
		System.out.println("\n");
	}
	void AssignementOperators() {
		System.out.println("Inside AssignementOperator");
		
		int a=10;
		int b=20;
		a+=4;
		b-=4;
		System.out.println(a);
		System.out.println(b);
		
		
		b>>>=2;
		System.out.println(b);
		
		a=10;
		a+=3;
		System.out.println(a);
		a-=4;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		
		System.out.println("\n");
	}
	
}


