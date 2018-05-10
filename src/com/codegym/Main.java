package com.codegym;

public class Main {

    public static void main(String[] args) {
	    Client client = new Client();
	    Date date = new Date(10, 5, 2018);
	    Calendar calendar = new DateAdapter(date);
	    client.printCalendar(calendar);
    }
}
