package SingletonDesignPattern;

class Xyz
{
	public static Xyz obj;
	
	private Xyz()
	{
		System.out.println("Instance created.");
	}
	
	public static Xyz getInstance()
	{
		if(obj == null)
		{
			obj = new Xyz();
		}		
		return obj;
	}
	
}

enum Xxx
{
	INSTANCE;
	int i;
	
	public void show()
	{
		System.out.println(i);
	}
}

public class SingletonDemo 
{
	public static void main(String[] args) 
	{
		//normal singleton class
		Xyz obj = Xyz.getInstance();
		Xyz obj0 = Xyz.getInstance();
		
		if(obj == obj0)
		{
			System.out.println("both objects are same hence its single instance class");
		}
		else
		{
			System.out.println("its not a singleton class");
		}
		
		// singleton using enum 
		Xxx obj1 = Xxx.INSTANCE;
		obj1.i = 5 ;
		obj1.show();
		
		Xxx obj2 = Xxx.INSTANCE;
		obj2.i = 6 ;
		obj1.show();
	}
}
