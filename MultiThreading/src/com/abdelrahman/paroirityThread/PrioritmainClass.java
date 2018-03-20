/**
 * 
 */
package com.abdelrahman.paroirityThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class PrioritmainClass extends Thread {
	public void run(){
		System.out.println("name"+Thread.currentThread().getName()+" priority:"+Thread.currentThread().getPriority());
	}

	/// MIN_PROIRITY    =1
	/// NORAML_PRIORITY =5
	//  MAX_PERIORITY   =10
	public static void main(String[] args) {

		PrioritmainClass class1 = new PrioritmainClass();
		PrioritmainClass class2 = new PrioritmainClass();
		PrioritmainClass class3 = new PrioritmainClass();
//		class1.start();
//		class2.start();
//		class3.start();
		class1.setPriority(10);
		class2.setPriority(5);
		class3.setPriority(1);
		class1.start();
		class2.start();
		class3.start();
	}

}
