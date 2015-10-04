/**
 * Created by HP on 04.10.2015.
 */
import java.util.Scanner; // импортируем класс
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number N");
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int a = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result*= i;
        }
        System.out.print(result);
    }
}
