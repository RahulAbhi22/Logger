/**
 * 
 */
package logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Rahul
 *
 */
public class TextFileWriter implements GenericFileWriter {
	
	public TextFileWriter(AsyncLogger logger) {
		logger.registerWriters(this);
	}

	@Override
	public void writeToFile(LogData log) {
		try {
			FileWriter fc = new FileWriter(new File("F//test.txt"));
			fc.write("Async Logger:: "+ log.getMessage()+ " Level:::"+ log.getLevel() );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
