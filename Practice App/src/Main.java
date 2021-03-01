
public class Main {
	
	public static void main(String[] args) {
		Timer timer = new Timer();	
		FormatTime format = new FormatTime();
		Boolean notFinished = true;
		InputTime inputTime = new InputTime();
		long stopTime = 0;
		
		System.out.println("a = 00:05, b = 00:10");
		inputTime.getInput();
				
		timer.setStartTime();
		stopTime = timer.startTime + inputTime.getInputTime();
		
		while(notFinished) {				
			timer.setElapsedSeconds();
			String timeDisplay = format.formatDisplay(timer.getDisplayMinute()) + ":" + format.formatDisplay(timer.getDisplaySeconds());
			System.out.println(timeDisplay);	
			if(System.currentTimeMillis() == stopTime) {
				System.out.println("end");
				notFinished = false;
			}
		}
	}
	
}
