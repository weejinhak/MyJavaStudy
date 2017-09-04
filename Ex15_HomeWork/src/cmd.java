import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class cmd {
   static int totalfiles = 0;
   static int totaldir = 0;
   static Scanner sc = new Scanner(System.in);
   static String dir = "";
 
   public static void main(String[] args) {
      System.out.println("<dir> , <remove> , <rename> , <mkdir> , <help>");
      String menu = sc.nextLine();
 
      switch (menu) {
      case "dir":
         dir();
         break;
      case "remove":
         del();
         break;
      case "rename":
         rename();
         break;
      case "help":
         help();
         break;
      case "mkdir":
         mkdir();
         break;
      default:
         break;
      }
   }
 
   static void help() {
      System.out.println("dir ���͸��� �ִ� ���ϰ� ���� ���͸� ����� �����ݴϴ�.");
      System.out.println("redir ���͸��� ����ϴ�.");
      System.out.println("rename ������ �̸��� �ٲߴϴ�.");
      System.out.println("mkdir ���͸��� ����ϴ�.");
   }
 
   static void dir() {
      System.out.println("Ȯ���ϰ� ���� ������ ��θ� �Է�");
      dir = sc.nextLine(); // ����Է�
      File f = new File(dir); // file instance����
      if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴѰ��
         System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
         System.exit(0); // ����
      }
      PrintFileList(f);
   }
 
   static void PrintFileList(File dir) {
      System.out.println("[Full PATH : " + dir.getAbsolutePath() + "]");
 
      // ���� �������� ArrayList
      ArrayList<Integer> subDir = new ArrayList<>();
      File[] files = dir.listFiles(); // ��ξȿ� �ִ� file , Directory ������ files�迭��
                              // ����
      for (int i = 0; i < files.length; i++) {
         String filename = files[i].getName(); // ������ �̸��� filename������
         // �����ϰ��
         if (files[i].isDirectory()) {
            filename = "<DIR>       [" + filename + "]";
            subDir.add(i); // ������ ��츸 add
         }
         // ������ �ƴѰ��
         else {
            filename = filename + "    /   " + files[i].length() + "Byte";
         }
         System.out.println("  " + filename);
      }
 
      int DirNum = subDir.size(); // ���丮 ����
      int FileNum = files.length - DirNum; // ������ ����
 
      // ������ ������ ���� ����
      totaldir += DirNum;
      totalfiles += FileNum;
 
      System.out.println("[Current DirNum ] : " + DirNum);
      System.out.println("[Current FileNum] : " + FileNum);
      System.out.println("*******************************");
 
      // subDird�� ����Ǿ��ִ� ���� ������ ���ؼ��� �ݺ�
      for (int j = 0; j < subDir.size(); j++) {
         int index = subDir.get(j);
         PrintFileList(files[index]);
      }
   }
 
   // ����
   static void del() {
      System.out.println("��θ� �Է����ּ���");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴѰ��
         System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
         System.exit(0);
      }
      File[] files = f.listFiles(); // ��ξȿ� �ִ� file , Directory ������ files�迭��
                              // ����
      String filename = "";
      System.out.println("�����ϰ� ���� ���� �Ǵ� �������� �Է��ϼ���.");
      String find = sc.next();
 
      for (int i = 0; i < files.length; i++) {
         filename = files[i].getName(); // ������ �̸��� filename������
 
         if (filename.equals(find)) { // filename�� �����ϰ� ���� ����(����)�� ���� ���
            File defile = new File("C:\\temp\\" + find);
            defile.delete(); // ����
            System.out.println("�����Ϸ�");
         }
      }
   }
 
   static void rename() {
      System.out.println("��θ� �Է����ּ���");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴѰ��
         System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
         System.exit(0);
      }
      System.out.println("���ϸ�");
      String find = sc.next();
 
      System.out.println("���ο� ���ϸ�");
      String change = sc.next();
 
      String find1 = dir + "\\" + find;
      String change1 = dir + "\\" + change;
 
      File f1 = new File(find1);
      File f2 = new File(change1);
 
      f1.renameTo(f2);
   }
 
   static void mkdir() {
      System.out.println("��θ� �Է����ּ���");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴѰ��
         System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
         System.exit(0);
      }
      System.out.println("�����ϰ� ���� ������");
      String cre = sc.next();
      File f2 = new File(dir + "\\" + cre);
 
      if (!f2.exists()) {
         f2.mkdirs();
      } else {
         System.out.println("������ �̹� �����մϴ�..");
      }
   }
 
}
