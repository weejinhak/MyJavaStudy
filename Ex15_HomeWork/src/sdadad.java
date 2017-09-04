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
         System.out.println("\t 원하는 명령어를 입력해주세요");
         System.out.println("\t*dir    : 디렉터리 보기");
         System.out.println("\t*mkdir  : 디렉터리 생성 ");
         System.out.println("\t*redir  : 디렉터리 삭제");
         System.out.println("\t*copy   : 파일 복사");
         System.out.println("\t*rename : 파일 이름 변경");
         System.out.println("\t*off    : 종료하기");
         System.out.println("=======================================");
 
         String str = sc.nextLine();
         
         switch (str) {
         case "dir": // 디렉터리 보기
            dir();
            break;
         case "mkdir": // 디렉터리 만들기
            mkdir();
            break;
         case "redir": // 디렉터리 지우기
            redir();
            break;
         case "copy": // 지정한 파일을 복사
            copy();
            break;
         case "rename": // 파일의 이름을 바꿈
            rename();
            break;
         case "off" : // 종료시킴
            System.out.println("종료됩니다.");
            System.exit(0);
         default:
            System.out.println("올바르지 않은 명령어 입니다.");
 
         }
      }
   }
 
   static void dir() { // 디렉터리 보기
      
      System.out.println("열람하고 싶은 디렉토리 경로를 입력하시오.");
      System.out.println("Ex) C:\\Kosta");
      String dirName = sc.nextLine();
      File f = new File(dirName);
 
      if (!f.exists() || !f.isDirectory()) {
         System.out.println("유효하지 않은 디렉터리입니다.");
         System.exit(0);
      }
      PrintFileList(f);
   }
 
   static void mkdir() { // 디렉터리 만들기
      System.out.println("생성할 디렉토리 경로와 새 디렉토리 이름 입력");
      System.out.println("Ex) C:\\Kosta\\[폴더명]");
      String mkdirName = sc.nextLine();
      File f2 = new File(mkdirName);
 
      if (f2.exists() && f2.isDirectory()) {
         System.out.println("존재하는 폴더입니다.");
      } else {
         f2.mkdir();
         System.out.println("디렉터리 생성이 완료되었습니다.");
      }
   }
 
   static void redir() {// 디렉터리 지우기
      System.out.println("삭제하고 싶은 디렉터리 경로를 입력");
      System.out.println("ex) C:\\Kosta\\[폴더명] ");
      String redirName = sc.nextLine();
      File f3 = new File(redirName);
 
      if (!f3.exists() && !f3.isDirectory()) {
         System.out.println("존재하지 않는 폴더이거나 삭제할 수 없는 폴더 입니다.");
      }else{
      f3.delete();
      System.out.println("디렉터리 삭제가 완료되었습니다.");
      }
   }
 
   static void copy() { // 파일 복사
      System.out.println("복사하고 싶은 파일 이름 입력");
      System.out.println("Ex) C:\\Kosta\\[파일명] ");
      String copyname = sc.nextLine();
      File file = new File(copyname);
      System.out.println("복사될  파일명 입력");
      System.out.println("Ex) C:\\Kosta\\[파일명] ");
      Scanner sc1 = new Scanner(System.in);
      String rename1 = sc1.nextLine();
      File cfile = new File(rename1);
      System.out.println("복사가 완료되었습니다.");
 
      FileReader fr;
      FileWriter fw;
 
      if (!file.exists() || !file.isFile()) {
         System.out.println("존재하지 않는 파일이거나 복사할 수 없는 파일 입니다.");
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
 
   static void rename() { // 파일 이름 변경
      System.out.println("변경하고 싶은 파일 이름 입력");
      System.out.println("Ex) C:\\Kosta\\[파일명]");
      String rename = sc.nextLine();
      File file = new File(rename);
 
      if (!file.exists() && !file.isFile()) {
         System.out.println("존재하지 않는 파일이거나 복사할 수 없는 파일 입니다.");
      }
      else{
          System.out.println("변경을 원하는 파일이름을 입력하세요. ");
          System.out.println("Ex) C:\\Kosta\\[파일명] ");
          Scanner sc1 = new Scanner(System.in);
          String rename1 = sc1.nextLine();
          File cfile = new File(rename1);
          file.renameTo(cfile);
          System.out.println("파일 이름이 변경되었습니다.");
      }
   }
 
   static void PrintFileList(File dir) {
      System.out.println("[FULL PATH :" + dir.getAbsolutePath() + "]");
      ArrayList<Integer> subDir = new ArrayList<Integer>();
      File[] files = dir.listFiles(); // dir을 files에 넣어준다.
 
      for (int i = 0; i < files.length; i++) {
         String filename = files[i].getName(); // 파일명 , 폴더명
         if (files[i].isDirectory()) {
            filename = "<폴더이름>  : " + filename;
            subDir.add(i); // 폴더인경우만 add
         } else {
            filename = "<파일이름>  : " + filename + " / " + files[i].length() + "Byte";
 
         }
         System.out.println("  " + filename);
      }
 
   }
 
}
