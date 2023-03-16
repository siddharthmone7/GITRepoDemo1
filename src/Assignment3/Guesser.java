package Assignment3;

import java.util.Scanner;

public class Guesser 
{
	int guessNumber ;
	
	Integer guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("guesser please type in a guess number from range 1 to 10 below! :- ");
		guessNumber = scan.nextInt();
		
		//new feature guesser has to select number from 1 to 10 else asks again
		if(guessNumber >= 1 && guessNumber <= 10)
		{
			System.out.println("guesser your number is accepted! ");			
			return guessNumber;
		}
		else
		{
			System.out.println("guesser you need to enter number again !!! please type number in between range of 1 to 10 ");
			return guessNum();
		}	
	}
}
