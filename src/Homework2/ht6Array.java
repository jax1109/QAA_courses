package Homework2;

/**
 * Created by Jax on 10.10.15.
 */
public class ht6Array {
    public static void main(String[] args){
        //�������� ������
        int [][] Mas = new int[6][7];
        //�������� ������
        for(int i =0;i<Mas.length;i++){
            //������ ������ ��� �������� ����������
            System.out.print("������ �"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)(Math.random()*10);
                //������� �� ����� �������� ������
                System.out.print(Mas[i][h]+" ");
                //�������� ��� ����������, � ������� ����� ��������� �������� ������������� �������� ������ ������� � ��� ������
                int max=0,temp_index=0;;
                //�������� �������� ������� �������� � ����������, � ������� ����� ���������� ��������� �������� ���������. ���� �������� ���������� ������, ���������� �������� ����� ��������, ������ �������� � ������ ����������� �� ������ ����������
                if(h==0)max=Mas[i][h];
                else {
                    if(max<Mas[i][h]){
                        max=Mas[i][h];
                        temp_index=h;
                    }
                }
                //�� ���������� ����� ������, ������ ������� ������ � ������������ �������, ���� ��� ����������
                if(h==Mas[i].length-1){
                    int temp = Mas[i][0];
                    Mas[i][0]=Mas[i][temp_index];
                    Mas[i][temp_index]=temp;
                }
            }
            System.out.println(" ");
        }
        //������� ������������ ������ �� �����
        for(int i =0;i<Mas.length;i++){
            System.out.print("������������ ������ �"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                System.out.print(Mas[i][h]+" ");
            }
            System.out.println(" ");
        }
    }
}