package linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList {
	private static final String WE_VE_JUST_GREETED_THE_USER = "We've just greeted the user!";
	private static final Logger logger = LogManager.getLogger(LinkedList.class);

	public static void main(String[] args) {
		logger.debug(WE_VE_JUST_GREETED_THE_USER);
		logger.info(WE_VE_JUST_GREETED_THE_USER);
		logger.warn(WE_VE_JUST_GREETED_THE_USER);
		logger.error(WE_VE_JUST_GREETED_THE_USER);
		logger.fatal(WE_VE_JUST_GREETED_THE_USER);
	}

}
