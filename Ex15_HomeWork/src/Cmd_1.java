
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
import javax.swing.plaf.synth.SynthSeparatorUI;
 
//1. 주어진 경로로 폴더 생성, 파일 생성, 파일 내용 지정 : CreatNewFF
//2. 전달된 파일을 복제 복제된 파일 명을 주어진 이름으로 변경! : CopyRenameFF
//3. 폴더 2개를 전달(경로전달)하면, 2개를 비교하여 이름이 중복되는 파일몇개, 폴더 몇개인지 출력
//   크기 중복 파일 몇개, 폴더 몇개인지 출력 : OverlapFF
 
public class Cmd_1 {
   public Scanner sc = new Scanner(System.in);
 
   public String getScanner(){
      return sc.nextLine();
   }
   public void CreatNewFF() {
      while (true) {
 
         System.out.println("\n1.폴더 생성  2.파일 생성  3.파일 복제  4.중복 이름 파일/폴더 갯수 계산  5.종료 ");
         System.out.println("종료하지 않으면 계속 됩니다...");
         int index=0;
 
         try { // 빈 값을 입력했을때 
            index = Integer.parseInt(sc.nextLine());
         } catch (NumberFormatException e) {
         } //finally로 다시 함수(CreatNewFF()) 재시작 해주지 않아도 밑의 switch구문 실행하고 다시 되돌아가므로 ok
         
         switch (index) {
         case 1:
            System.out.println("<폴더 생성>");
            CreatFolder();
            break;
         case 2:
            System.out.println("<파일 생성>");
            CreatNewFile();
 
            break;
         case 3:
            System.out.println("복사할 txt형식 파일(혹은 파일 경로) :");
            String path = getScanner();
            System.out.println("복사본의 이름 지정 :");
            String newname = getScanner();
            CopyRenameFF(path, newname);
            break;
            
         case 4 :
            System.out.println("중복 비교할 첫번째\n폴더명(폴더 경로) :");
            String path1 = getScanner();
            System.out.println("중복 비교할 두번째\n폴더명(폴더 경로) :");
            String path2 = getScanner();
            OverlapFF(path1, path2);
            break;
         case 5 :
            System.out.println("종료합니다.");
            System.exit(0);
            break;
 
         default:
            System.out.println("잘못된 값을 입력 하셨습니다. 다시 입력 하세요.");
            break;
         }
      }
 
   }
 
   public void CreatFolder() {
      String filepath;
      String name;
      System.out.println("저장하고 싶은 폴더의 경로를 입력 하세요: ");
      filepath = sc.nextLine();
      File file = new File(filepath);
      if (!file.exists()) {
         System.out.println("그런 경로는 없어요..");
         return;
      }
      System.out.println("만들고 싶은 폴더의 이름을 입력해 주세요: ");
      name = sc.nextLine();
      file = new File(filepath + "\\" + name);
 
      if (!file.exists()) {
         file.mkdirs();
         System.out.println("\"" + name + "\"" + " 폴더 생성");
         return;
      } else {
         System.out.println("생성불가");
      }
   }
 
   public void CreatNewFile() {
      FileWriter fo = null;
 
      try {
         String filepath, input, content;
         System.out.println("저장하고 싶은 파일의 경로를 입력 하세요: ");
         filepath = sc.nextLine();
         File file = new File(filepath);
         if (!file.exists()) {
            System.out.println("그런 경로는 없어요..");
            return;
         }
         System.out.println("생성할 파일 이름 입력(텍스트 파일임): ");
         input = sc.nextLine();
         input = input + ".txt";
         filepath = filepath + "\\" + input;
         System.out.println(input + "에 저장할 내용: ");
         content = sc.nextLine();
         fo = new FileWriter(filepath);
         fo.write(content);
         System.out.println(filepath + " 생성됨!!!!");
 
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
       * 2. 사용자는 파일(경로)와, 새로운 이름(복사될 파일 이름)을 전달 txt파일인지 확인 후 맞으면 복제 진행 전달 받은
       * 파일 path의 부모 path를 String값으로 반환후 그 String 값에 새롭게 생성할 파일의 이름을 더해줌
       * fileOutputStream() 생성자에 파일의 이름을 더해준 String 전달 뽑아준 아웃풋에 파일 명을 전달 받은
       * 이름으로 설정
       */
 
      // path를 .으로 분해 ! 마지막 . index 뒤에서부터가 확장자!
      String Filetype = path.substring(path.lastIndexOf(".") + 1, path.length());
      if (Filetype.equals("txt")) {// txt파일인지 확인 후 맞으면 복제 진행
         System.out.println("전달 받은 경로" + path + " \n복사할 이름" + newname);
         // 전달 받은 String 값의 부모 주소를 뽑아 주기 위해(File.getParent()함수 사용) 파일 객체로 생성
         File newFile = new File(path);
         // 전달 받은 파일 path의 부모 path를 String값으로 반환후
         String Paddress = newFile.getParent();
         // 부모 path에 새롭게 생성할 파일의 이름을 더해줌
         String Naddress = Paddress + "\\" + newname;
 
         FileInputStream fin = null;
         FileOutputStream fout = null;
 
         try {
            fin = new FileInputStream(path);
            fout = new FileOutputStream(Naddress + ".txt");// Naddress에 확장자
                                                // txt를 더해 파일명
                                                // 전달
            int data = 0;
            while ((data = fin.read()) != -1) {
               fout.write(data);
            }
 
         } catch (IOException e) {
            e.printStackTrace();
 
         }
      } else {
         System.out.println("잘못된 복사할 txt형식 파일(혹은 파일 경로)을 입력했습니다");
         // 다시 input 받기
      }
 
   }
   
   public void OverlapFF(String path1, String path2) {
      /*
       * 3. 폴더 2개를 전달(경로전달)하면(path1 , path2), 전달된 path가 디렉터리인지 확인 디렉터리가 맞으면
       * path1의 listfiles() 반환 배열이 처음부터 끝까지 for문으로 돌때 path2의 listfiles() 배열의
       * 각각 file과 비교 2개를 비교하여 이름이 중복되는 파일몇개인지 출력       * 
       */
 
      int overlapNameCount = 0;
      File f1 = new File(path1);
      File f2 = new File(path2);
 
      if (!f1.isDirectory() || !f2.isDirectory()) {
         System.out.println("전달 받은 주소2개가 폴더가 아닙니다");
 
      } else {
         System.out.printf("전달 받은 첫번째 폴더 주소 : %s \n전달 받은 두번째 폴더 주소 : %s\n\n", path1, path2);
         File[] f1array = f1.listFiles();
         File[] f2array = f2.listFiles();
 
         for (int i = 0; i < f1array.length; i++) {
            for (int j = 0; j < f2array.length; j++) {
               // 각 파일의 주소값을 전달 받아
               // 확장자 전까지의 이름 끼리 비교
               String f1address = f1array[i].getPath();
               String f2address = f2array[j].getPath();
               
               String f1Filename = f1address.substring(f1address.lastIndexOf("\\") + 1, f1address.length());
               String f2Filename = f2address.substring(f2address.lastIndexOf("\\") + 1, f2address.length());
 
               if (f1Filename.equals(f2Filename)) {
                  System.out.println("겹치는 파일/폴더 이름 : " + f1Filename);
                  overlapNameCount++;
               }
 
            }
         }
 
         System.out.printf("두 폴더에 겹치는 이름의 파일 / 폴더가 총 %d개 존재합니다.\n", overlapNameCount);
      }
 
   }
 
 
}
