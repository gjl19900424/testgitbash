package com.gjl.test;

public class Stage extends Thread {
	public void run() {
		System.out.println("欢迎观看");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("大幕徐徐拉开");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArmyRunnable armtTask = new ArmyRunnable();
		ArmyRunnable revolt = new ArmyRunnable();
		Thread sui = new Thread(armtTask,"随军");
		Thread nongming = new Thread(revolt,"农民军");
		sui.start();
		nongming.start();
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		armtTask.keepRunning= false;
		revolt.keepRunning = false;
		try {
			sui.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("正当上方激战正酣，半路杀出个程咬金");
		Thread mrC= new KeyPerson();
		mrC.setName("陈咬金");
		System.out.println("陈咬金的理想就是借宿韩振");
		revolt.keepRunning = false;
		armtTask.keepRunning=false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mrC.start();
		try {
			mrC.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("战阵结束");
		System.out.println("谢谢观看");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.start();

	}

}
