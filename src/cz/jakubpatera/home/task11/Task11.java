package cz.jakubpatera.home.task11;

import java.util.Calendar;

public class Task11 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();


        // days
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        int day = calendar.get(calendar.DAY_OF_YEAR);

        int daysLeft = lastDay- day - 8;

        // hours

        int lastHours = calendar.getActualMaximum(Calendar.HOUR_OF_DAY);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        int hoursLeft = lastHours - hours;

        // Minutes

        int lastMinute = calendar.getActualMaximum(Calendar.MINUTE);
        int minutes = calendar.get(Calendar.MINUTE);

        int minutesLeft = lastMinute - minutes;

        // seconds

        int lastSecond = calendar.getActualMaximum(Calendar.SECOND);
        int seconds = calendar.get(Calendar.SECOND);

        int secondsLeft = lastSecond - seconds;

        System.out.println(" Till Christmas left " + daysLeft + " days " + hoursLeft + " hours " + minutesLeft + " minutes " + secondsLeft + " seconds");


    }
}
