package Project;

import java.util.Scanner;

public class Salary_Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
    /*    M a = new M();
        a.input(a);*/
        
        System.out.println("�˹ٻ� �ñ� ���� ���α׷�");
        System.out.println("�Ŵ���<0>   �˹ٻ�<1>");
        System.out.print("���ϴ� �޴��� �����ϼ��� : ");
        
        
        while(true)
        {
            switch(sc.nextInt())
            {
            case 0 :
            Manager mg = new Manager();
            break;
            
            case 1 :
            break;
            }
            
        }
        
        
    }
}