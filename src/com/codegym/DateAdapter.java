package com.codegym;

public class DateAdapter implements Calendar {
    private Date date;

    public DateAdapter(Date date) {
        this.date = date;
    }

    @Override
    public int getField(int field) {
        switch (field){
            case Calendar.FIELD_DATE:
                return date.getDate();
            case Calendar.FIELD_MONTH:
                return date.getMonth();
            case Calendar.FIELD_YEAR:
                return date.getYear();
                default:
                    throw new RuntimeException("Invalid field");
        }
    }
}
