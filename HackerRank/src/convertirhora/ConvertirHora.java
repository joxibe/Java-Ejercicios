package convertirhora;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;

public class ConvertirHora {

    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        String hour = "07:05:45PM";
        System.out.println(timeConversion(hour));
    }

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;
        if (s.endsWith("PM")) {
            hour += 12;
        }
        return String.format("%02d", hour) + s.substring(2, 8);
    }
}
