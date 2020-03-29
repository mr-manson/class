package by.htp.les11.c06;

public class Time {
	private int h;
	private int m;
	private int s;

	public Time() {
	}

	public void setTime(int h, int m, int s) {
		this.h = setIfWrong(h, 23);
		this.m = setIfWrong(m, 59);
		this.s = setIfWrong(s, 59);
	}

	public void addTime(int addH, int addM, int addS) {
		System.out.println("Через " + addH + " ч. " + addM + " мин. " + addS + " сек.:");
		
		if (this.h + addH > 23) {
			this.h = (this.h + addH) % 24;
		} else {
			this.h += addH;
		}
		
		if (this.m + addM > 59) {
			this.m = (this.m + addM) % 60;
			this.h ++;
		} else {
			this.m += addM;
		}
		
		if (this.s + addS > 59) {
			this.s = (this.s + addS) % 60;
			this.m ++;
		} else {
			this.s += addS;
		}

		// return this.s;

	}

	public String getTime() {
		String h = "" + this.h;
		if (this.h < 10) {
			h = "0" + this.h;
		}
		String m = "" + this.m;
		if (this.m < 10) {
			m = "0" + this.m;
		}
		String s = "" + this.s;
		if (this.s < 10) {
			s = "0" + this.s;
		}
		String time = "Текущее время - " + h + ":" + m + ":" + s;
		return time;
	}

	public int setIfWrong(int i, int max) {
		if (i < 0 || i > max) {
			return 0;
		} else {
			return i;
		}
	}
}
