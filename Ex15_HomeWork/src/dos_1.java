 import java.io.BufferedReader;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.Scanner;
     
     
     
    public class dos_1 {
     
        static Scanner    sc = new Scanner(System.in);
        static String filename = "";
        static String path;
     
     
        public static void main(String[] args) {
            //입력
            
            System.out.println("경로명 입력 예시) C:\\\\Temp");
            System.out.print("C:\\>");
                  path=sc.nextLine();
     
     
     
            File dir = new File(path);    //C:\\temp
            
            if(!dir.exists() || !dir.isDirectory()){
                System.out.println("유효하지 않은 디렉토리 입니다");
                System.exit(0);
            }
            
            //메뉴 입력 처리
            System.out.println("수행할 명령어를 입력하세요");
            System.out.println("복사: copy, 삭제: delete, 이름변경: rename, 파일찾기: search");
            String menu = sc.nextLine();
            
            switch(menu){
            case "copy" :copy(dir);
                break;
            case "delete" : delete(dir) ;
                break;
            case "rename" : rename(dir);
                break;
            case "search" : search(dir);
                break;
            default: System.out.println("메뉴를 잘 못 입력하셨습니다.");
                break;
            }
     
          
     
        }//end of main
     
        static void copy(File dir){
            FileInputStream fs = null;
            FileOutputStream fos = null;
     
            try {
                    System.out.println("파일명을 입력하세요(확장자명 포함)");
                    System.out.println("예시) 파일.txt");
     
                    //예외처리  (확장자명 틀렸을 경우)
     
                    filename = sc.nextLine();
     
                    fs = new FileInputStream(dir +"\\" + filename);    //읽을 파일
                    fos = new FileOutputStream(dir +"\\"+"copy "+ filename);
     
                    int data = 0;
                    while ((data = fs.read()) != -1) {
                        fos.write(data);
                    }
                    System.out.println("복사 되었습니다.");
                    fs.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    try {
                        fs.close();
                        fos.close();
                    } catch (Exception e) {
                    }
     
                }
     
        }//end of copy
     
        static void delete(File dir){
            System.out.println("파일명을 입력하세요(확장자명 포함)");
            System.out.println("예시) 파일.txt");
            filename = sc.nextLine();
            
            dir = new File(dir+"\\"+filename);
            if (dir.delete()) {
                System.out.println("파일을 지웠습니다 " + "[" + dir + "]");
            } else {
                System.out.println("지울 파일이 없습니다 " + "[" + dir + "]");
            }
        }//end of delete
     
        static void rename(File dir){
            boolean check = false;
     
     
            System.out.println("[" +dir+" 경로에 있는 파일 목록 ]");
     
     
            File[ ] files = dir.listFiles();
            for(int i=0; i< files.length; i++){
                String filesName =files[i].getName();
                System.out.println("["+i+"] "+filesName);
            }
            //변경할 파일을 선택
            sc  = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("변경하고 싶은 파일 번호 입력");
            int selectNum=Integer.parseInt(sc.nextLine());
     
     
            //변경할 이름을 입력
            System.out.println("새로 변경할 이름: ");
            System.err.println("주의: 확장자명이 있는 경우는, 확장자명까지 같이 쓰세요. 예) 새로운이름.jpg");
            String newName =sc.nextLine();
     
     
            //변경 및 변경사항 체크
            check = files[selectNum].renameTo(new File(dir+"\\"+newName));
            if (check){
                System.out.println("변경성공");
            }else{
                System.out.println("변경실패");
            }
        }//end of rename method
        
        
        
        static void search(File dir){
        
        FileReader fileread = null;
        BufferedReader buff = null;
        String data = "";
        
        System.out.println("검색 단어 입력: ");
        String word = sc.nextLine();
       
        
        File[] files = dir.listFiles();
     
        try {
            for (int i = 0; i < files.length; i++) {
                if(!files[i].isFile()){
                    continue;
                }
                
           
                if(files[i].getName().contains(word)){
                    
                String fileName = files[i].getName();
                fileread = new FileReader(dir + "\\" +fileName);
                buff = new BufferedReader(fileread);
                
                    System.out.println("검색결과 :" +files[i].getName());                    
                }
            }
            
        } catch (Exception e) {
                System.out.println("찾는 단어가 없음" + e.getMessage());
        }finally{
             try {
                buff.close();
                fileread.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }             
        }    
        
       }//end of search          
    }//end of class