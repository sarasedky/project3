package com.ibm.executabe;
public class job extends Thread implements IJob {
		 
		 int n;
			 public  job(int number) { // this is a constructor
				 
				 n=number;
			 }
			
				public void execute() {
					// TODO Auto-generated method stub
					
					  try {
						  
						  System.out.println("job: " + n + " on " + Thread.currentThread().getName());
						  Thread.sleep(50);
					 }
					 catch (InterruptedException e) {
				         System.out.println("job " +  n + " interrupted.");
				      }
				      System.out.println("job " +  n + " exiting.");
				   }
			 
					
				
			 public void run() {
				
			this.execute();
				   }
			 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}}
	



