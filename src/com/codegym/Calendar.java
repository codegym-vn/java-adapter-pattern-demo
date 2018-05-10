package com.codegym;

public interface Calendar {
    int FIELD_DATE = 1;
    int FIELD_MONTH = 2;
    int FIELD_YEAR = 3;

    int getField(int field);
}
