package com.busurca;

public class SecondsAndMinutesChallenge {

    public static final String INVALID_PARAMETERS_MESSAGE = "Invalid parameters";

    public static String getDurationString(int minutes, int seconds) {

        String value;

        int hours =  minutes / 60;
        int minutesLeft = minutes % 60;

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_PARAMETERS_MESSAGE;
        }

        String secondsString = seconds + "ss";
        if(lessThan10(seconds)) {secondsString = "0" + secondsString;}

        String minutesString = minutesLeft + "mm ";
        if(lessThan10(minutesLeft)) {minutesString = "0" + minutesString;}

        String hoursString = hours + "hh ";
        if(lessThan10(hours)) {hoursString = "0" + hoursString;}

        value = hoursString + minutesString + secondsString;

        return value;

    }

    public static String getDurationString(int seconds) {

        String value;

        int minutes = seconds / 60;
        int secondsLeft = seconds % 60;

        if (seconds < 0) {
            value =  INVALID_PARAMETERS_MESSAGE;
        } else {
            value = getDurationString(minutes, secondsLeft);
        }

        return value;

    }

    public static boolean lessThan10(int number) {
        return number < 10;
    }

}
