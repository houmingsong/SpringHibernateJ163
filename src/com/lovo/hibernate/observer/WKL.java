package com.lovo.hibernate.observer;

import java.util.ArrayList;
import java.util.List;

public class WKL implements IWKL {

	// 间谍注册中心
	List<ISpy> list = new ArrayList<ISpy>();

	public void runKMY(String str) {
		System.out.println("乌克兰现在在：" + str);
		sendMessageToSpy(str);

	}

	@Override
	public void addSpy(ISpy spy) {
		list.add(spy);

	}

	@Override
	public void delSpy(ISpy spy) {
		list.remove(spy);

	}

	@Override
	public void sendMessageToSpy(String msg) {
		for (ISpy s : list) {
			s.getMessage(msg);
		}

	}

}
