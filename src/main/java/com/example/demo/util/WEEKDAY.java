package com.example.demo.util;

public enum WEEKDAY {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	private int day;
	WEEKDAY(int day) {
		this.day = day;
	}

	public static WEEKDAY weekDay(int day) {
		for (WEEKDAY wDay : WEEKDAY.values()) {
			if (wDay.day == day) {
				return wDay;
			}
		}
		return null;
	}
}