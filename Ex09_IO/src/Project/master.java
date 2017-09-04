package Project;

import java.io.Serializable;
import java.util.Scanner;
 
public class master implements Serializable {
 
   //관리자 등록에는 업체명, 관리자 이름, 비밀번호를 입력한다
   private String com = "";
   private String mname = "";
   private int pwd = 0;
   
   public master input_m (master ma){
      
      Scanner scan = new Scanner(System.in);
      System.out.print("업체명을 입력하세요 : ");
       this.com = scan.next();   
       System.out.print("관리자 이름을 입력하세요 : ");
       this.mname = scan.next();
       System.out.println("비밀번호를 입력하세요 : ");
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
