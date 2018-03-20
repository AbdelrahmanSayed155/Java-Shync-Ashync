/**
 * 
 */
package com.abdelrahman.ThreadingPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class MainClass {
	
	
	public static void main(String [] args){
		
		                                       /// number of thread 
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		
		for(int i=0;i<10;i++){
			ThreadsPool pool = new ThreadsPool(""+i);
			executor.execute(pool);
		}
		executor.shutdown();
		while(!executor.isTerminated()){
			
		}
			System.out.println("All Tasks finished ");
		
	}

}
