package com.busurca;

class LeapYear {

    boolean isLeapYear(int year) {

        boolean isLeapYear = false;

        if (year >= 1 && year <= 9999) {


            int reminderBy4 = year % 4;
            int reminderBy100 = year % 100;
            int reminderBy400 = year % 400;

            if (reminderBy4 == 0 && reminderBy100 == 0 && reminderBy400 == 0) {
                isLeapYear = true;
            }

            if (reminderBy4 == 0 && reminderBy100 != 0) {
                isLeapYear = true;
            }
        }

        return isLeapYear;
    }
}
