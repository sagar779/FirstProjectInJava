package Assignment_01;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {

		arithmetic obj  = new arithmetic();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		a = (a > b)?obj.add(a, b):obj.sub(a, b);
		s.close();
	}

}


class arithmetic
{
	int add(int a, int b)
	{
		return a+b;
	}

	int sub(int a, int b)
	{
		int res = a - b;
		if(res < 0)
		{
			return 0;
		}
		return res;
	}

}
