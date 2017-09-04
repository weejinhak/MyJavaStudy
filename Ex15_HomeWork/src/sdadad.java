import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class sdadad{
 
   public static Scanner sc = new Scanner(System.in);
 
   public static void main(String[] args) {
      while (true) {
 
         System.out.println("=======================================");
         System.out.println("\t ���ϴ� ��ɾ �Է����ּ���");
         System.out.println("\t*dir    : ���͸� ����");
         System.out.println("\t*mkdir  : ���͸� ���� ");
         System.out.println("\t*redir  : ���͸� ����");
         System.out.println("\t*copy   : ���� ����");
         System.out.println("\t*rename : ���� �̸� ����");
         System.out.println("\t*off    : �����ϱ�");
         System.out.println("=======================================");
 
         String str = sc.nextLine();
         
         switch (str) {
         case "dir": // ���͸� ����
            dir();
            break;
         case "mkdir": // ���͸� �����
            mkdir();
            break;
         case "redir": // ���͸� �����
            redir();
            break;
         case "copy": // ������ ������ ����
            copy();
            break;
         case "rename": // ������ �̸��� �ٲ�
            rename();
            break;
         case "off" : // �����Ŵ
            System.out.println("����˴ϴ�.");
            System.exit(0);
         default:
            System.out.println("�ùٸ��� ���� ��ɾ� �Դϴ�.");
 
         }
      }
   }
 
   static void dir() { // ���͸� ����
      
      System.out.println("�����ϰ� ���� ���丮 ��θ� �Է��Ͻÿ�.");
      System.out.println("Ex) C:\\Kosta");
      String dirName = sc.nextLine();
      File f = new File(dirName);
 
      if (!f.exists() || !f.isDirectory()) {
         System.out.println("��ȿ���� ���� ���͸��Դϴ�.");
         System.exit(0);
      }
      PrintFileList(f);
   }
 
   static void mkdir() { // ���͸� �����
      System.out.println("������ ���丮 ��ο� �� ���丮 �̸� �Է�");
      System.out.println("Ex) C:\\Kosta\\[������]");
      String mkdirName = sc.nextLine();
      File f2 = new File(mkdirName);
 
      if (f2.exists() && f2.isDirectory()) {
         System.out.println("�����ϴ� �����Դϴ�.");
      } else {
         f2.mkdir();
         System.out.println("���͸� ������ �Ϸ�Ǿ����ϴ�.");
      }
   }
 
   static void redir() {// ���͸� �����
      System.out.println("�����ϰ� ���� ���͸� ��θ� �Է�");
      System.out.println("ex) C:\\Kosta\\[������] ");
      String redirName = sc.nextLine();
      File f3 = new File(redirName);
 
      if (!f3.exists() && !f3.isDirectory()) {
         System.out.println("�������� �ʴ� �����̰ų� ������ �� ���� ���� �Դϴ�.");
      }else{
      f3.delete();
      System.out.println("���͸� ������ �Ϸ�Ǿ����ϴ�.");
      }
   }
 
   static void copy() { // ���� ����
      System.out.println("�����ϰ� ���� ���� �̸� �Է�");
      System.out.println("Ex) C:\\Kosta\\[���ϸ�] ");
      String copyname = sc.nextLine();
      File file = new File(copyname);
      System.out.println("�����  ���ϸ� �Է�");
      System.out.println("Ex) C:\\Kosta\\[���ϸ�] ");
      Scanner sc1 = new Scanner(System.in);
      String rename1 = sc1.nextLine();
      File cfile = new File(rename1);
      System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
 
      FileReader fr;
      FileWriter fw;
 
      if (!file.exists() || !file.isFile()) {
         System.out.println("�������� �ʴ� �����̰ų� ������ �� ���� ���� �Դϴ�.");
      }
 
      try {
         fr = new FileReader(file);
         fw = new FileWriter(cfile);
 
         int c;
         while ((c = fr.read()) != -1)
            fw.write((char) c);
         fr.close();
         fw.close();
 
      } catch (Exception e) {
         System.out.println("Error" + e);
      }
   }
 
   static void rename() { // ���� �̸� ����
      System.out.println("�����ϰ� ���� ���� �̸� �Է�");
      System.out.println("Ex) C:\\Kosta\\[���ϸ�]");
      String rename = sc.nextLine();
      File file = new File(rename);
 
      if (!file.exists() && !file.isFile()) {
         System.out.println("�������� �ʴ� �����̰ų� ������ �� ���� ���� �Դϴ�.");
      }
      else{
          System.out.println("������ ���ϴ� �����̸��� �Է��ϼ���. ");
          System.out.println("Ex) C:\\Kosta\\[���ϸ�] ");
          Scanner sc1 = new Scanner(System.in);
          String rename1 = sc1.nextLine();
          File cfile = new File(rename1);
          file.renameTo(cfile);
          System.out.println("���� �̸��� ����Ǿ����ϴ�.");
      }
   }
 
   static void PrintFileList(File dir) {
      System.out.println("[FULL PATH :" + dir.getAbsolutePath() + "]");
      ArrayList<Integer> subDir = new ArrayList<Integer>();
      File[] files = dir.listFiles(); // dir�� files�� �־��ش�.
 
      for (int i = 0; i < files.length; i++) {
         String filename = files[i].getName(); // ���ϸ� , ������
         if (files[i].isDirectory()) {
            filename = "<�����̸�>  : " + filename;
            subDir.add(i); // �����ΰ�츸 add
         } else {
            filename = "<�����̸�>  : " + filename + " / " + files[i].length() + "Byte";
 
         }
         System.out.println("  " + filename);
      }
 
   }
 
}
