package edu.examples.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import edu.examples.ErrorLogWriter;
import edu.examples.LogWriter;

@Category(ErrorLogWriter.class)
public class WriteToErrorLogTest {

	@Test
	public void writeToErrorLog() {
		LogWriter writer = new ErrorLogWriter();
		writer.writeToLog(this.getClass().getName());
	}
}
