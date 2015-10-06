package hometask1;

/**
 * Created by HP on 04.10.2015.
 * Home task 3 - Квадратное уравнение
 */
public class Equation {
    public static void main(String[] args) {
        double a = 1;
        double b = -2;
        double c = 1;
        double D,x1,x2;

        D = b*b-4*a*c;

        if (D < 0) {
            System.out.println("Net veschestvennih kornej");
        }
        else if (D == 0) {
                x1 = -b / (2 * a);
                System.out.println("1 koren " + x1);

            }
        else if (D > 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);

            System.out.println("1 koren " + x1);
            System.out.println("2 koren " + x2);
        }

    }

}
