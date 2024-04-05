package week03.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;
    public CustomTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public CustomTime(){
        this.hour = 0;
        this.second = 0;
        this.minute = 0;
    }
    public CustomTime(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }
    public CustomTime(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }
    public CustomTime(CustomTime time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandardString(){
        String period;
        int ordinaryHour;
        if(hour<12){
            period = "AM";
        }
        else{
            period = "PM";
        }
        if((hour == 0) || (hour == 12)){
            ordinaryHour = 12;
        }
        else{
            ordinaryHour = hour % 12;
        }
        return String.format("%d:%02d:%02d %s", ordinaryHour, minute, second, period);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d:%02d:%02d", hour, minute, second));
        return sb.toString();
    }
}
