package Homework2;

/**
 * Created by Jax on 09.10.15.
 * Home task 1
 */
import java.util.Scanner; // ����������� �����
public class ht1Parser {
    public static void main(String[] args) {
        System.out.println("Enter the number N");
        Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
        String s = sc.next();
        String[] a = s.split("");
        int m=0;
        for(int i=0;i<a.length;i++){
            m=m+Integer.parseInt(a[i]);
        }
        System.out.println(m);
    }
}


