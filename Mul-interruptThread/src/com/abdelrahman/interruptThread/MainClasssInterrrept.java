/**
 * 
 */
package com.abdelrahman.interruptThread;

import javax.management.RuntimeErrorException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */


public class MainClasssInterrrept extends Thread{
	public void run(){
		System.out.println("Task starting");
		try {
			Thread.sleep(100);
			System.out.println("Task finish");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("Message "+e.getMessage());
		}	
	}
	
	public static void main(String []args){
		MainClasssInterrrept mainThread = new MainClasssInterrrept();
		mainThread.start();
		/// this interupt slepping and convert thread to working state
		try{
		mainThread.interrupt();
		}catch (Exception e) {
			System.out.println("  message:"+e.getMessage());
		}
	}
	
}
