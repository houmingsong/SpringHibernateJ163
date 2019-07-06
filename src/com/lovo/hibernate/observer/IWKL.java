package com.lovo.hibernate.observer;

public interface IWKL {

	public void runKMY(String str);

	public void addSpy(ISpy spy);

	public void delSpy(ISpy spy);

	public void sendMessageToSpy(String msg);
}
