package Assignment2;

public class AnswerForquestion6 
{
	
	// //Java method to find whether an array is subset of another array
	public void ifArray1IsSubsetOfArray2()
	{
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1};
		
		if (arrayIsSubset(arr1, arr2))
		{
			System.out.print("arr1[] : ");
			for(int element1 : arr1)
			{
			System.out.print(  element1 + " ");
			}
			System.out.println();
			
			System.out.print("arr2[] : ");
			for(int element2 : arr2)
			{
			System.out.print(  element2 + " ");
			}
			System.out.println();
			//if true 
			System.out.println("arr2[] is subset of arr1[] ");
			System.out.println(arrayIsSubset(arr1, arr2));
		}
		else
		{
			System.out.print("arr1[] : ");
			for(int element1 : arr1)
			{
			System.out.print(  element1 + " ");
			}
			System.out.println();
			
			System.out.print("arr2[] : ");
			for(int element2 : arr2)
			{
			System.out.print(  element2 + " ");
			}
			System.out.println();
			//if false 
			System.out.println("arr2[] is not a subset of arr1[]");
			System.out.println(arrayIsSubset(arr1, arr2));
		}
	}
	
/* Return true if arr2[] is a subset of arr1[] */
	public boolean arrayIsSubset(int arr1[], int arr2[])
		{
			
			int j = 0;
			for (int i = 0; i < arr2.length ; i++) 
			{
				for (j = 0; j < arr1.length ; j++)
				{				
					if (arr2[i] == arr1[j])
					{
						break;
					}
				}
	/* If the above inner loop was not broken at all then arr2[i] is not present in arr1[] */
				if (j == arr1.length)
				{
					return false;
				}
			}

			/* If we reach here then all
			elements of arr2[] are present
			in arr1[] */
			return true;
		}


}
