package Project;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
 
public class Manager {
 
    static Scanner scan;
    static HashMap<Integer, M> map = new HashMap<>(); // ���� ������ Ű���� M������ �������
                                                        // ��ü�� ������ -> MŬ������ ��ü��
    static HashMap<Integer, master> mapp = new HashMap<>();// -> master Ŭ������ �����
    static int count = 1;
    
 
    public Manager() {
 
        scan = new Scanner(System.in);
 
        while (true) { // ���� �����ؼ� ��� �Է� ���� �� �ְ� ��
            System.out.println("�Ŵ����� ȯ���մϴ�");
 
            System.out.print("<1>������ ��� <2>�˹ٻ� ��� <3>�˹ٻ� ���� <4>�˹ٻ� �ñް��� <5>���� : ");
 
            switch (scan.nextInt()) {
            case 1:
                manager_add(); // + �߰��� �Ѵ����� �ٷ� �����ϴ� ����� ������ ������ -> �ڵ����� ���!
                break;
            case 2:
                part_add();
                break;
            case 3:
                part_delete();
                break;
            case 4:
                salary_print();
                break;
            case 5:
                exit();
                break;
 
            }// switch
        } // while
    }
 
/*    private void read(){
        //static HashMap<Integer, M> map = new HashMap<>(); // ���� ������ Ű���� M������ �������
        // ��ü�� ������ -> MŬ������ ��ü��
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "euc-kr"));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }*/
    
    private void save() { // salary �ؽ�Ʈ ���Ϸ� �����ϱ�
        File file = new File("C:\\Temp\\salary.txt"); // default��ο� ����
        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            ObjectOutputStream oos = new ObjectOutputStream(bos);
                                        /*BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), "euc-kr"));
            ((ObjectOutput) osw).writeObject(mapp); // �ؽ������� Ű�� ����� ��ü�� ����ϱ�
*/
            oos.writeObject(mapp);
            
            fos.close();
            //writer.close();
            
 
        } catch (Exception e) {
            System.out.println("�����߻�!!!"); // ������ ���ٸ� �����߻���Ű��
            e.printStackTrace();
        }
        System.out.println("����Ǿ����ϴ�.");
    }
 
    
    /*public Object undoSerializable() throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis); // -> ����ȭ�� ���� ��ü��
                                                            // ����ϱ�
        BufferedInputStream bis = new BufferedInputStream(ois);
        
        return mapp;
    }*/
 
    private void salary_print() {
        // [ ��ü�� / �˹ٻ��̸� / �ñ� / ���� �� �� �� / �Ϸ� ���� �ð� / �� �ݾ� ]
        /*
         * private String company = ""; //��ü�� private String ename = ""; //�˹ٻ�
         * �̸� private final int HOURSMONEY = 6500; //�ñ� private int day = 0;
         * //���� �� �ϼ� private double shour = 0; //�Ϸ� ���� ������ �ð� private double
         * ehour = 0; //�Ϸ� ���� ���� �ð� private double pay = 0; //�� ���� �ð� private
         * double sum = 0; //�� �ݾ�
         */ Set<Integer> set = map.keySet(); // ���������� ���ʸ����ش��� Ű���� ������(�������� �ߺ�����)��
                                            // ���� �޾ƿ��� -> Ű�� �ؽ��ʿ��� ��Ƽ�� ���·� ���ʸ���
                                            // ���־���
        System.out.println("[ ��ȣ \t ��ü�� \t �˹ٻ��̸� \t �ñ� / ���� �� �� �� \t �Ϸ� ���� �ð� \t �� �ݾ�  ]");
        for (Integer number : set) {
            String company = map.get(number).getCompany();
            String ename = map.get(number).getEname();
            int day = map.get(number).getDay();
            double pay = map.get(number).getPay();
            double sum = map.get(number).getSum();
 
            System.out.printf("%s\t %s\t %s\t 6500\t %d\t %d\t %.2f\t %.2f \n", number, company, ename, day, pay, sum);
        }
    }
 
    private void part_delete() {
        System.out.print("�����Ͻ� �ѹ��� �Է��� �ּ��� : ");
        int num = scan.nextInt(); // �޴� ��ȣ�� �Է¹ޱ�
        if (map.containsKey(num)) { // �޴������� ��ȣ�� �����ϰ� �ִٸ�
            map.remove(num); // �ʿ��� �����ض� -> Ű�� ��� ���� ����
            System.out.println("�����Ǿ����ϴ�.");
        } else { // �����ϰ� ���� �����Ƿ� �߸��Է�
            System.out.println("���ѹ��� �߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
        }
    }
 
    private void part_add() {
        // ��ü��, �˹ٻ� �̸�, �ñ�, ���� �ð� �� �߰��ϱ�!
        // �˹ٻ� �ڵ� 3�ڸ� ����
 
        M m = new M(); // M ��ü�� �����ؼ�
 
        
        // �α��� �żҵ� ȣ��
        login();
 
        map.put(count, m.input(m)); // �ؽ������� Ű�� ����� ����־� ���Ӱ� �߰����ֱ�
        count++; // �Ѱ��� ����
    }
 
    private void manager_add() {
 
        master ma = new master();
        mapp.put(count, ma.input_m(ma));
        count++;
        save();
 
    }
 
    public void login() {// ��ü��, ������ �̸�, ��й�ȣ�� �Է�
        master ms = new master();
        
        
    }
 
    public void exit() { // �ý��� ��������
        System.out.println("�ý����� �����մϴ�.");
        System.exit(0);
        scan.close(); // �� �Է¹޴� �͵� �׸��ϱ�
    }
    
    
    
}
