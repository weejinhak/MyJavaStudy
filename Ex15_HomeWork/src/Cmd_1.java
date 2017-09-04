
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
import javax.swing.plaf.synth.SynthSeparatorUI;
 
//1. �־��� ��η� ���� ����, ���� ����, ���� ���� ���� : CreatNewFF
//2. ���޵� ������ ���� ������ ���� ���� �־��� �̸����� ����! : CopyRenameFF
//3. ���� 2���� ����(�������)�ϸ�, 2���� ���Ͽ� �̸��� �ߺ��Ǵ� ���ϸ, ���� ����� ���
//   ũ�� �ߺ� ���� �, ���� ����� ��� : OverlapFF
 
public class Cmd_1 {
   public Scanner sc = new Scanner(System.in);
 
   public String getScanner(){
      return sc.nextLine();
   }
   public void CreatNewFF() {
      while (true) {
 
         System.out.println("\n1.���� ����  2.���� ����  3.���� ����  4.�ߺ� �̸� ����/���� ���� ���  5.���� ");
         System.out.println("�������� ������ ��� �˴ϴ�...");
         int index=0;
 
         try { // �� ���� �Է������� 
            index = Integer.parseInt(sc.nextLine());
         } catch (NumberFormatException e) {
         } //finally�� �ٽ� �Լ�(CreatNewFF()) ����� ������ �ʾƵ� ���� switch���� �����ϰ� �ٽ� �ǵ��ư��Ƿ� ok
         
         switch (index) {
         case 1:
            System.out.println("<���� ����>");
            CreatFolder();
            break;
         case 2:
            System.out.println("<���� ����>");
            CreatNewFile();
 
            break;
         case 3:
            System.out.println("������ txt���� ����(Ȥ�� ���� ���) :");
            String path = getScanner();
            System.out.println("���纻�� �̸� ���� :");
            String newname = getScanner();
            CopyRenameFF(path, newname);
            break;
            
         case 4 :
            System.out.println("�ߺ� ���� ù��°\n������(���� ���) :");
            String path1 = getScanner();
            System.out.println("�ߺ� ���� �ι�°\n������(���� ���) :");
            String path2 = getScanner();
            OverlapFF(path1, path2);
            break;
         case 5 :
            System.out.println("�����մϴ�.");
            System.exit(0);
            break;
 
         default:
            System.out.println("�߸��� ���� �Է� �ϼ̽��ϴ�. �ٽ� �Է� �ϼ���.");
            break;
         }
      }
 
   }
 
   public void CreatFolder() {
      String filepath;
      String name;
      System.out.println("�����ϰ� ���� ������ ��θ� �Է� �ϼ���: ");
      filepath = sc.nextLine();
      File file = new File(filepath);
      if (!file.exists()) {
         System.out.println("�׷� ��δ� �����..");
         return;
      }
      System.out.println("����� ���� ������ �̸��� �Է��� �ּ���: ");
      name = sc.nextLine();
      file = new File(filepath + "\\" + name);
 
      if (!file.exists()) {
         file.mkdirs();
         System.out.println("\"" + name + "\"" + " ���� ����");
         return;
      } else {
         System.out.println("�����Ұ�");
      }
   }
 
   public void CreatNewFile() {
      FileWriter fo = null;
 
      try {
         String filepath, input, content;
         System.out.println("�����ϰ� ���� ������ ��θ� �Է� �ϼ���: ");
         filepath = sc.nextLine();
         File file = new File(filepath);
         if (!file.exists()) {
            System.out.println("�׷� ��δ� �����..");
            return;
         }
         System.out.println("������ ���� �̸� �Է�(�ؽ�Ʈ ������): ");
         input = sc.nextLine();
         input = input + ".txt";
         filepath = filepath + "\\" + input;
         System.out.println(input + "�� ������ ����: ");
         content = sc.nextLine();
         fo = new FileWriter(filepath);
         fo.write(content);
         System.out.println(filepath + " ������!!!!");
 
      } catch (Exception e) {
 
         e.printStackTrace();
      } finally {
         try {
 
            fo.close();
         } catch (IOException e) {
 
            e.printStackTrace();
         }
 
      }
   }
   
   public void CopyRenameFF(String path, String newname) {
      /*
       * 2. ����ڴ� ����(���)��, ���ο� �̸�(����� ���� �̸�)�� ���� txt�������� Ȯ�� �� ������ ���� ���� ���� ����
       * ���� path�� �θ� path�� String������ ��ȯ�� �� String ���� ���Ӱ� ������ ������ �̸��� ������
       * fileOutputStream() �����ڿ� ������ �̸��� ������ String ���� �̾��� �ƿ�ǲ�� ���� ���� ���� ����
       * �̸����� ����
       */
 
      // path�� .���� ���� ! ������ . index �ڿ������Ͱ� Ȯ����!
      String Filetype = path.substring(path.lastIndexOf(".") + 1, path.length());
      if (Filetype.equals("txt")) {// txt�������� Ȯ�� �� ������ ���� ����
         System.out.println("���� ���� ���" + path + " \n������ �̸�" + newname);
         // ���� ���� String ���� �θ� �ּҸ� �̾� �ֱ� ����(File.getParent()�Լ� ���) ���� ��ü�� ����
         File newFile = new File(path);
         // ���� ���� ���� path�� �θ� path�� String������ ��ȯ��
         String Paddress = newFile.getParent();
         // �θ� path�� ���Ӱ� ������ ������ �̸��� ������
         String Naddress = Paddress + "\\" + newname;
 
         FileInputStream fin = null;
         FileOutputStream fout = null;
 
         try {
            fin = new FileInputStream(path);
            fout = new FileOutputStream(Naddress + ".txt");// Naddress�� Ȯ����
                                                // txt�� ���� ���ϸ�
                                                // ����
            int data = 0;
            while ((data = fin.read()) != -1) {
               fout.write(data);
            }
 
         } catch (IOException e) {
            e.printStackTrace();
 
         }
      } else {
         System.out.println("�߸��� ������ txt���� ����(Ȥ�� ���� ���)�� �Է��߽��ϴ�");
         // �ٽ� input �ޱ�
      }
 
   }
   
   public void OverlapFF(String path1, String path2) {
      /*
       * 3. ���� 2���� ����(�������)�ϸ�(path1 , path2), ���޵� path�� ���͸����� Ȯ�� ���͸��� ������
       * path1�� listfiles() ��ȯ �迭�� ó������ ������ for������ ���� path2�� listfiles() �迭��
       * ���� file�� �� 2���� ���Ͽ� �̸��� �ߺ��Ǵ� ���ϸ���� ���       * 
       */
 
      int overlapNameCount = 0;
      File f1 = new File(path1);
      File f2 = new File(path2);
 
      if (!f1.isDirectory() || !f2.isDirectory()) {
         System.out.println("���� ���� �ּ�2���� ������ �ƴմϴ�");
 
      } else {
         System.out.printf("���� ���� ù��° ���� �ּ� : %s \n���� ���� �ι�° ���� �ּ� : %s\n\n", path1, path2);
         File[] f1array = f1.listFiles();
         File[] f2array = f2.listFiles();
 
         for (int i = 0; i < f1array.length; i++) {
            for (int j = 0; j < f2array.length; j++) {
               // �� ������ �ּҰ��� ���� �޾�
               // Ȯ���� �������� �̸� ���� ��
               String f1address = f1array[i].getPath();
               String f2address = f2array[j].getPath();
               
               String f1Filename = f1address.substring(f1address.lastIndexOf("\\") + 1, f1address.length());
               String f2Filename = f2address.substring(f2address.lastIndexOf("\\") + 1, f2address.length());
 
               if (f1Filename.equals(f2Filename)) {
                  System.out.println("��ġ�� ����/���� �̸� : " + f1Filename);
                  overlapNameCount++;
               }
 
            }
         }
 
         System.out.printf("�� ������ ��ġ�� �̸��� ���� / ������ �� %d�� �����մϴ�.\n", overlapNameCount);
      }
 
   }
 
 
}
