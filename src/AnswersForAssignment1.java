
public class AnswersForAssignment1 
{
	public void Ouestion1Answer()
	{		
		int n = 10;		
		for(int i = 0 ; i < n ; i ++)
		{
			// I
			for(int j = 0 ; j < n ; j++)
			{				
				boolean a = (Boolean)(i == (n-1));
				boolean b = (Boolean)(i == 0);
				boolean c = (Boolean)(j == (n-1)/2 );
				
				if( a || b || c )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
				// space
				for(int j = 0 ; j < 1 ; j++)
				{				
					System.out.print("   ");
				}
			// N
						for(int j = 0 ; j < n ; j++)
						{				
							boolean a = (Boolean)(j == 0);
							boolean b = (Boolean)(i == j);
							boolean c = (Boolean)(j == (n-1));
							
							if( a || b || c)
							{
							System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
						
						// space
						for(int j = 0 ; j < 1 ; j++)
						{				
							System.out.print("   ");
						}
						
		    //E 
						for(int j = 0 ; j < n ; j++)
						{				
							boolean a = (Boolean)(j == 0);
							boolean b = (Boolean)(i == (n-1)/2);
							boolean c = (Boolean)(i == (n-1));
							boolean d = (Boolean)(i == 0);
							
							if( a || b || c || d )
							{
							System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}							
					
						// space
						for(int j = 0 ; j < 1 ; j++)
						{				
							System.out.print("   ");
						}
						
					//U
					    for(int j = 0 ; j < n ; j++)
						{				
							boolean a = (Boolean)(j == 0 && i < (n-1));
							boolean b = (Boolean)(j == (n-1) && i < (n-1));
							boolean c = (Boolean)(i == (n-1) && j > 0 && j < (n-1));
							
							if( a || b || c )
							{
							System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}	
						// space
						for(int j = 0 ; j < 1 ; j++)
						{				
							System.out.print("   ");
						}						
					//R
						for(int j = 0 ; j < n ; j++)
						{
							boolean a = (Boolean)(j == 0 );
							boolean b = (Boolean)(j == (n-1) && i < (n-1)/2 && i != 0 );
							boolean c = (Boolean)(i - j == (n-1)/2);
							boolean d = (Boolean)(i == (n-1)/2 && j != (n-1));
							boolean e = (Boolean)(i == 0 && j < (n-1));
						
							if( a || b || d || e || c )
							{
							System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}							
						}
						// space
						for(int j = 0 ; j < 1 ; j++)
						{				
							System.out.print("   ");
						}	
						//O
						 for(int j = 0 ; j < n ; j++)
							{				
								boolean a = (Boolean)(j == 0 && i > 0 && i < (n-1));
								boolean b = (Boolean)(j == (n-1) && i > 0 && i < (n-1));
								boolean c = (Boolean)(i == (n-1) && j > 0 && j < (n-1));
								boolean d = (Boolean)(i == 0 && j != 0 && j != (n-1));
								
								if( a || b || c || d)
								{
								System.out.print("*");
								}
								else
								{
									System.out.print(" ");
								}
							}							
							// space
							for(int j = 0 ; j < 1 ; j++)
							{				
								System.out.print("   ");
							}
			//N
							for(int j = 0 ; j < n ; j++)
							{				
								boolean a = (Boolean)(j == 0);
								boolean b = (Boolean)(i == j);
								boolean c = (Boolean)(j == (n-1));
								
								if( a || b || c)
								{
								System.out.print("*");
								}
								else
								{
									System.out.print(" ");
								}
							}														
						
			//***********
			System.out.println();
		}		
	}

	public void Ouestion2Answer()
	{
		
	}
	
}
