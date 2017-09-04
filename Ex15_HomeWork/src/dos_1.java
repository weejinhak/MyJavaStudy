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
            //�Է�
            
            System.out.println("��θ� �Է� ����) C:\\\\Temp");
            System.out.print("C:\\>");
                  path=sc.nextLine();
     
     
     
            File dir = new File(path);    //C:\\temp
            
            if(!dir.exists() || !dir.isDirectory()){
                System.out.println("��ȿ���� ���� ���丮 �Դϴ�");
                System.exit(0);
            }
            
            //�޴� �Է� ó��
            System.out.println("������ ��ɾ �Է��ϼ���");
            System.out.println("����: copy, ����: delete, �̸�����: rename, ����ã��: search");
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
            default: System.out.println("�޴��� �� �� �Է��ϼ̽��ϴ�.");
                break;
            }
     
          
     
        }//end of main
     
        static void copy(File dir){
            FileInputStream fs = null;
            FileOutputStream fos = null;
     
            try {
                    System.out.println("���ϸ��� �Է��ϼ���(Ȯ���ڸ� ����)");
                    System.out.println("����) ����.txt");
     
                    //����ó��  (Ȯ���ڸ� Ʋ���� ���)
     
                    filename = sc.nextLine();
     
                    fs = new FileInputStream(dir +"\\" + filename);    //���� ����
                    fos = new FileOutputStream(dir +"\\"+"copy "+ filename);
     
                    int data = 0;
                    while ((data = fs.read()) != -1) {
                        fos.write(data);
                    }
                    System.out.println("���� �Ǿ����ϴ�.");
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
            System.out.println("���ϸ��� �Է��ϼ���(Ȯ���ڸ� ����)");
            System.out.println("����) ����.txt");
            filename = sc.nextLine();
            
            dir = new File(dir+"\\"+filename);
            if (dir.delete()) {
                System.out.println("������ �������ϴ� " + "[" + dir + "]");
            } else {
                System.out.println("���� ������ �����ϴ� " + "[" + dir + "]");
            }
        }//end of delete
     
        static void rename(File dir){
            boolean check = false;
     
     
            System.out.println("[" +dir+" ��ο� �ִ� ���� ��� ]");
     
     
            File[ ] files = dir.listFiles();
            for(int i=0; i< files.length; i++){
                String filesName =files[i].getName();
                System.out.println("["+i+"] "+filesName);
            }
            //������ ������ ����
            sc  = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("�����ϰ� ���� ���� ��ȣ �Է�");
            int selectNum=Integer.parseInt(sc.nextLine());
     
     
            //������ �̸��� �Է�
            System.out.println("���� ������ �̸�: ");
            System.err.println("����: Ȯ���ڸ��� �ִ� ����, Ȯ���ڸ���� ���� ������. ��) ���ο��̸�.jpg");
            String newName =sc.nextLine();
     
     
            //���� �� ������� üũ
            check = files[selectNum].renameTo(new File(dir+"\\"+newName));
            if (check){
                System.out.println("���漺��");
            }else{
                System.out.println("�������");
            }
        }//end of rename method
        
        
        
        static void search(File dir){
        
        FileReader fileread = null;
        BufferedReader buff = null;
        String data = "";
        
        System.out.println("�˻� �ܾ� �Է�: ");
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
                
                    System.out.println("�˻���� :" +files[i].getName());                    
                }
            }
            
        } catch (Exception e) {
                System.out.println("ã�� �ܾ ����" + e.getMessage());
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