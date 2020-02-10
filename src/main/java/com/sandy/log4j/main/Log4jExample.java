package com.sandy.log4j.main;

import org.apache.log4j.Logger;

import com.sandy.log4j.logic.MathUtils;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jExample {
	static {
		init();
	}
	private final static Logger logger=Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		logger.debug("My debug log");
		logger.info("My info log");
		logger.warn("My Warn Log");
		
		
		MathUtils.add(4,5);
		MathUtils.add(3,4);
		MathUtils.add(4,5);
	}
	private static void init() {
		DOMConfigurator.configure("log4j.xml");
	}

}
