
public class FormatTime {
	
	public String formatDisplay(long displayTime) {
		if(displayTime > 9) {
			return Long.toString(displayTime);
		}
		else {
			return "0" + Long.toString(displayTime);
		}
	}
	
}
