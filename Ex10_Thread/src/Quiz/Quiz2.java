package Quiz;

import javax.swing.JOptionPane;

class WordTime3 extends Thread {
   @Override
   public void run() {
      for (int i = 10; i > 0; i--) {
         if (Quiz2.incorr >= 3) {
            System.out.println("���� ����");
 
            Quiz2.incorr_stop = true;
            return;// run �Լ� ����
         }
         try {
            System.out.println("���� �ð� : " + i);
            Thread.sleep(1000);

         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
      }
      Quiz2.time_stop = true;
      
      
   }
}
 
class Input3 extends Thread {
   @Override
   public void run() {
      while (Quiz2.incorr_stop == false && Quiz2.time_stop == false) {
         int random1 = (int) ((Math.random() * 9) + 1);
         int random2 = (int) ((Math.random() * 9) + 1);
         int result = random1 * random2;
         String inputdata = JOptionPane.showInputDialog(random1 + " * " + random2 + " = ");
         int Idata = Integer.parseInt(inputdata);
         if (Idata == result) {
            Quiz2.corr++;
            System.out.println("���� ����:" + Quiz2.corr);
         } else {
            Quiz2.incorr++;
            System.out.println("���� ����:" + Quiz2.incorr);
         }
         System.out.println("�Է��� ���� : " + inputdata);
      }
   }
}
 
public class Quiz2 {
   static int corr = 0;
   static int incorr = 0;
   static boolean incorr_stop = false;
   static boolean time_stop = false;
 
   public static void main(String[] args) {
      
      WordTime3 timer = new WordTime3();
      Input3 input = new Input3();
      input.start();
      timer.start();
      
      System.out.println("Main End");
 
   }
 
}
