/**
 * 
 */
package com.abdelrahman.deaomenThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
/// number of thread help you 
/// your thead can intialize deamon thread for many tasks 
public class deamonMainClass extends Thread {

	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(" Deamon Thread Name:"+currentThread().getName());
		}else{
		System.out.println("User Thread Name:"+currentThread().getName());
		}
	}
	public static void main(String[] args) {
		deamonMainClass class1 = new deamonMainClass();
		deamonMainClass class2 = new deamonMainClass();
		deamonMainClass class3 = new deamonMainClass();
		deamonMainClass class4 = new deamonMainClass();
		class4.setDaemon(true);/// have min priority
		class1.start();
		class2.start();
		class3.start();
		class4.start();
	}
}
