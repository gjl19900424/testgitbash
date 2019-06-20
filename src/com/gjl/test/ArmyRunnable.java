package com.gjl.test;

public class ArmyRunnable implements Runnable {
	volatile boolean keepRunning = true;
	@Override
	public void run() {
		while (keepRunning) {
			for(int i =0 ;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();
			}
		}
		
	}

}
