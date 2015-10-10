package Homework2;

import java.util.Random;
/**
 * Created by Jax on 10.10.15.
 */
public class ht3ArraySort {
    public static void main(String[] args) {
    int a[] = new int[10];
    for (int i=0; i<a.length; i++) {
        a[i] = new Random().nextInt(100);
        System.out.print(a[i] + " ");// выводим сгенерированный массив
        }

        //сортируем этот массив методом пузырька
        for (int i = a.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
        System.out.println("");
        for (int i=0; i<a.length; i++) {
          System.out.print(a[i] + " ");
        }
}
}