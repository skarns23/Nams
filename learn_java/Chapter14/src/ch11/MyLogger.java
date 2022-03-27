package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	// mylogger라는 식별자를 주면 항상 같은 인스턴스를 반환
	private static MyLogger instance = new MyLogger();
	//싱글톤 패턴을 위한 코드
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	public  FileHandler logFile = null;
	public  FileHandler warningFile = null;
	public  FileHandler fineFile = null;

	private MyLogger() {
			try {
				logFile = new FileHandler(errorLog,true);
				warningFile = new FileHandler(warningLog,true);
				fineFile = new FileHandler(fineLog,true);
				//true는 append해서 뒤에 연결해서 쓰는 기능
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logFile.setFormatter(new SimpleFormatter());
			warningFile.setFormatter(new SimpleFormatter());
			fineFile.setFormatter(new SimpleFormatter());
			
			logger.setLevel(Level.ALL      ); 
			fineFile.setLevel(Level.FINE);
			warningFile.setLevel(Level.WARNING);
			
			logger.addHandler(logFile);
			logger.addHandler(fineFile);
			logger.addHandler(warningFile);
			
		
	}
	public static MyLogger getLogger() {
		return instance;
	}
	
	public void log(String msg) {
		logger.finest(msg); // 정보로그
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
	}
	
	public void fine(String msg) {
		logger.fine(msg);
	}
	public void warning(String msg) {
		logger.warning(msg);
	}
}
