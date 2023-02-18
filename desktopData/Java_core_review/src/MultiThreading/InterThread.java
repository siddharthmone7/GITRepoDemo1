package MultiThreading;

class Q
{
	int num;
	boolean valueSet = false;
	
	public synchronized void setNum(int num)
	{
		while(valueSet)
		{
			try 
			{
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Put value : " + num);
		this.num = num;
		valueSet = true;
		notify();
	}		

	public synchronized void getNum()
	{
		while(!valueSet)
		{
			try 
			{
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get value : " + num);
		valueSet=false;
		notify();
	}

}

class Producer implements Runnable 
{
	Q q;
	
	public Producer(Q q)
	{
		this.q = q ;
		Thread t = new Thread(this, "Thread name : Producer");
		t.start();
	}
	public void run() 
	{
		int i = 0;
		while(true)
		{
			q.setNum(i++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	
	public Consumer(Q q) 
	{
		this.q = q;
		Thread t = new Thread(this, "Thread name : Consumer");
		t.start();
	}

	@Override
	public void run()
	{
		while(true)
		{
			q.getNum();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}	
}

public class InterThread 
{

	public static void main(String[] args)
	{
		Q q =new Q();
		new Producer(q);
		new Consumer(q);

	}

}
