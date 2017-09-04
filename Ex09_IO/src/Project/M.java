package Project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
 
public class M implements Serializable {
 
   private String company = ""; // 업체명
   private String ename = ""; // 알바생 이름
   private final int HOURSMONEY = 6500; // 시급
   private int day = 0; // 일한 총 일수
   private double shour = 0; // 하루 일을 시작한 시간
   private double ehour = 0; // 하루 일을 끝낸 시간
   private double pay = 0; // 총 일한 시간
   private double sum = 0; // 총 금액
   private double time[]=new double[48];
   private ArrayList<Double> temp = new ArrayList<>(); 
   private int count=0;
   private int nocount=0;
   public int getHOURSMONEY() {
      return HOURSMONEY;
   }
 
   public M input(M m) { // M 클래스를 파라메터로 받아서 인풋을 받아 값을 입력받는다
 
      Scanner scan = new Scanner(System.in);
      System.out.print("업체명을 입력하세요 : ");
      this.company = scan.next();
      System.out.print("알바생 이름을 입력하세요 : ");
      this.ename = scan.next();
      System.out.print("일한 총 일수를 입력하세요 : ");
      this.day = scan.nextInt();
      System.out.print("일을 시작한 시간 , 24시간 단위로 입력하시오 [ex) 11시, 22.5시 ]  : ");
      this.shour = scan.nextDouble();
      System.out.print("일을 끝낸 시간 , 24시간 단위로 입력하시오 [ex) 11시, 22.5시 ]  : ");
      this.ehour = scan.nextDouble();
      // 단, 22:00 부터 08:00 까지는 시급의 1.5배인 야간 수당을 받는다
      if (ehour < shour) {
         this.pay = (24 - this.shour) + this.ehour; // 총 일한시간
      }else
      this.pay = this.ehour - this.shour;
      System.out.println("총 일한 시간 : " + this.pay);
 
      // 야간수당 변경하기
      for(int i=0;i<48;i++){
         time[i]=(i+1)*0.5;
         if(this.shour<this.ehour){
         if(time[i]>=this.shour && time[i]<=this.ehour){
            temp.add(time[i]);//시작시간과 끝나시간안에 들어가면 어레이리스트 인덱스입
         }}
         else{
           if((time[i]>=this.shour && time[i]<=24)||time[i]<=this.ehour){
              temp.add(time[i]);
           }
         }
      }
      
      for(int i=0;i<temp.size();i++){
         if(temp.get(i)>=22 && temp.get(i)<=24){
            this.count++;
         }else if(temp.get(i)<=8){
            this.count++;
         }else{
            this.nocount++;
         }
      }
      
     this.pay=(count-1)*1.5*HOURSMONEY/2+nocount*HOURSMONEY/2;
      System.out.println("총 임금은 " + pay + "원 입니다");
 
      return m;
   }
 
   public String getCompany() {
      return company;
   }
 
   public void setCompany(String company) {
      this.company = company;
   }
 
   public String getEname() {
      return ename;
   }
 
   public void setEname(String ename) {
      this.ename = ename;
   }
 
   public int getDay() {
      return day;
   }
 
   public void setDay(int day) {
      this.day = day;
   }
 
   public double getShour() {
      return shour;
   }
 
   public void setShour(int shour) {
      this.shour = shour;
   }
 
   public double getEhour() {
      return ehour;
   }
 
   public void setEhour(int ehour) {
      this.ehour = ehour;
   }
 
   public double getPay() {
      return pay;
   }
 
   public void setPay(int pay) {
      this.pay = pay;
   }
 
   public double getSum() {
      return sum;
   }
 
   public void setSum(double sum) {
      this.sum = sum;
   }
 
   @Override
   public String toString() {
      return "M [company=" + company + ", ename=" + ename + ", HOURSMONEY=" + HOURSMONEY + ", day=" + day + ", shour="
            + shour + ", ehour=" + ehour + ", pay=" + pay + ", sum=" + sum + "]";
   }
 
 
 
}

