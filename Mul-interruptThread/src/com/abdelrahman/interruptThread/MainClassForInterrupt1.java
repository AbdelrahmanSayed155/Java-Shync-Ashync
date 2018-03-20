/**
 * 
 */
package com.abdelrahman.interruptThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */

class myThrads extends Thread{
	public void run(){
		
		System.out.println("TaskStarting ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Message "+e.getMessage());
		}
		System.out.println("thread rusume after interupt ");
	}
}
public class MainClassForInterrupt1 {

	public static void main(String[] args) {
		myThrads myThrads = new myThrads();
		myThrads.start();
		myThrads.interrupt();

	}

}
