/**
 * 
 */
package com.abdelrahman.finalizeUsing;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 13, 2018
 */
public class FinalizeClass {

	public void finalize(){
		System.out.println("this obj will delete");
	}
	public static void main(String[] args) {
		FinalizeClass class1 = new FinalizeClass();
		FinalizeClass class2 = new FinalizeClass();
		class1 = null;
		class2 = null;
		System.gc();

	}

}
