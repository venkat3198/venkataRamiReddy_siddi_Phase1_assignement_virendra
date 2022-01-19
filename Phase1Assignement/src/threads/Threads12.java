package threads;

public class Threads12 extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
				
			}
			    catch(Exception e)
			{
			    	System.out.println(e);
			}
			System.out.println(i);
			}
		
		}
	public static void main(String[] args)
	{
		Threads12 t1 = new Threads12();
		Threads12 t2=new Threads12();  
		 Threads12 t3=new Threads12();  
		 t1.start();  
     try
     {
    	 t1.join();
     }
     catch (Exception e)
     {
    	 System.out.println(e);
     }
     t2.start();
     t3.start();
	}
	}


public class ThreadsRunnable12  implements Runnable
{  
	
	public  void run()
	{  
		System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[])
	{  
	
		ThreadsRunnable12 m1=new ThreadsRunnable12();       
		Thread t1 = new Thread(m1);                     
		t1.start();                                     
	}  

	

}
