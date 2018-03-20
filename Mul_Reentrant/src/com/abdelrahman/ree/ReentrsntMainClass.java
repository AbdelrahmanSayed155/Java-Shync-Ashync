/**
 * 
 */
package com.abdelrahman.ree;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */

class reen{
	public synchronized void print1(){
		System.out.println("Abdelrahman");
		 print2();
	}
	
	public synchronized void print2(){
		System.out.println("Sayed");
	}
}
public class ReentrsntMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reen reen = new reen();
		Thread t1 = new Thread(){
		public void run(){
			reen.print1();
			}
		};

		t1.start();
	}

}
