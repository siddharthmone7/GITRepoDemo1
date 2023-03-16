package Assignment3;

import java.util.Scanner;

public class Player 
{
	int guessNumberPlayer1;
	int guessNumberPlayer2;
	int guessNumberPlayer3;
	
	 // new feature every player has new welcome input text
	Integer guessNumPlayer1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1 please type a number from range 1 to 10 below! :- ");
		guessNumberPlayer1 = scan.nextInt();
		
		//new feature player 1 has to select number from 1 to 10 else asks again
		if(guessNumberPlayer1 >= 1 && guessNumberPlayer1 <= 10)
		{
			System.out.println("Player 1 your number is accepted! ");
			return guessNumberPlayer1;
		}
		else
		{
			System.out.println("Player 1 you need to enter number again !!! please type number in between range of 1 to 10 ");
			return guessNumPlayer1();
		}
	}
	
	 // new feature every player has new welcome input text
	Integer guessNumPlayer2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2 please type a number from range 1 to 10 below! :-");
		guessNumberPlayer2 = scan.nextInt();
		
		//new feature player 2 has to select number from 1 to 10 else asks again
		
		if(guessNumberPlayer2 >= 1 && guessNumberPlayer2 <= 10)
		{
			System.out.println("Player 2 your number is accepted! ");
			return guessNumberPlayer2;
		}
		else
		{
			System.out.println("Player 2 you need to enter number again !!! please type number in between range of 1 to 10 ");
			return guessNumPlayer2();
		}
		
	}
	
	 // new feature every player has new welcome input text
	Integer guessNumPlayer3()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 3 please type a number from range 1 to 10 below! :- ");
		guessNumberPlayer3 = scan.nextInt();
		
		//new feature player 3 has to select number from 1 to 10 else asks again
		
		if(guessNumberPlayer3 >= 1 && guessNumberPlayer3 <= 10)
		{
			System.out.println("Player 3 your number is accepted! ");
			return guessNumberPlayer3;
		}
		else
		{
			System.out.println("Player 3 you need to enter number again !!! please type number in between range of 1 to 10 ");
			return guessNumPlayer3();
		}
		
	}
}
