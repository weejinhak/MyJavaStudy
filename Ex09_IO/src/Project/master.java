package Project;

import java.io.Serializable;
import java.util.Scanner;
 
public class master implements Serializable {
 
   //������ ��Ͽ��� ��ü��, ������ �̸�, ��й�ȣ�� �Է��Ѵ�
   private String com = "";
   private String mname = "";
   private int pwd = 0;
   
   public master input_m (master ma){
      
      Scanner scan = new Scanner(System.in);
      System.out.print("��ü���� �Է��ϼ��� : ");
       this.com = scan.next();   
       System.out.print("������ �̸��� �Է��ϼ��� : ");
       this.mname = scan.next();
       System.out.println("��й�ȣ�� �Է��ϼ��� : ");
       this.pwd = scan.nextInt();
       
      return ma;
   }
 
   public String getCom() {
      return com;
   }
 
   public void setCom(String com) {
      this.com = com;
   }
 
   public String getMname() {
      return mname;
   }
 
   public void setMname(String mname) {
      this.mname = mname;
   }
 
   public int getPwd() {
      return pwd;
   }
 
   public void setPwd(int pwd) {
      this.pwd = pwd;
   }
 
   @Override
   public String toString() {
      return "master [com=" + com + ", mname=" + mname + ", pwd=" + pwd + "]";
   }
}
