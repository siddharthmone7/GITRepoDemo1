
public class AnswersForAssignment1 
{
	
	public void Question1Answer()
	{		
		int n = 7;		
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

	public void Question2Answer()
	{
		int n = 4;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 0 ; j < n; j++)
			{
				boolean a = true ;				
				if( a )
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}			
			System.out.println();			
		}
	}
	
	public void Question3Answer()
	{
		int n = 13;
		for(int i = 0 ; i < n; i++)
		{
			for(int j = 0 ; j < n; j++)
			{
				boolean e = (Boolean) ( i == 0 );
				boolean f = (Boolean) (j == 0);
				boolean a = (Boolean) (i + j <= (n-1)/2);
				boolean b = (Boolean) (i == (n-1));
				boolean c = (Boolean) (j - i >= (n-1)/2);
				boolean d = (Boolean) (j == (n-1));
				
				if( e || f || a || b || c || d )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}			
			System.out.println();			
		}
	}

	public void Question4Answer()
	{
		int n = 11;
		for(int i = 0 ; i < n; i++)
		{
			for(int j = 0 ; j < n; j++)
			{				
				boolean b = (Boolean) (i - j >= (n-1)/2);				
				boolean d = (Boolean) (i + j >= (n-1) + (n-1)/2 );
				
				if( b  || d )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}			
			System.out.println();			
		}
	}
	
	public void Question5Answer()
	{
		int n = 11;
		for(int i = 0 ; i < n; i++)
		{
			for(int j = 0 ; j < n; j++)
			{
				boolean a = (Boolean) (i + j <= (n-1)/2);
				boolean b = (Boolean) (i - j >= (n-1)/2);
				boolean c = (Boolean) (i == 0 );
				boolean d = (Boolean) (i == (n-1) );
				
				if( a || b || c || d )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}			
			System.out.println();			
		}
	}
}
