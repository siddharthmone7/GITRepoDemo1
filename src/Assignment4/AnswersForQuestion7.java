package Assignment4;

public class AnswersForQuestion7
{
	public boolean uniqueCharacters(String str)
	{
		// If at any time we encounter 2 same
		// characters, return false
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;

		// If no duplicate characters encountered,
		// return true
		return true;
	}
	
	//run function
	public void runCheckIfStringHasAllUniqueCharaters()
	{
		AnswersForQuestion7 obj = new AnswersForQuestion7();
		String input = "grass is greener on the other side";

		if (obj.uniqueCharacters(input))
		{
			System.out.println("The String >> " + input + " << has all unique characters");
		}
		else
		{
			System.out.println("The String >> " + input + " << has duplicate characters");
		}
	}
	
}
