package com.codingbat.recursion1;

public class Count7 {
	public int count7(int n) {
		if (n == 0) {
			return 0;
		}
		return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
	}
}
