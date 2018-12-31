
public class Myclass implements Runnable {
		 
		 int n;
			 public  Myclass(int number) { // this is a constructor
				 
				 n=number;
			 }
			 //run method
			 public void run() {
				 System.out.println("thread " + n);
				  try {
						  System.out.println("task: " + n  );
						  Thread.sleep(50);
					 }
					 catch (InterruptedException e) {
				         System.out.println("Thread " +  n + " interrupted.");
				      }
				      System.out.println("Thread " +  n + " exiting.");
				   }
			 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
