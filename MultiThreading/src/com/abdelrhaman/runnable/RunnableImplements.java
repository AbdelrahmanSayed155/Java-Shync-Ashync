/**
 * 
 */
package com.abdelrhaman.runnable;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class RunnableImplements implements Runnable{

	public static void main(String[] args) {
		RunnableImplements implements1 = new RunnableImplements();
		Thread thread = new Thread(implements1);
		thread.start();
		Thread thread1 = new Thread(implements1);
		thread1.start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(" { Abdelrahmna Sayed } ");
		
	}

}
