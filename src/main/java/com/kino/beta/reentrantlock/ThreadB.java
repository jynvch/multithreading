package com.kino.beta.reentrantlock;

public class ThreadB extends Thread {

	private MyService myService;
	
	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		
		myService.waitB();
	}
}
