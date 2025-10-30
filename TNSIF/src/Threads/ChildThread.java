package com.tnsif.threads;
//import java.lang.*;
public class ChildThread extends Thread {
	private int n;
	private String msg;
	public ChildThread(int n, String msg) {
		
		this.n = n;
		this.msg = msg;
	}
	
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(msg+ i+" "+Thread.currentThread().getName());
		}
	}
	
}
