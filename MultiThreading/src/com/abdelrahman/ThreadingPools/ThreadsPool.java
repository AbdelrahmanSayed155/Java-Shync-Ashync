/**
 * 
 */
package com.abdelrahman.ThreadingPools;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class ThreadsPool  implements Runnable{

	private String name;
	public ThreadsPool(String name){
		super();
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Start "+Thread.currentThread().getName()+" ");
		stopprocces();
		System.out.println("end "+Thread.currentThread().getName()+" ");
	}
	public void stopprocces(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/// set of threads worker 
	/// you can using it without intialize new thread 
	/// using for many request in server 
	/// using in servlet and jsp for manage requsts from clients
	
}
