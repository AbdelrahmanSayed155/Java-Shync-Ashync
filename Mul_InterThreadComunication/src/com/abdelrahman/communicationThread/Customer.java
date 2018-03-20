/**
 * 
 */
package com.abdelrahman.communicationThread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 19, 2018
 */
public class Customer {
	
	
	int amount =5000;
	
	synchronized public void withdraw(int amount){
		System.out.println("Startting withdrow ");
		if(this.amount < amount){
			System.out.println("you must deposit to kill wait() func ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" after  deposit amout is "+this.amount);
			if(this.amount>=amount){
			this.amount -=amount;
			System.out.println(" success in   withdrow");
			}else{
				System.out.println(" fail in   withdrow");
			}
		}
	}
	
	synchronized public void deposit(int amount){
		System.out.println("starting in deposit");
		this.amount +=amount;
		notify();
		System.out.println("amout after deposit "+this.amount);
		
	}
	
}
