package com.gwh.sftg.adv217;

import java.util.Scanner;

class Time {
	int hour;
	int minute;
	int second;

	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}

	public void print() {
		if (second < 0) {
			minute = minute + second / 60 - 1;
			second = second % 60 + 60;
		}
		if (minute < 0) {
			hour = hour + minute / 60 - 1;
			minute = minute % 60 + 60;
		}
		if (hour < 0) {
			hour = hour % 24 + 24;
		}
		if (second >= 60) {
			minute = minute + second / 60;
			second = second % 60;
		}
		if (minute >= 60) {
			hour = hour + minute / 60;
			minute = minute % 60;
		}
		if (hour >= 24) {
			hour = hour % 24;
		}
		String strh, strm, strs;
		if (hour < 10)
			strh = "0" + hour;
		else
			strh = "" + hour;
		if (minute < 10)
			strm = "0" + minute;
		else
			strm = "" + minute;
		if (second < 10)
			strs = "0" + second;
		else
			strs = "" + second;
		System.out.println(strh + ":" + strm + ":" + strs);
	}

	public void adv(int incr_hr, int incr_min, int incr_sec) {
		hour = hour + incr_hr;
		minute = minute + incr_min;
		second = second + incr_sec;
	}

	public void reset() {
		hour = 0;
		minute = 0;
		second = 0;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 当前时间
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		// 时间增量
		int incr_hr = sc.nextInt();
		int incr_min = sc.nextInt();
		int incr_sec = sc.nextInt();
		Time t = new Time(hour, minute, second);
		t.print();
		t.adv(incr_hr, incr_min, incr_sec);
		t.print();
		t.reset();
		t.print();
	}
}
