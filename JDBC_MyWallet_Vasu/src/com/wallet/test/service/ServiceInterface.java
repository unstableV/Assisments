package com.wallet.test.service;

public interface ServiceInterface {

	boolean validateUserName(String userName);

	int sendAmount(int widh, int amount);

	int depositeAmount(int dep, int amount);

}
