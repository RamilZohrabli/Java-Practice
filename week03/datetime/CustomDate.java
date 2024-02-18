package week03.datetime;

import java.text.DateFormatSymbols;

public class CustomDate {
    private int month;
    private int day;
    private int year;
    public CustomDate(int month, int day, int year){
        
        this.month = month;
        this.day = day;
        this.year = year;
    }
    private int daysAndMonths(int month, int year){
        switch(month){
            case 4, 6, 9, 11:
            return 30;
            case 2:
            if(LeapYear(year)){
                return 29;
            }
            else{
                return 28;
            }
            default:
            return 31;
        }
    }
    private boolean LeapYear(int year){
        boolean x;
        if((year % 100 != 0) && (year %4 == 0) || (year%400 == 0)){
            x = true;
        } 
        else{
            x = false;
        }
        return x;
    }
    private boolean dateValidity(int month, int day, int year){
        boolean y;
        if(year<1 || (month <1 || month >12) || (day<1 || day > daysAndMonths(month, year))){
            y = false;
        }
        else{
            y = true;
        }
        return y;
    }

    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        if(dateValidity(month, this.day, this.year)){
            this.month = month;
        }
    }
    public void setDay(int day){
        if(dateValidity(this.month, day, this.year)){
            this.day = day;
        }
    }
    public void setYear(int year){
        if(dateValidity(this.month, this.day, year)){
            this.year = year;
        }
    }
    public void displayDate(){
        System.out.printf("%d/%d/%d\n", month, day, year);
    }   
    public int difference(CustomDate date){
        int daysNumber1 = TotalDays(this.year, this.month, this.day);
        int daysNumber2 = TotalDays(date.getYear(), date.getMonth(), date.getDay());
        return Math.abs(daysNumber1 - daysNumber2);
    }
    public static int compare(CustomDate date1, CustomDate date2) {
        return Integer.compare(date1.difference(date2), 0);
    }
    public String displayFormatted() {
    String[] monthNames = new DateFormatSymbols().getMonths();
    return String.format("%02d %s %d", day, monthNames[month - 1], year);
}

    private int TotalDays(int year, int month, int day){
        int totalDays = (year-1)*365 + countingLeapYears(year-1) + dayOfYear(year, month, day);
        return totalDays;
    }
    
    private int countingLeapYears(int year){
        return year/4 - year /100 + year/400;
    }

    private int dayOfYear(int year, int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m];
            if (m == 2 && LeapYear(year)) {
                totalDays++; 
            }
        }
        return totalDays + day;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d/%02d/%d", month, day, year));
        return sb.toString();
    }
}

