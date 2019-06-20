package com.gjl.test;

public class KeyPerson extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName()+"开始了战斗！");
		for(int i=0;i<10;i++) {
			System.out.println("陈咬金风力杀敌");
		}
		System.out.println("结束了战斗");
	}
}
