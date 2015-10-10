package Homework1;

/**
 * Created by HP on 04.10.2015.
 */
public class Fibonachi {
        public static void main(String[] args) {
            int a =0;
            int b =1;

            for(int i = 0; i<20; i++) {
                int c = a+b;
                System.out.println (b+", ");
                a = b;
                b = c;
            }
        }

}
