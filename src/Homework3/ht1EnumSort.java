package Homework3;

import java.util.Collections;

/**
 * Created by Jax on 10.10.15.
 */
public class ht1EnumSort {
    public static void main(String[] args) {
        private enum Week {
            WEEKDAY1("Monday"),
            WEEKDAY2("Tuesday"),
            WEEKDAY3("Wednesday"),
            WEEKDAY4("Thursday"),
            WEEKDAY5("Firday"),
            WEEKDAY6("Suturday"),
            WEEKDAY7("Sunday");


        }
        System.out.println(Collections.sort(Week));
    }
}