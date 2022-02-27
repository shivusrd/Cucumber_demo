package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class log4jdemo 
{
	private static Logger logger = LogManager.getLogger(log4jdemo.class); 	
	
	
	
	public static void main(String[] args) 

	{
		System.out.println(" \n Hello world ...!    \n ");
		logger.trace("this is trace message");
		logger.info("this is information message");
		logger.error("this is error message");
		logger.warn("this is warning message");
		logger.fatal("this is fatal message");
		
		
		System.out.println("\n completed");
		
	}
}
