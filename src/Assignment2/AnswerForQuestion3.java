package Assignment2;

public class AnswerForQuestion3 
{
	public void runBubbleSortAlgo()
	{
		System.out.println("array before bubble sort algorithm.");
		
		int[] a = {7,5,2,3,1,4,6};	
		
		for (int element1 : a)
		{
			System.out.print(element1 + " ");
		}
		System.out.println(" ");
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 1 ; j < a.length - i ; j++)
			{
				if(a[j] < a[j-1])
				{
					int tempVar = a[j];
					a[j] = a[j-1];
					a[j-1] = tempVar;
				}
			}
		}
		System.out.println("array after bubble sort algorithm.");
		
		for (int element : a)
		{
			System.out.print(element + " ");
		}
	}
}
