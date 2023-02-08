package org.example;
public class Time {

    int [] time_array = new int[ 6 ];



    private int hour; // instance variables
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) { // arguments parameters
        this.hour = hour;
        this.minute = minute;
        this.second = second; // class constructor
    }

    public int getHour() {
        return hour;
    } //getter for private

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    } // no return updating

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public String toString() {
        return hour + ":" + minute  + ":" + second;

    }

    public Time nextSecond() {  // method
        if (this.second <= 58) {
            second = second +1;

        } else if (this.second == 59) {
            second = 00;
            minute = minute + 1;

        } else if (this.second >= 60) {
        second = 0;
        minute = minute + 1;

        } else if (this.second >= 0) {
            second = second+1;

    }
        return this;
    }

    public Time previousSecond() {
        if (this.second <= 0) {
            second = 59;
            minute = minute -1;

        } else if (this.second >= 60) {
        second = 59;

        } else if (this.second >= 0) {
            second = second-1;
    }
        return this;
    }
}












