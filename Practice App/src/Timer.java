
public class Timer {
	
	long startTime;
	long elapsedSeconds;	
	
	public void setStartTime() {
		startTime = System.currentTimeMillis();
	}
	
	public void setElapsedSeconds() {
		long elapsedTime = System.currentTimeMillis() - startTime;
		elapsedSeconds = elapsedTime/1000;	
	}
	
	public long getDisplaySeconds() {
		long secondDisplay = elapsedSeconds % 60;
		
		return secondDisplay;		
	}
	
	public long getDisplayMinute() {
		long elapsedMinutes = elapsedSeconds / 60;
		
		return elapsedMinutes;
	}
		
}
