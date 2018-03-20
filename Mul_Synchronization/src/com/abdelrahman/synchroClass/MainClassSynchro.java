/**
 * 
 */
package com.abdelrahman.synchroClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 14, 2018
 */

 class mather{

	 public static synchronized void print(){
		 for(int y=0;y<10;y++){
			 System.out.println(y+"thread : "+Thread.currentThread().getName());
		 }
	 }
	 
	 public static  void print1(){
		 for(int y=0;y<10;y++){
			 System.out.println(y+"thread : "+Thread.currentThread().getName());
		 }
	 }
}
public class MainClassSynchro extends Thread {

	public void run(){
		mather.print();
		//mather.print1();
	}
	public static void main(String[] args) {
		MainClassSynchro classSynchro = new MainClassSynchro();
		MainClassSynchro classSynchro2 = new MainClassSynchro();
		classSynchro.start();
		classSynchro2.start();
	}

}
