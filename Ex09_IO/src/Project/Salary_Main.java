package Project;

import java.util.Scanner;

public class Salary_Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
    /*    M a = new M();
        a.input(a);*/
        
        System.out.println("알바생 시급 관리 프로그램");
        System.out.println("매니저<0>   알바생<1>");
        System.out.print("원하는 메뉴를 선택하세요 : ");
        
        
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