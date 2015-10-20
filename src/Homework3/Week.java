package Homework3;

import java.util.Collections;

//public class Enum {
    /**
     * Created by Jax on 10.10.15.
     */
    public enum Week {
        WEEKDAY1("Monday"),
        WEEKDAY2("Tuesday"),
        WEEKDAY3("Wednesday"),
        WEEKDAY4("Thursday"),
        WEEKDAY5("Firday"),
        WEEKDAY6("Suturday"),
        WEEKDAY7("Sunday");

    public final String value;

        Week(String d){
            value = d;
        }

    }
