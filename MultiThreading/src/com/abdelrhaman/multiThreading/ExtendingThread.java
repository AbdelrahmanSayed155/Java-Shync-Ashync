/**
 * 
 */
package com.abdelrhaman.multiThreading;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class ExtendingThread  extends Thread{

	@Override
	public void run(){
		System.out.println("Abdelrahman Sayed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread thread = new ExtendingThread();
		thread.start();
		ExtendingThread thread2 = new ExtendingThread();
		thread2.start();
	}

}
