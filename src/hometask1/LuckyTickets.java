package hometask1;

import java.util.Scanner;

/**
 * Created by kovalevskyi.i on 10/5/2015.
 * Home task 5 - ���������� ������ (��������� �� �����)
 */

public class LuckyTickets {
    public static void main(String[] args) {

                //�������� ����������, � ������� ����� �������� ���������� ���������� ���������
                int b=0;
                //� ������� �������� ����� � ������� �� ������ ������� �������� ���� ����������. ����������� "�������"
                // ������ ���, ����� ����� ������ 3 ����� ����� ����� ������ ������. ��� ��� ����������� ����� �����
                // ����� ���� ������ ����� 1000, �������� ���� � ���
                for(int i=1;i<=999999;i++){
                    int i1=i/100000%10;
                    int i2=i/10000%10;
                    int i3=i/1000%10;
                    int i4=i/100%10;
                    int i5=i/10%10;
                    int i6=i%10;
                    if((i1+i2+i3)==(i4+i5+i6)){
                        b++;
                    }
                }
                System.out.println(b);
            }
    }