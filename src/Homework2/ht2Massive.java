package Homework2;

import java.util.Random;

/**
 * Created by HP on 07.10.2015.
 */
public class ht2Massive {
   public static void main(String[] args) {
        int[] a = new int[10];
        int b = a.length;
        for (int u = 0;u < 5; u++){
        for (int i = 0;i < a.length; i++)
        {
            a[i] = new Random().nextInt((99 - 10) + 1) + 10;
            System.out.print(a[i] + " ");

        }
            System.out.println("");
    }

}
}