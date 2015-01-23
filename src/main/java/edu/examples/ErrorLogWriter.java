package edu.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorLogWriter implements LogWriter {

	@Override
	public void writeToLog(String msg) {
		Logger log = LoggerFactory.getLogger(ErrorLogWriter.class);
		log.error(msg);
	}

}
