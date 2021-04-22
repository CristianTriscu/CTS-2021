package ro.ase.acs.cts.main;

import ro.ase.cts.logger.Logger;
import ro.ase.cts.logger.LoggerSingleton;
import ro.ase.cts.logger.LoggerSingletonV2;
import ro.ase.cts.logger.LoggerSingletonWithEnum;

public class Gui {

	public static void main (String[] args) {
//		Logger logger=new Logger();
//		logger.log("GUI Opened!");
	
		LoggerSingleton logger=LoggerSingleton.getInstance("Logger.tx");
		logger.log("GUI opened!");
		
		logger=LoggerSingleton.getInstance();
		logger.log("GUI closed");
		
		LoggerSingletonWithEnum.INSTANCE.log("Enum!");
		LoggerSingletonV2.instance.log("Logger v2");
		}
}
