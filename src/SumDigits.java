/**
 * Created by HP on 04.10.2015.
 * Home task 4 - ����� ���� ������������ �����
 */
import java.util.Scanner; // ����������� �����
public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number N");
        Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
        String s = sc.next();
                String[] a = s.split("");
                int m=0;
                for(int i=1;i<a.length;i++){
                    m+=Integer.parseInt(a[i]);
                }
                System.out.println(m);
            }
}
