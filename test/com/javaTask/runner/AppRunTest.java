package com.javaTask.runner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.javaTask.exception.MyZeroExc;

class AppRunTest {

	@Test
	void testAppRunExc() {

		assertThrows(MyZeroExc.class, () -> AppRun.checkZeroDivision(2, 0));
	}

}
