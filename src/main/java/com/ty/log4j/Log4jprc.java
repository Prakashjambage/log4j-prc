package com.ty.log4j;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jprc {
	
	 static Logger logger = Logger.getLogger(Log4jprc.class);
	
	 static Layout layout = new PatternLayout("%d--%p--%m--%C %l");
	 
	public static void main(String[] args) throws IOException {
		
		Appender appender = new FileAppender(layout,"D:/training/abc.log");
		logger.addAppender(appender);
		
		int a=10;
		if(a==9) {
			logger.debug("the answer is 9");
		}else {
			logger.fatal("the answer is not 9");
		}
	}
	

}
