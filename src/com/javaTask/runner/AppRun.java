package com.javaTask.runner;

import java.util.logging.Logger;

import com.javaTask.exception.MyZeroExc;

public class AppRun {
	
	private static Logger log = Logger.getLogger(AppRun.class.getName());

	public static void main(String[] args) {
		
		log.info("" + checkZeroDivision(5, 0));
	}

	public static int checkZeroDivision(int i, int j) throws MyZeroExc{
		
		if(j == 0) {
			throw new MyZeroExc(j + " is zero. Can't complete the operation");
		}
		
		return i / j;
	}

}
