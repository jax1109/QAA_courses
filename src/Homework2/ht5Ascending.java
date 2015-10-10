package Homework2;

import java.util.Random;

/**
 * Created by Jax on 10.10.15.
 */
public class ht5Ascending {
    public static void main(String[] args) {
        int [] a = new int[3];

            for (int i = 0;i < a.length; i++){
                a[i] = (int)(Math.random()*(99-10)  + 10);
                System.out.print(a[i] + " ");
    }
        boolean ascending = true;
        for (int i=1; i<a.length; i++){
           if(a[i]<a[i-1]) {
               ascending = false;
           }
        }
        System.out.println("");
        System.out.println("array is ascending: "+ascending);
    }
}
