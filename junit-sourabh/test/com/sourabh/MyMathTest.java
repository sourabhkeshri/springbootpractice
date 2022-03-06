package com.sourabh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void sum_with_3nums() {
		MyMath m =new MyMath();
		int ans=m.sum(3);
		assertEquals(6, ans);
	}

}
