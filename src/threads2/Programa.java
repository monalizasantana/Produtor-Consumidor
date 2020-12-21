/*
package threads;
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ads
 */
package threads2;

import java.util.ArrayList;

public class Programa {

	int itemCount;
	ArrayList buffer;
	Semaphore mutex = new Semaphore(1); 
	Semaphore items = new Semaphore(0); 

	Programa () {
		itemCount = 0;
		buffer = new ArrayList(); 
	}

	int compartilhada;

	public static void main(String[] args) {
		Programa t = new Programa();
		t.run();
	} 

	public void run() {
		Consumer c = new Consumer(this);
		Producer p = new Producer(this);
		c.start();
		p.start();
		Consumer c1 = new Consumer(this);
		Producer p1 = new Producer(this);
		c1.start();
		p1.start();
		Consumer c3 = new Consumer(this);
		c3.start();
	}

	public synchronized ArrayList getBuffer() {
		return buffer;
	}

	
	
	


}
