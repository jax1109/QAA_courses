package Homework2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Jax on 10.10.15.
 */
public class ht4StringSort {
        public static void main(String[] args) {
            String a[] = {"Kiev", "Kharkov", "Lvov", "Odessa", "Lutsk", "Orel", "Summy"};
            Arrays.sort(a);

            System.out.println("");
            for (int i=0; i<a.length; i++) {
                System.out.print(a[i] + " ");
                }
        }
}
