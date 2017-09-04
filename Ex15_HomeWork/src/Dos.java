 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Dos {
 
 //공유자원
 //static은 static끼리 놀아라 객체 생성 안할라고~
    static int totalfiles = 0;  //총 파일 갯수
    static int totaldirs = 0;   //총 폴더 갯수
    static Scanner sc = new Scanner(System.in); //키보드 입력 객체
 
    public static void main(String[] args) {
 
        if (args.length != 1) { // 배열 하나는 무조건 넣어라
            System.out.println("사용법 : [java 파일명] [디렉토리경로]");
            System.out.println("예시     : Ex12_File_List C:\\Temp");
            System.out.println("도움말 호출 : [java 파일명] [help]");
 
            System.exit(0); // 프로세스 종료
        }
 
        switch (args[0]) {
        case "help": //도움말 : 메뉴설명
            help();
            break;
        case "dir": //폴더 열기
            dir();
            break;
        case "erase": //지정한 파일 삭제
            erase();
            break;
        case "mkdir": //폴더 생성
            mkdir();
            break;
        case "redir": //폴더 삭제
            redir();
            break;
        case "rename": //폴더 이름 변경 
            rename();
            break;
        default:
            System.out.println("올바르지 않은 명령어 입니다.");
        }
 
    }
 
    private static void help() { //도움말
        System.out.println("dir   디렉터리에 있는 파일과 하위 디렉터리 목록을 보여줍니다.");
        System.out.println("erase   지정한 파일을 삭제합니다.");
        System.out.println("help   명령어에 관한 도움말을 제공합니다.");
        System.out.println("mkdir   디렉터리를 만듭니다.");
        System.out.println("redir   디렉터리를 지웁니다.");
    }
 
    private static void dir() { //폴더 열람
        System.out.print("열람하고 싶은 디렉토리 경로를 입력해 주세요 >>");
        String dirName = sc.nextLine(); //줄단위로 입력받아서 문자열 타입 변수에 저장
        File f = new File(dirName); //파일 객체 생성하여 저장
 
        if (!f.exists() || !f.isDirectory()) { // 존재하지 않거나, 디렉토리가 아니면
            System.out.println("유효하지 않는 폴더 입니다. ^^");
            System.exit(0);
        }
 
        PrintFileList(f); //파일 리스트 출력
    }
 
    private static void mkdir() { //폴더 생성
        System.out.print("생성하실 디렉토리 경로를 입력해 주세요.");
        System.out.println("입력예제) c:\\Temp");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine(); //줄단위로 입력받아서 문자열 타입 변수에 저장
        File dir = new File(command); //파일 객체 생성하여 저장
  
        if (dir.exists() && dir.isDirectory()) { // 존재하거나, 폴더이면
            System.out.println("이미 존재하는 디렉토리 입니다..");
            System.exit(0); //시스템 종료
        }
 
        dir.mkdir();  //위의 조건이 아니면 폴더 생성
        System.out.println("디렉토리 생성 완료!");
    }
 
    static void erase() { //파일 삭제
        System.out.print("삭제하고 싶은 파일의 경로와 이름을 입력하세요.");
        System.out.println("입력예제) c:\\Temp aaa.txt");
        Scanner sc = new Scanner(System.in);
        String[] name = null; //경로를 저장할 문자열 배열 선언
        String command = sc.nextLine(); //문자열타입으로 저장
        name = command.split(" "); //배열에 command를 공백을 구분단위로 쪼개서 저장
        File dir = new File(name[0]); //파일 객체 생성 => name[0]번째에 디렉토리 정보 저장
 
        if (!dir.exists() || !dir.isDirectory()) {  // 존재하지 않거나, 디렉토리가 아니면 => 폴더 확인
            System.out.println("유효하지 않은 디렉토리 입니다.");
            System.exit(0); //시스템 종료
        }
 
        File[] files = dir.listFiles(); //디렉토리의 파일목록(디렉토리 포함)을 File배열로 반환

 
        int count = 0; 
 
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                if (files[i].getName().equals(name[1])) {
                    files[i].delete();
                    System.out.println("파일 삭제가 완료되었습니다.");
                    break;
                }
            }
            count++;
        }
        if (count == files.length)
            System.out.println("일치하는 파일명이 없습니다.");
    }
 
    static void redir() {
        System.out.print("삭제하실 디렉토리 경로를 입력해 주세요.");
        System.out.println("입력예제) c:\\Temp");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        File dir = new File(command);
 
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("존재하지 않거나 올바르지 않은 디렉토리 이름 입니다..");
            System.exit(0);
        }
 
        dir.delete(); //삭제
        System.out.println("디렉토리 삭제 완료!");
    }
 
    static void PrintFileList(File dir) { // 전체 파일 리스트 출력하기
        System.out.println("[FULL PATH " + dir.getAbsolutePath() + "]");
        // 하위 폴더
        ArrayList<Integer> subDir = new ArrayList<>();
        File[] files = dir.listFiles(); // C:\\Temp 안에 File, Directory 정보를 다 배열에
                                        // 집어넣는다
 
        for (int i = 0; i < files.length; i++) {
            String filename = files[i].getName(); // 파일명, 폴더명(디렉토리)
            if (files[i].isDirectory()) {
                filename = "<DIR>[" + filename + "]";
                subDir.add(i); // 폴더인 경우만 add
                // [0][3][4][7][10]
            } else {
                filename = filename + " / " + files[i].length() + "Byte";
            }
            System.out.println("   " + filename);
        }
        int DirNum = subDir.size(); // 디렉토리 개수
        int FileNum = files.length - DirNum; // 파일 개수
 
        // 누적값
        totaldirs += DirNum;
        totalfiles += FileNum;
        ///////
        System.out.println("[Current DirNum  ] : " + DirNum);
        System.out.println("[Current FileNum ] : " + FileNum);
        System.out.println("********************************");
 
        // [0][3][4][7][10]
        for (int j = 0; j < subDir.size(); j++) {
            int index = subDir.get(j);
            PrintFileList(files[index]); // 0번째 방에있는 폴더경로, 3번째 방에있는 폴더 경로 ...
                                            // (재귀호출) 하위 폴더
        }
 
    }
 
    static void rename() {
 
        System.out.print("수정할 파일의 경로를 입력해 주세요 >> ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        int count = 0;
 
        File file = new File(path);
 
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("존재하지 않는 디렉토리 입니다..");
            System.exit(0);
        }
 
        File[] files = file.listFiles();
        System.out.println("수정할 파일(확장자 포함) 입력");
        String a = sc.nextLine();
        System.out.println("수정할 파일(확장자 포함) 입력");
        String b = sc.nextLine();
        File f = new File(path + "\\" + b);
        for (int i = 0; i < files.length; i++) {
            String filename = files[i].getName();
            if (filename.equals(a)) {
                files[i].renameTo(f);
                System.out.println("이름 바꾸기 완료");
                System.out.println("수정된 이름 " + f.getName());
                break;
            }
            count++;
        }
 
        if (count == files.length)
            System.out.println("찾는 파일이 없습니다.");
    }
 
}