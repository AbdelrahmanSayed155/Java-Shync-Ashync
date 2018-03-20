/**
 * 
 */
package com.abdelrahman.interruptThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */

class working extends Thread{
	public void run(){
		for(int y=1;y<3;y++){
			if(Thread.interrupted()){
				System.out.println("this thread became interpted ... "+Thread.currentThread().getName());
			}else{
				System.out.println("this thread don't interpted ... "+Thread.currentThread().getName());
			}
		}
	}
}
public class MainClaasinterptWorkingThread {

	public static void main(String []args){
		
		working working = new working();
		working.start();
		working.interrupt();
		working working2 = new working();
		working2.start();
	}
	
}
