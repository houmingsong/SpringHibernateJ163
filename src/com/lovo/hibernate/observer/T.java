package com.lovo.hibernate.observer;

public class T {

	public static void main(String[] args) {
		// 间谍(观察者)
		ISpy r = new Russia();
		ISpy u = new USA();
		// 创建被观察者
		IWKL w = new WKL();
		// 注册间谍
		w.addSpy(r);
		w.addSpy(u);
		// 踢出间谍
		// w.delSpy(r);
		// w.addSpy(r);
		// 被观察者干事情了
		w.runKMY("进攻");

	}
}
