package lesson14;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	static Logger	myLogger = Logger.getLogger(LoggerTest.class.getCanonicalName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger	log = Logger.getGlobal();
		
		log.info("Hello world!");
		if (log.isLoggable(Level.FINEST)) {
			// 
			log.finest("???");
		}
	}
}
