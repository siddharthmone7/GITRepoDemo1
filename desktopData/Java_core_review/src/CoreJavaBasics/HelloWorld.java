package CoreJavaBasics;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class HelloWorld
{
  
   

	public static void main(String args[])
    {
		 SuperClassExample sub = new SuperClassExample();
		 Aa aa = new Aa();
		   // practice 1  	
    	System.out.println("Hello, World");    
    	sub.showSuperClassMethod();
    	sub.methodFromAa();
    	aa.show();
    	 sub.show();
    	 sub.showBb();
    	// practice 2
    	int a = -6;
    	if(a < 0)
    	{ a = (-1)*a;
    		System.out.println("a is negative value  hence converted to absoulte value " +a );  	}
    	else
    		 {System.out.println("a is positive value");}
    	// stream API
    	
    	List<Integer> nums = Arrays.asList(2,3,4,5,6,7);
    	
    	Predicate<Integer> predi = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				if(t%2 == 0)
				{ return true; }
				else
					{ return false; }
			}
    		
    	};
    	Function<Integer,Integer> funct = new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}
    		
    	};
    	 // n -> n%2 == 0   n -> n*2
    	nums.stream().filter(predi).sorted().map(funct).forEach(n -> System.out.println(n));;
    
    
    }
}