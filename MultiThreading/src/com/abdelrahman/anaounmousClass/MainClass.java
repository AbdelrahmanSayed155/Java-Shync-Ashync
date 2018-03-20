/**
 * 
 */
package com.abdelrahman.anaounmousClass;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 12, 2018
 */
 class A extends Thread {
	 public void run(){
		 System.out.println("Thread {"+Thread.currentThread().getName()+"} is running ..");
	 }
}
 class B extends Thread {
	 public void run(){
		 System.out.println("Thread {"+Thread.currentThread().getName()+"} is running ..");
	 }
}
 class C extends Thread {
	 public void run(){
		 System.out.println("Thread {"+Thread.currentThread().getName()+"} is running ..");
	 }
}
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c = new C();
		A a = new A();
		B b = new B();
		a.start();
		b.start();
		c.start();
		/// anounoumous Class
		Thread thread1 = new Thread(){
			public void run(){
				System.out.println("Thread {"+Thread.currentThread().getName()+"} is Running anounmous Class");
			}
		};
		thread1.start();
       Runnable runnable = new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread {"+Thread.currentThread().getName()+"} is Running anounmous interface");
	      }
      };
      Thread thread2 =  new Thread(runnable);
	}
	
}
