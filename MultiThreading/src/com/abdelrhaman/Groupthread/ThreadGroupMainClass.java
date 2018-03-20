/**
 * 
 */
package com.abdelrhaman.Groupthread;

/**
 * @author Abdelrahman Sayed
 *
 * Mar 11, 2018
 */
public class ThreadGroupMainClass implements Runnable {

	// if you have large number of threads so you must using grouping
	/// for this threads  for more manage as make some sleep 
	/// so you need encapsulated for large number of threads
	/// fasilitate some oprations  as execute it or stop it know number of threads working or sleeping 
	public static void main(String[] args) {
		
		ThreadGroup parentGroup = new ThreadGroup("ParentGroup");
		ThreadGroup subGroup = new ThreadGroup(parentGroup, "ChildGroup");
		
		parentGroup.setMaxPriority(Thread.MAX_PRIORITY-2);
		subGroup.setMaxPriority(Thread.NORM_PRIORITY-2);
		
		Thread t1 = new Thread(parentGroup, new ThreadGroupMainClass());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("name"+t1.getName());
		t1.start();
		Thread t2 = new Thread(subGroup, new ThreadGroupMainClass());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		System.out.println("name"+t2.getName());
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Active num:"+parentGroup.activeGroupCount());
		
		/// for destroying ThreadGroup
//		if(!parentGroup.isDestroyed()){
//			parentGroup.destroy();
//		}
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("wwwww");
	}

}

