package com.codegym;

public class Client {
    public void printCalendar(Calendar calendar){
        System.out.println("Date: " + calendar.getField(Calendar.FIELD_DATE));
        System.out.println("Month: " + calendar.getField(Calendar.FIELD_MONTH));
        System.out.println("Year: " + calendar.getField(Calendar.FIELD_YEAR));
    }
}
