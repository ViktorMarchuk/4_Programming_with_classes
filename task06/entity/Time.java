package by.epam.task06.entity;

import java.util.Objects;

public class Time{
    private int hour;
    private int minute;
    private int secunde;

    public Time() {

    }

    public Time(int hour, int minute, int secunde) {
        this.hour = hour;
        this.minute = minute;
        this.secunde = secunde;

    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;

    }

    public int getMinute() {
        return minute;
    }

    public void setSecunde(int secunde) {
        this.secunde = secunde;
    }

    public int getSecunde() {
        return secunde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, secunde);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        return hour == other.hour && minute == other.minute && secunde == other.secunde;
    }

    @Override
    public String toString() {
        return "Time [hour=" + hour + ", minute=" + minute + ", secunde=" + secunde + "]";
    }
}
