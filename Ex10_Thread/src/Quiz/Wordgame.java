package Quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class WordTime extends Thread {
	 
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("�����ð� : " + i);
            try {
                Thread.sleep(1000);
 
            } catch (Exception e) {
 
            }
        }
        System.out.println("�ð�����������");
        System.exit(0);
    }
}
 
public class Wordgame {
 
    static int point;
 
    public static void main(String[] args) {
 
        ArrayList<String> ans = new ArrayList<>();
        ans.add("Cotinue");
        ans.add("Firmino");
        ans.add("Gerrard");
        ans.add("Sturridge");
        ans.add("Milner");
        ArrayList<String> num = new ArrayList<>();
        num.add("10");
        num.add("11");
        num.add("8");
        num.add("15");
        num.add("7");
        WordTime timer = new WordTime();
        timer.start();
 
        for (int i = 0; i < ans.size(); i++) {
            String inputdata = JOptionPane.showInputDialog("====����Ǯ ������====\n" + ans.get(i) + "�� ���ȣ�� : ");
            // num.get(i);
            System.out.println(ans.get(i) + "�� ��ȣ��? : " + inputdata);
            if (inputdata.equals(num.get(i))) {
                System.out.println("�����Դϴ�.");
                point += 1;
            }
        }
        System.out.println("���� ������ " + point + "���Դϴ�.");
        if (point == 5) {
            System.out.println("�ʴ� ������ ���̴� !!!!You Never Walk Alone!!!!");
        } else {
            System.out.println("�̤�");
        }
        System.exit(0);
    }
 
}