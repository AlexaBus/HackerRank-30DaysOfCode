package com.busurca;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

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

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = 0;

        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            daysInMonth = -1;
        } else {

            switch (month) {
                case 1:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else daysInMonth = 28;
                    break;
                case 3:
                    daysInMonth = 31;
                    break;
                case 4:
                    daysInMonth = 30;
                    break;
                case 5:
                    daysInMonth = 31;
                    break;
                case 6:
                    daysInMonth = 30;
                    break;
                case 7:
                    daysInMonth = 31;
                    break;
                case 8:
                    daysInMonth = 31;
                    break;
                case 9:
                    daysInMonth = 30;
                    break;
                case 10:
                    daysInMonth = 31;
                    break;
                case 11:
                    daysInMonth = 30;
                    break;
                case 12:
                    daysInMonth = 31;
                    break;
            }
        }

        return daysInMonth;

    }

}
