package Project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
 
public class M implements Serializable {
 
   private String company = ""; // ��ü��
   private String ename = ""; // �˹ٻ� �̸�
   private final int HOURSMONEY = 6500; // �ñ�
   private int day = 0; // ���� �� �ϼ�
   private double shour = 0; // �Ϸ� ���� ������ �ð�
   private double ehour = 0; // �Ϸ� ���� ���� �ð�
   private double pay = 0; // �� ���� �ð�
   private double sum = 0; // �� �ݾ�
   private double time[]=new double[48];
   private ArrayList<Double> temp = new ArrayList<>(); 
   private int count=0;
   private int nocount=0;
   public int getHOURSMONEY() {
      return HOURSMONEY;
   }
 
   public M input(M m) { // M Ŭ������ �Ķ���ͷ� �޾Ƽ� ��ǲ�� �޾� ���� �Է¹޴´�
 
      Scanner scan = new Scanner(System.in);
      System.out.print("��ü���� �Է��ϼ��� : ");
      this.company = scan.next();
      System.out.print("�˹ٻ� �̸��� �Է��ϼ��� : ");
      this.ename = scan.next();
      System.out.print("���� �� �ϼ��� �Է��ϼ��� : ");
      this.day = scan.nextInt();
      System.out.print("���� ������ �ð� , 24�ð� ������ �Է��Ͻÿ� [ex) 11��, 22.5�� ]  : ");
      this.shour = scan.nextDouble();
      System.out.print("���� ���� �ð� , 24�ð� ������ �Է��Ͻÿ� [ex) 11��, 22.5�� ]  : ");
      this.ehour = scan.nextDouble();
      // ��, 22:00 ���� 08:00 ������ �ñ��� 1.5���� �߰� ������ �޴´�
      if (ehour < shour) {
         this.pay = (24 - this.shour) + this.ehour; // �� ���ѽð�
      }else
      this.pay = this.ehour - this.shour;
      System.out.println("�� ���� �ð� : " + this.pay);
 
      // �߰����� �����ϱ�
      for(int i=0;i<48;i++){
         time[i]=(i+1)*0.5;
         if(this.shour<this.ehour){
         if(time[i]>=this.shour && time[i]<=this.ehour){
            temp.add(time[i]);//���۽ð��� �����ð��ȿ� ���� ��̸���Ʈ �ε�����
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
      System.out.println("�� �ӱ��� " + pay + "�� �Դϴ�");
 
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

