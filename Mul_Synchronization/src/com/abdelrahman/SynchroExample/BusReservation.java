/**
 * 
 */
package com.abdelrahman.SynchroExample;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 14, 2018
 */
public class BusReservation implements Runnable {

	private int availableSeat = 4;

	@Override
	public void run() {
		
		CustomerThread current = (CustomerThread) Thread.currentThread();
		
		boolean isavailableseat = haveSeats(current.getAvailableSeat(),current.getName());
		
	}

	private synchronized boolean haveSeats(int num,String name){
		if(availableSeat>=num){
			availableSeat -= num;
			System.out.println("Current Customer:"+name+"will gwt seats he need available seat:"+availableSeat);
			return true;
		}
		System.out.println("Current Customer:"+name+"haven't gwt seats he need");
		return false;
	}
	
}
