/**
 * 
 */
package com.abdelrahman.SynchroExample;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 14, 2018
 */
public class MainClass {
	
	public static void main(String []args){
		
BusReservation busReservation = new BusReservation();
CustomerThread customerThread = new CustomerThread(2, busReservation, "Abdelrahman");
CustomerThread customerThread2 = new CustomerThread(3, busReservation, "Ahmed");
CustomerThread customerThread3 = new CustomerThread(1, busReservation, "Sayed");
CustomerThread customerThread4 = new CustomerThread(4, busReservation, "Shaban");
customerThread.start();
customerThread2.start();
customerThread3.start();
customerThread4.start();
}

}
