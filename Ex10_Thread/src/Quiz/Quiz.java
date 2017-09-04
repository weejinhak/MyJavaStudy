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
        word.put("우리반에서 제일 이쁜 여자", "이은경");
        word.put("우리반에서 가장 섹시한 여자", "이은경");
        word.put("우리반에서 최고 청순한 여자", "이은경");
 
        Set keyset = word.keySet();
        Iterator it = keyset.iterator();
        while (it.hasNext()) {
            Object s = it.next();
            String inputdata = JOptionPane.showInputDialog(s);
            String answer = (String) s;
            System.out.println("당신이 입력한 값은 : " + inputdata);
            if (inputdata.equals(word.get(answer))) {
                sum++;
                System.out.println("정답입니다");
                System.out.println("맞춘문제 수 : " + sum);
            } else {
                System.out.println("틀렸습니다 답은 : " + word.get(answer));
            }
        }
    }
}
 
class WordTimes extends Thread {
    @Override
    public void run() {
 
        try {
            for (int i = 20; i > 0; i--) {
                System.out.println("남은 시간 : " + i + "초");
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