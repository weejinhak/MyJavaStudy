 
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Dos {
 
 //�����ڿ�
 //static�� static���� ��ƶ� ��ü ���� ���Ҷ��~
    static int totalfiles = 0;  //�� ���� ����
    static int totaldirs = 0;   //�� ���� ����
    static Scanner sc = new Scanner(System.in); //Ű���� �Է� ��ü
 
    public static void main(String[] args) {
 
        if (args.length != 1) { // �迭 �ϳ��� ������ �־��
            System.out.println("���� : [java ���ϸ�] [���丮���]");
            System.out.println("����     : Ex12_File_List C:\\Temp");
            System.out.println("���� ȣ�� : [java ���ϸ�] [help]");
 
            System.exit(0); // ���μ��� ����
        }
 
        switch (args[0]) {
        case "help": //���� : �޴�����
            help();
            break;
        case "dir": //���� ����
            dir();
            break;
        case "erase": //������ ���� ����
            erase();
            break;
        case "mkdir": //���� ����
            mkdir();
            break;
        case "redir": //���� ����
            redir();
            break;
        case "rename": //���� �̸� ���� 
            rename();
            break;
        default:
            System.out.println("�ùٸ��� ���� ��ɾ� �Դϴ�.");
        }
 
    }
 
    private static void help() { //����
        System.out.println("dir   ���͸��� �ִ� ���ϰ� ���� ���͸� ����� �����ݴϴ�.");
        System.out.println("erase   ������ ������ �����մϴ�.");
        System.out.println("help   ��ɾ ���� ������ �����մϴ�.");
        System.out.println("mkdir   ���͸��� ����ϴ�.");
        System.out.println("redir   ���͸��� ����ϴ�.");
    }
 
    private static void dir() { //���� ����
        System.out.print("�����ϰ� ���� ���丮 ��θ� �Է��� �ּ��� >>");
        String dirName = sc.nextLine(); //�ٴ����� �Է¹޾Ƽ� ���ڿ� Ÿ�� ������ ����
        File f = new File(dirName); //���� ��ü �����Ͽ� ����
 
        if (!f.exists() || !f.isDirectory()) { // �������� �ʰų�, ���丮�� �ƴϸ�
            System.out.println("��ȿ���� �ʴ� ���� �Դϴ�. ^^");
            System.exit(0);
        }
 
        PrintFileList(f); //���� ����Ʈ ���
    }
 
    private static void mkdir() { //���� ����
        System.out.print("�����Ͻ� ���丮 ��θ� �Է��� �ּ���.");
        System.out.println("�Է¿���) c:\\Temp");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine(); //�ٴ����� �Է¹޾Ƽ� ���ڿ� Ÿ�� ������ ����
        File dir = new File(command); //���� ��ü �����Ͽ� ����
  
        if (dir.exists() && dir.isDirectory()) { // �����ϰų�, �����̸�
            System.out.println("�̹� �����ϴ� ���丮 �Դϴ�..");
            System.exit(0); //�ý��� ����
        }
 
        dir.mkdir();  //���� ������ �ƴϸ� ���� ����
        System.out.println("���丮 ���� �Ϸ�!");
    }
 
    static void erase() { //���� ����
        System.out.print("�����ϰ� ���� ������ ��ο� �̸��� �Է��ϼ���.");
        System.out.println("�Է¿���) c:\\Temp aaa.txt");
        Scanner sc = new Scanner(System.in);
        String[] name = null; //��θ� ������ ���ڿ� �迭 ����
        String command = sc.nextLine(); //���ڿ�Ÿ������ ����
        name = command.split(" "); //�迭�� command�� ������ ���д����� �ɰ��� ����
        File dir = new File(name[0]); //���� ��ü ���� => name[0]��°�� ���丮 ���� ����
 
        if (!dir.exists() || !dir.isDirectory()) {  // �������� �ʰų�, ���丮�� �ƴϸ� => ���� Ȯ��
            System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
            System.exit(0); //�ý��� ����
        }
 
        File[] files = dir.listFiles(); //���丮�� ���ϸ��(���丮 ����)�� File�迭�� ��ȯ

 
        int count = 0; 
 
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                if (files[i].getName().equals(name[1])) {
                    files[i].delete();
                    System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
                    break;
                }
            }
            count++;
        }
        if (count == files.length)
            System.out.println("��ġ�ϴ� ���ϸ��� �����ϴ�.");
    }
 
    static void redir() {
        System.out.print("�����Ͻ� ���丮 ��θ� �Է��� �ּ���.");
        System.out.println("�Է¿���) c:\\Temp");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        File dir = new File(command);
 
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("�������� �ʰų� �ùٸ��� ���� ���丮 �̸� �Դϴ�..");
            System.exit(0);
        }
 
        dir.delete(); //����
        System.out.println("���丮 ���� �Ϸ�!");
    }
 
    static void PrintFileList(File dir) { // ��ü ���� ����Ʈ ����ϱ�
        System.out.println("[FULL PATH " + dir.getAbsolutePath() + "]");
        // ���� ����
        ArrayList<Integer> subDir = new ArrayList<>();
        File[] files = dir.listFiles(); // C:\\Temp �ȿ� File, Directory ������ �� �迭��
                                        // ����ִ´�
 
        for (int i = 0; i < files.length; i++) {
            String filename = files[i].getName(); // ���ϸ�, ������(���丮)
            if (files[i].isDirectory()) {
                filename = "<DIR>[" + filename + "]";
                subDir.add(i); // ������ ��츸 add
                // [0][3][4][7][10]
            } else {
                filename = filename + " / " + files[i].length() + "Byte";
            }
            System.out.println("   " + filename);
        }
        int DirNum = subDir.size(); // ���丮 ����
        int FileNum = files.length - DirNum; // ���� ����
 
        // ������
        totaldirs += DirNum;
        totalfiles += FileNum;
        ///////
        System.out.println("[Current DirNum  ] : " + DirNum);
        System.out.println("[Current FileNum ] : " + FileNum);
        System.out.println("********************************");
 
        // [0][3][4][7][10]
        for (int j = 0; j < subDir.size(); j++) {
            int index = subDir.get(j);
            PrintFileList(files[index]); // 0��° �濡�ִ� �������, 3��° �濡�ִ� ���� ��� ...
                                            // (���ȣ��) ���� ����
        }
 
    }
 
    static void rename() {
 
        System.out.print("������ ������ ��θ� �Է��� �ּ��� >> ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        int count = 0;
 
        File file = new File(path);
 
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("�������� �ʴ� ���丮 �Դϴ�..");
            System.exit(0);
        }
 
        File[] files = file.listFiles();
        System.out.println("������ ����(Ȯ���� ����) �Է�");
        String a = sc.nextLine();
        System.out.println("������ ����(Ȯ���� ����) �Է�");
        String b = sc.nextLine();
        File f = new File(path + "\\" + b);
        for (int i = 0; i < files.length; i++) {
            String filename = files[i].getName();
            if (filename.equals(a)) {
                files[i].renameTo(f);
                System.out.println("�̸� �ٲٱ� �Ϸ�");
                System.out.println("������ �̸� " + f.getName());
                break;
            }
            count++;
        }
 
        if (count == files.length)
            System.out.println("ã�� ������ �����ϴ�.");
    }
 
}