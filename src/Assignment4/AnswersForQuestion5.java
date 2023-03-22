package Assignment4;
import java.util.Arrays;

public class AnswersForQuestion5 
{
	public static void RunCheckIfAnagram() 
	{
		String s1 = "Race";
		String s2 = "cArE";
		
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		
		char[] ch1 = s3.toCharArray();
		char[] ch2 = s4.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
//		for(int i =0 ; i < ch1.length; i++)
//		{
//			System.out.print(ch1[i]+ " ");
//		}
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("the 2 strings given are anagram!");
		}
		else
		{
			System.out.println("Strings given are not an anagram! ");
		}
		
	}
}
