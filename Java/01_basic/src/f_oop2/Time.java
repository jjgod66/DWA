package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;

//	public int hour;
//	public int minute;
//	public int second;
	
	
	String getTime() {
		return hour + ":" + minute + ":" + second;
	}
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (0 < hour && hour <= 23) {
			this.hour = hour;
		} else if (hour >= 24) {
			this.hour = hour - 24;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (0 < minute && minute <= 59) {
			this.minute = minute;
		} else if (minute >= 60) {
			this.hour += (minute / 60);
			this.minute = minute - 60;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (0 < second && second <= 59) {
			this.second = second;
		} else if (second >= 60) {
			this.minute += (second / 60);
			this.second = second - 60;
		}
	}
	
	void clock() {
		while (true) {
			System.out.println(getTime());
			stop(1000);
			setSecond(second + 1);
			setMinute(minute);
			setHour(hour);
		}
	}
	
	private void stop(int interval) {
		try {
			Thread.sleep(interval); // 1/1000 milliseconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
