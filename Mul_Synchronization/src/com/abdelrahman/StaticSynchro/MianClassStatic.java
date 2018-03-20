/**
 * 
 */
package com.abdelrahman.StaticSynchro;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 15, 2018
 */

class Testing{
	synchronized static void view(int n){
		System.out.println("***** Th:" +Thread.currentThread().getName()+"*****");
		for(int y=0;y<n;y++){
			System.out.println("Th:" +Thread.currentThread().getName()+":"+y);
		}
	}
}

class MyThreadGo extends Thread{
	
	public void run(){
		Testing.view(12);
	}
}

public class MianClassStatic {

	public static void main(String[] args) {
		MyThreadGo myThreadGo = new MyThreadGo();
		MyThreadGo myThreadGo1 = new MyThreadGo();
		MyThreadGo myThreadGo2 = new MyThreadGo();
		MyThreadGo myThreadGo3 = new MyThreadGo();
		MyThreadGo myThreadGo4 = new MyThreadGo();

		myThreadGo.start();
		myThreadGo1.start();
		myThreadGo2.start();
		myThreadGo3.start();
		myThreadGo4.start();
	}

}
