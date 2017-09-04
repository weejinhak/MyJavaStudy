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
      System.out.println("dir 디렉터리에 있는 파일과 하위 디렉터리 목록을 보여줍니다.");
      System.out.println("redir 디렉터리를 지웁니다.");
      System.out.println("rename 파일의 이름을 바꿉니다.");
      System.out.println("mkdir 디렉터리를 만듭니다.");
   }
 
   static void dir() {
      System.out.println("확인하고 싶은 폴더의 경로를 입력");
      dir = sc.nextLine(); // 경로입력
      File f = new File(dir); // file instance생성
      if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아닌경우
         System.out.println("유효하지 않은 디렉토리입니다.");
         System.exit(0); // 종료
      }
      PrintFileList(f);
   }
 
   static void PrintFileList(File dir) {
      System.out.println("[Full PATH : " + dir.getAbsolutePath() + "]");
 
      // 하위 폴더대한 ArrayList
      ArrayList<Integer> subDir = new ArrayList<>();
      File[] files = dir.listFiles(); // 경로안에 있는 file , Directory 정보를 files배열에
                              // 저장
      for (int i = 0; i < files.length; i++) {
         String filename = files[i].getName(); // 파일의 이름을 filename에저장
         // 폴더일경우
         if (files[i].isDirectory()) {
            filename = "<DIR>       [" + filename + "]";
            subDir.add(i); // 폴더인 경우만 add
         }
         // 폴더가 아닌경우
         else {
            filename = filename + "    /   " + files[i].length() + "Byte";
         }
         System.out.println("  " + filename);
      }
 
      int DirNum = subDir.size(); // 디렉토리 개수
      int FileNum = files.length - DirNum; // 파일의 개수
 
      // 폴더와 파일의 개수 누적
      totaldir += DirNum;
      totalfiles += FileNum;
 
      System.out.println("[Current DirNum ] : " + DirNum);
      System.out.println("[Current FileNum] : " + FileNum);
      System.out.println("*******************************");
 
      // subDird에 저장되어있는 하위 폴더에 대해서도 반복
      for (int j = 0; j < subDir.size(); j++) {
         int index = subDir.get(j);
         PrintFileList(files[index]);
      }
   }
 
   // 삭제
   static void del() {
      System.out.println("경로를 입력해주세요");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아닌경우
         System.out.println("유효하지 않은 디렉토리입니다.");
         System.exit(0);
      }
      File[] files = f.listFiles(); // 경로안에 있는 file , Directory 정보를 files배열에
                              // 저장
      String filename = "";
      System.out.println("삭제하고 싶은 파일 또는 폴더명을 입력하세요.");
      String find = sc.next();
 
      for (int i = 0; i < files.length; i++) {
         filename = files[i].getName(); // 파일의 이름을 filename에저장
 
         if (filename.equals(find)) { // filename과 삭제하고 싶은 파일(폴더)와 같을 경우
            File defile = new File("C:\\temp\\" + find);
            defile.delete(); // 삭제
            System.out.println("삭제완료");
         }
      }
   }
 
   static void rename() {
      System.out.println("경로를 입력해주세요");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아닌경우
         System.out.println("유효하지 않은 디렉토리입니다.");
         System.exit(0);
      }
      System.out.println("파일명");
      String find = sc.next();
 
      System.out.println("새로운 파일명");
      String change = sc.next();
 
      String find1 = dir + "\\" + find;
      String change1 = dir + "\\" + change;
 
      File f1 = new File(find1);
      File f2 = new File(change1);
 
      f1.renameTo(f2);
   }
 
   static void mkdir() {
      System.out.println("경로를 입력해주세요");
      dir = sc.nextLine();
      File f = new File(dir);
      if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나 디렉토리 아닌경우
         System.out.println("유효하지 않은 디렉토리입니다.");
         System.exit(0);
      }
      System.out.println("생성하고 싶은 폴더명");
      String cre = sc.next();
      File f2 = new File(dir + "\\" + cre);
 
      if (!f2.exists()) {
         f2.mkdirs();
      } else {
         System.out.println("파일이 이미 존재합니다..");
      }
   }
 
}
