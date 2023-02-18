package FactoryPatterns;

public class FactoryMain {

	public static void main(String[] args) 
	{

		OperatingSytemFactory fact = new OperatingSytemFactory();
		
		OS osObj = fact.getInstance("open");
		
		osObj.os();

	}

}
