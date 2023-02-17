package CoreJavaBasics;

class MMM<Integer>
{
	int b;
	int c;
	public int a(int a)
	{
		this.b= a*a;
		
		return this.b;
	}
	public int e(int d)
	{
		c= d +3;
		return this.c;
	}
	public void display()
	{
		System.out.println(" the value of method a " + b + " the value of method c  is" + c );
	}	
}
public class MethodPractise {
	public static void main(String[] args) 
	{
		MMM objM = new MMM();
		int y = objM.b = 5;		
		int x = objM.a(y);
		System.out.println(x);		
	}
}
