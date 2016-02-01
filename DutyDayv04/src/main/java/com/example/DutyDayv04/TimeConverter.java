package com.example.DutyDayv04;

public class TimeConverter {
	public int realHours1, realMinutes;
	public int startTime;
	public int endTime;
	public int NumSectors;
	public int maxTime;
	public int standby;
	public boolean WOCL;

	static int getMinutes(int hours, int minutes) {
		return (hours * 60) + minutes;
	}

	static TimeConverter TimeConverter1(int minutes) {
		TimeConverter MyActualTime1 = new TimeConverter();
		int hours1 = minutes / 60;
		int minutes1 = (minutes - (hours1 * 60));
		MyActualTime1.realHours1 = hours1;
		MyActualTime1.realMinutes = minutes1;
		return MyActualTime1;
	}

}
