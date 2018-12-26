package project2;



class Myclass implements Runnable {
	 
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
		
	for(int i=0;i<10;i++) {
		//create runnable object and thread to run them
		Myclass demo1=new Myclass(i); 
		Thread t1=new Thread(demo1);
		//start the thread
		t1.start(); 
	}
		
	}}
		  
