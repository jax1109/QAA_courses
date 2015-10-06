package hometask1;

/**
 * Created by HP on 04.10.2015.
 * 2.10.15 Home task 2
 */
public class NearestToTen {
    public static void main(String[] args) {
        double m = -5.1;
        double n = 5;
        double absm = Math.abs(10 - m);
        double absn = Math.abs(10 - n);

        if (absm < absn) {
            System.out.println("M is the nearest to 10");
        }
        else {
            System.out.println("N is the nearest to 10");
        }

    }

}
