package edu.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfoLogWriter implements LogWriter {

	@Override
	public void writeToLog(String msg) {
		Logger log = LoggerFactory.getLogger(InfoLogWriter.class);
		log.info(msg);
	}

}
