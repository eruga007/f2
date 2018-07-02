import java.util.*;

public  class Queue<DataType>
	{
		private LinkedList<DataType> l;
		private boolean available;
		public Queue()
		{
			l = new LinkedList<DataType>();
			available = false;
		}
		public synchronized void put(DataType data)
		{
			while(available)
			{
				try
				{
					wait();
				}catch(InterruptedException e){}
			}
			l.add(data);
			available = true;
			System.out.println("Put : " + data);
			notifyAll();
		}

		public synchronized DataType get()
		{
			while(!available)
			{
				try
				{
					wait();
				}catch(InterruptedException e){}
			}
			DataType data = l.removeFirst();
			available = false;
			System.out.println("Got : " + data);
			notifyAll();
			return data;
		}
	}

	   class Producer implements Runnable
	{
		Queue<Integer> q;

		public Producer(Queue<Integer> q)
		{
			this.q = q;
		}

		public void run()
		{
			for(int i = 0;i<10;i++)
			{
				q.put(i);
				try
				{
					Thread.sleep(1000);
				}catch(InterruptedException ie){}
				
			}
		}
	}

	   class Consumer implements Runnable
	{
		Queue<Integer> q;

		public Consumer(Queue<Integer> q)
		{
			this.q = q;
		}

		public void run()
		{
			while(true)
			{
				q.get();
			}
		}
	}
