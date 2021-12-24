package com.lab2.target;

public class Target {
	int txnArray[];

	Target(int size) {
		this.txnArray = new int[size];
	}

	public void setTransactionValue(int index, int value) {
		this.txnArray[index] = value;
	}

	public int targetCheck(int target) {

		int counter = 0;
		int txns = 0;
		for (int i = 0; i < txnArray.length; i++) {
			++counter;
			txns += txnArray[i];
			if (txns >= target) {
				return counter;
			}
		}
		return 0;
	}
}
