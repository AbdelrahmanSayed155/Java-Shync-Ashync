/**
 * 
 */
package com.abdelrahman.methodThreading;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class MethodsThreading extends Thread {

	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int y=0;y<7;y++){
			System.out.println("this {" + Thread.currentThread().getName()+"} info{"+y+"}");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodsThreading threading = new MethodsThreading();
		MethodsThreading threading2 = new MethodsThreading();
		MethodsThreading threading3 = new MethodsThreading();
		MethodsThreading threading4 = new MethodsThreading();
		System.out.println(" ---getting Thread info ------ ");
		System.out.println("Name:"+threading.getName());
		System.out.println("ID:"+threading.getId());
		System.out.println("Priority"+threading.getPriority());
		System.out.println("State"+threading.getState());
		
		System.out.println("Name:"+threading2.getName());
		System.out.println("ID:"+threading2.getId());
		System.out.println("Priority"+threading2.getPriority());
		System.out.println("State"+threading2.getState());
		
		System.out.println("Name:"+threading3.getName());
		System.out.println("ID:"+threading3.getId());
		System.out.println("Priority"+threading3.getPriority());
		System.out.println("State"+threading3.getState());
		
		System.out.println(" --- ********* ------ ");
		threading.start();
		try {
			threading.join(); /// it execute this thread when it fininsh it start execute other
			///// it can take specific time  after this time finished 
			//// others threads start ti execute
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threading2.start();
		threading3.start();
		try {
			threading3.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threading4.start();
	}

}
