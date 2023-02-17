package CoreJavaBasics;

public class SuperClassExample extends Aa implements InterfaceAa, InterfaceBb
{
	public void showSuperClassMethod()
	{
		System.out.println(" a method from super class !!!!");
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		InterfaceAa.super.show();
	}


	
}
