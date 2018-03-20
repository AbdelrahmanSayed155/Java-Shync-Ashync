/**
 * 
 */
package com.abdelrahman.RunTimeClass;

import java.io.IOException;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 14, 2018
 */
public class MainClass {
	
	public static void main(String [] args){
		try {
			Runtime.getRuntime().exec("ping google.com");
			//Runtime.getRuntime().exec("gedit");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("totalMemory:"+runtime.totalMemory());
		System.out.println("freeMemory:"+runtime.freeMemory());
		System.out.println("maxMemory:"+runtime.maxMemory());
		System.out.println("availableProcessors:"+runtime.availableProcessors());
		System.out.println("String :"+runtime.toString());
		for(int size=0;size<2000000;size++){
			new MainClass();
		}
		System.out.println("freeMemory after execute programs:"+runtime.freeMemory());
	    System.gc();
	    System.out.println("free memory after run gc " + runtime.freeMemory());
	}

}
