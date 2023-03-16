package Assignment3;

public class Umpire 
{
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	void collectNumberFromGuesser()
	{
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNum();
		
	}
	void collectNumberFromPlayers()
	{
		Player p = new Player();
		
		numberFromPlayer1 = p.guessNumPlayer1();
		numberFromPlayer2 = p.guessNumPlayer2();
		numberFromPlayer3 = p.guessNumPlayer3();
	}
	void compareNumbers()
	{
		if(numberFromGuesser == numberFromPlayer1)
		{
			if(numberFromGuesser == numberFromPlayer2 && numberFromGuesser == numberFromPlayer3)
			{
				System.out.println("All 3 players won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
				
			}
			else if (numberFromGuesser == numberFromPlayer2)
			{
				System.out.println("player 1 and player 2 won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
			}
			else if(numberFromGuesser == numberFromPlayer3)
			{
				System.out.println("player 1 and player 3 won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
			}
			else
			{
				System.out.println("player 1 won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
			}
		}
		else if(numberFromGuesser == numberFromPlayer2)
		{
			if(numberFromGuesser == numberFromPlayer3)
			{
				System.out.println("player 2 and player 3 won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
			}
			else
			{
				System.out.println("player 2 won the round! ");
				 // new feature to start new game after every round ends
				startNewGame();
			}
		}
		else if(numberFromGuesser == numberFromPlayer3)
		{
			System.out.println("player 3 won the round! ");
			 // new feature to start new game after every round ends
			startNewGame();
		}
		else
		{
			System.out.println("no one wins this round! ");
			 // new feature to start new game after every round ends
			startNewGame();
		}
	}
	
 // new feature to start new game after every round ends
	void startNewGame()
	{
		System.out.println("please start new round below now! ");
		Umpire u = new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compareNumbers();
	}
}
