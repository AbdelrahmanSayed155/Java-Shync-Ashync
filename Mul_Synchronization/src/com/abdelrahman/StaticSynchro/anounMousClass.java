/**
 * 
 */
package com.abdelrahman.StaticSynchro;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 15, 2018
 */

class Testing2{
	synchronized static void view(int n){
		System.out.println("***** Th:" +Thread.currentThread().getName()+"*****");
		for(int y=0;y<n;y++){
			System.out.println("Th:" +Thread.currentThread().getName()+":"+y);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class anounMousClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(){
			public void run(){
				new Testing2().view(15);
			}
		};

		Thread thread1 = new Thread(){
			public void run(){
				new Testing2().view(15);
			}
		};
		Thread thread2 = new Thread(){
			public void run(){
				new Testing2().view(15);
			}
		};
		
		thread.start();
		thread2.start();
		thread1.start();
	}

}
