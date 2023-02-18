package CollectionsInJava;

import java.util.*;

public class DemoCollections 
{
	public static void main(String[] args)
	{
		System.out.println("**********");
		
		List<Integer> col = new ArrayList<Integer>();		
		col.add(123);
		col.add(777);
		col.add(451);
		col.add(688);
		col.add(839);
		col.add(564);
		
//		Iterator ite = col.iterator();
//		while (ite.hasNext())
//		{
//		System.out.println(ite.next());
//		}
		//comparator
//		Comparator<Integer> comp = new Comparator<Integer>(){
//			public int compare(Integer i1 , Integer j1)
//			{
//				if(i1 > j1)
//				{ 
//					return 1;
//					}
//				else
//				{
//				return -1;
//				}
//			} };
//		
//		 Collections.sort(col,comp);
		
		// for arranging number in ascending order of left digit
		Comparator<Integer> comp2 = (i1,j1) -> {
				return i1%10>j1%10?1:-1;
				 };
		Collections.sort(col,comp2);
	//	col.forEach(System.out::println);
		
		for(int i : col )
		{
			System.out.println(i);
		}
		
		System.out.println("**********");
	}
}
