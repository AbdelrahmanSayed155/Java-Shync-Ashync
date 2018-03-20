/**
 * 
 */
package com.abdelrahman.communicationThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */
public class InterCommunicationthread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer c = new Customer();
		
		Thread t1 = new Thread(){
			public void run(){
				c.withdraw(100000);
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				c.deposit(10);
			//	c.deposit(100000);
			}
		};
		t1.start();
		t2.start();
		
		

	}

}
