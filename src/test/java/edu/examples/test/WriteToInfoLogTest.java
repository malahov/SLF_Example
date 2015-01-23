package edu.examples.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import edu.examples.InfoLogWriter;
import edu.examples.LogWriter;

@Category(InfoLogWriter.class)
public class WriteToInfoLogTest {

	@Test
	public void writeToInfoLog() {
		LogWriter writer = new InfoLogWriter();
		writer.writeToLog(this.getClass().getName());
	}
}
