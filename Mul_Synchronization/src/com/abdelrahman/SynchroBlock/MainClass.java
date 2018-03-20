/**
 * 
 */
package com.abdelrahman.SynchroBlock;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 15, 2018
 * 
 */

class  Test{
	
	public void printT(int n){
		System.out.println("Current Thread"+Thread.currentThread().getName());
		synchronized (this) {
			for(int y=0;y<n;y++){
				System.out.println("Current Thread"+Thread.currentThread().getName()+"  into loop :"+y);
			}
		}
	}
}
class MyThread extends Thread{
	Test t;

	public MyThread(Test t) {
		this.t =t;
	}
	public void run(){
		t.printT(10);
	}
}
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = new Test();
		MyThread myThread = new MyThread(test);
		MyThread myThread2 = new MyThread(test);
		MyThread myThread3 = new MyThread(test);
		MyThread myThread4 = new MyThread(test);
		myThread.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();

	}

}
