package MultiThreading;


class Hello implements Runnable
{
	public void run()
	{
		for(int i =1; i<=5 ; i++ )
		{
			System.out.println("Hello");			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo 
{

	public static void main(String[] args) throws Exception 
	{
	
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread(() ->
		{
			for(int i =1; i<=5 ; i++ )
			{
				System.out.println("Hi "  +Thread.currentThread().getPriority());
				try 
				{
					Thread.sleep(1000);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			});
		Thread t2 = new Thread(obj2,"Hello");
		
		t1.setName("Hi");
		
		t1.setPriority(1);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Thread name : " + t1.getName());
		System.out.println("Thread name : " + t2.getName());
		
		System.out.println("Thread priority : " + t1.getPriority());
		System.out.println("Thread priority : " + t2.getPriority());
		
		t1.start();
		// Thread.sleep(10);
		t2.start();
		
		
		t1.join();
		t2.join();
		System.out.println("Bye..!");
	}

}
