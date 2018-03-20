/**
 * 
 */
package com.abdelrahman.secudele;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class Schudiling extends Thread {

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("befor Sleep : "+Thread.currentThread().getName());
			try {////500 is milesecond
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("after Sleep: "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Schudiling schudiling = new Schudiling();
		Schudiling schudiling2 = new Schudiling();
		schudiling.start();
		schudiling2.start();
		
		Schudiling schudiling3 = new Schudiling();
		////java.lang.IllegalThreadStateException 
		//// becuase the same obj
		schudiling3.start();
		schudiling3.start();
		
		/// it using as object not threading 
		/// this code will be synchro
		schudiling.run();
		schudiling2.run();
		
	}

}
