package Hometask2;

import java.util.Random;

/**
 * Created by HP on 07.10.2015.
 */
public class Massive {
/*    public static void main(String[] args) {
        int[][] a = new int[5][10];
        int b = a.length;
        for (int i = 0;i < a.length; i++)
        {
            for (int y = 0; y < 10; y++) {
                a[i][y] = new Random().nextInt((99 - 10) + 1) + 10;
                System.out.print(a[i][y] + " ");
            }
            System.out.println("");
        }
    }
*/

   public static void main(String[] args) {
        int[] a = new int[10];
        int b = a.length;
        for (int u = 0;u < 5; u++){
        for (int i = 0;i < a.length; i++)
        {
            a[i] = new Random().nextInt((99 - 10) + 1) + 10;
            System.out.print(a[i] + " ");

//            for (int y = 0; y < 10; y++) {
//                a[i][y] = new Random().nextInt((99 - 10) + 1) + 10;
//                System.out.print(a[i][y] + " ");
//            }

        }
            System.out.println("");
    }

}
}