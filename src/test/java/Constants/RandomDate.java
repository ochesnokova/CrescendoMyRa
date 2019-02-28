package constants;

import java.util.GregorianCalendar;

/**
 * Created by ochesnokova on 6/6/17.
 */
public class RandomDate {

    public static GregorianCalendar gc = new GregorianCalendar();

    public static void setRandomDate() {

        int year = randBetween(2015, 2017);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        System.out.println(getYear() + "-" + getMonth() + "-" + getDay());

    }

    public static int getDay() {
        return gc.get(gc.DAY_OF_MONTH);
    }

    public static int getYear() {
        return gc.get(gc.YEAR);
    }

    public static int getMonth() {
        return gc.get(gc.MONTH) + 1;
    }


    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }


}
