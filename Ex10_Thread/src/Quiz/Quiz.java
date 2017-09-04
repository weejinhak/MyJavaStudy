package Quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
 
class WordInput extends Thread {
 
    @Override
    public void run() {
        int sum = 0;
 
        HashMap word = new HashMap();
        word.put("�츮�ݿ��� ���� �̻� ����", "������");
        word.put("�츮�ݿ��� ���� ������ ����", "������");
        word.put("�츮�ݿ��� �ְ� û���� ����", "������");
 
        Set keyset = word.keySet();
        Iterator it = keyset.iterator();
        while (it.hasNext()) {
            Object s = it.next();
            String inputdata = JOptionPane.showInputDialog(s);
            String answer = (String) s;
            System.out.println("����� �Է��� ���� : " + inputdata);
            if (inputdata.equals(word.get(answer))) {
                sum++;
                System.out.println("�����Դϴ�");
                System.out.println("���Ṯ�� �� : " + sum);
            } else {
                System.out.println("Ʋ�Ƚ��ϴ� ���� : " + word.get(answer));
            }
        }
    }
}
 
class WordTimes extends Thread {
    @Override
    public void run() {
 
        try {
            for (int i = 20; i > 0; i--) {
                System.out.println("���� �ð� : " + i + "��");
                Thread.sleep(1000);
        
 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("GameEnd");
        System.exit(0);
 
    }
}
 
public class Quiz {
    static int count;
 
    public static void main(String[] args) {
        WordInput word = new WordInput();
        WordTimes time = new WordTimes();
        word.start();
        time.start();
 
        System.out.println("Game Start!");
 
    }
 
}