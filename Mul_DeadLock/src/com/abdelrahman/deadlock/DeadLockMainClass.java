/**
 * 
 */
package com.abdelrahman.deadlock;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */
public class DeadLockMainClass {
	
	public static void main(String [] args){
		final String obj1="abdelrahman";
		final String obj2 ="Sayed";
		
		Thread t1 = new Thread(){
			public void run(){
				synchronized (obj1) {
				System.out.println("thread1 have obj1");	
				
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (obj2) {
				System.out.println("thread1 have obj2");
			}
			}
		}};

		Thread t2 = new Thread(){
			public void run(){
				synchronized (obj2) {
					System.out.println("thread2 have obj2");	
					
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (obj1) {
					System.out.println("thread2 have obj1");
				}
				}
		}};
		
		t1.start();
		t2.start();
	}

}
