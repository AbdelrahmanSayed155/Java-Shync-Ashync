/**
 * 
 */
package com.abdelrahman.shutDownHook;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 12, 2018
 */
public class shudDownHookMainClass extends Thread {
	/// this using for terminate resources with good way
	/// this make jvm terminate resources with normal way 
	/// help us for make desicion before terminate resources
	public void run(){
		System.out.println("Thread {"+Thread.currentThread().getName()+"} is Running .");
	}
	
	public static void main(String []args){
		Runtime runtime = Runtime.getRuntime();
		shudDownHookMainClass thread1 = new shudDownHookMainClass();
		runtime.addShutdownHook(thread1);
		
		try {
			System.out.println("Sleeping Task");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
