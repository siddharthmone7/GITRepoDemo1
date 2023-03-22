package Assignment4;

public class AnswersForQuestion3 
{
		public void RunCheckIfStringIsPalindrome()
		{
			String s = "2552";
			String s1 = "";
			
			for(int i = s.length() - 1 ; i>=0; i--)
			{
				s1 = s1 + s.charAt(i);
			}
			System.out.println(s1);
			if(s.equals(s1))
			{
				System.out.println("Given string is palindrome! ");
			}
			else
			{
				System.out.println("given string is not palindrome!");
			}
			
		}

	}
	
