package com.lovo.hibernate.observer;

public class USA implements ISpy {

	@Override
	public void getMessage(String msg) {
		System.out.println("乌克兰开始：" + msg);
		if (msg.equals("进攻")) {
			System.out.println("美国增援乌克兰");
		}

	}

}
