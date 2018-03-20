/**
 * 
 */
package com.abdelrahman.SynchroExample;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 14, 2018
 */
public class CustomerThread  extends Thread{

	private int neededSeat;
	public CustomerThread(int neededSeat,Runnable target, String name){
		super(target, name);
		this.neededSeat=neededSeat;
	}
	public int getAvailableSeat(){
		return neededSeat;
	}
}

