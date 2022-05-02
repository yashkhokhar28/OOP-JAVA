import java.util.Scanner;

class Time{
	int hour;
	int minutes;
	int seconds;

	public Time(int hour,int minutes,int seconds){
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
	}

	void addTime(Time t){
		this.seconds=this.seconds+t.seconds;
		if (this.seconds>60) {
			this.minutes++;
			this.seconds = this.seconds - 60;
		}

		this.minutes=this.minutes+t.minutes;
		if (this.minutes>60) {
			this.hour++;
			this.minutes = this.minutes - 60;
		}

		this.hour = this.hour + t.hour;
	}
}

public class timedemo{
	public static void main(String[] args) {
		Time t1 = new Time(1,30,0);
		Time t2 = new Time(1,30,0);

		t1.addTime(t2);

		System.out.println(t1.hour + ":" + t1.minutes + ":" + t1.seconds);
	}
}