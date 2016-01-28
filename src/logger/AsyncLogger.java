/**
 * 
 */
package logger;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Rahul
 *
 */
public final class AsyncLogger {
	private static class LogLoader {
		private static AsyncLogger logger = new AsyncLogger();	
	}
	private  Queue<LogData> queue = new LinkedList<LogData>(); 
	private List<GenericFileWriter> writersLists;
	
	private AsyncLogger() {
		// To do handle reflection way of breaking single ton
	}
	
	public void registerWriters(GenericFileWriter wr) {
		writersLists.add(wr);
	}
	public void removeWriters(GenericFileWriter wr) {
		writersLists.remove(wr);
	}
	public static AsyncLogger getInstance() {
		return LogLoader.logger;
	}
	
	public  void  writeLog(String message, String level) {
		LogData newData = new LogData();
		newData.setMessage(message);
		newData.setLevel(level);
		queue.add(newData);
		notifyWriters();
	}
	
	public void notifyWriters() {
		for(GenericFileWriter writer : writersLists){
		writer.writeToFile(queue.poll()	);
		}
	}	
	
}
