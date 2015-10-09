package Hometask2;



/**
 * Created by Jax on 09.10.15.
 */
import java.util.Scanner; // импортируем класс
public class hm1Parser {
    public static void main(String[] args) {
        System.out.println("Enter the number N for sum of its digits");
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner



        int a = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result*= i;
        }
        System.out.print(result);
    }
}
