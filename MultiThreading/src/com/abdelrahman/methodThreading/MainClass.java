/**
 * 
 */
package com.abdelrahman.methodThreading;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class MainClass extends Thread {

    public void run(){
	
    	System.out.println(Thread.currentThread().getName());
    	for(int y=0;y<7;y++){
    		System.out.println("{"+Thread.currentThread().getName()+"}:"+y+"{"+Thread.currentThread().getPriority()+"}");
    	}
      }
	public static void main(String[] args) {
		MainClass class1 = new MainClass();
		MainClass class2 = new MainClass();
		MainClass class3 = new MainClass();
		MainClass class4 = new MainClass();
		class1.setName("ab1");
		class2.setName("ab2");
		class3.setName("ab3");
		class4.setName("ab4");
		class1.setPriority(1);
		class2.setPriority(2);
		class3.setPriority(3);
		class4.setPriority(4);
		class1.start();
		class2.start();
		class3.start();
		class4.start();
	}

}
