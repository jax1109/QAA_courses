/**
 * Created by HP on 04.10.2015.
 * Home task 4 - Сумма цифр натурального числа
 */
import java.util.Scanner; // импортируем класс
public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number N");
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        String s = sc.next();
                String[] a = s.split("");
                int m=0;
                for(int i=1;i<a.length;i++){
                    m+=Integer.parseInt(a[i]);
                }
                System.out.println(m);
            }
}
