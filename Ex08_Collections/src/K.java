import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
/*
 * hashMap�� ������ ������ ����Ǿ� �ִ�. 
 * ArrayList���� ����, �׿� ���� ���, ���俩�ΰ� ����
 */
class Question {
    String q;
    String ans;
    String check;
 
    public Question(String q, String ans, String check) {
        super();
        this.q = q;
        this.ans = ans;
        this.check = check;
    }
}
 
public class K {
 
    public static void main(String[] args) {
    	 // TODO Auto-generated method stub
        HashMap quiz = new HashMap();
        quiz.put("���ϼ� �ּ� �ϰ��� �������� ���� 1���� ���� ���� ������ ��������", "�����縪");
        quiz.put("1+1", "2");
        quiz.put("���ѹα��� ������ �����ΰ�", "����");
        quiz.put("�߼� ������ ������ڵ��� ���� ��������", "���");
        quiz.put("4�⸶�� ������ ���� ���� ��ȸ�� �����ΰ�", "�ø���");
 
        Scanner sc = new Scanner(System.in);
        ArrayList<Question> arr = new ArrayList();
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println(quiz.keySet().toArray()[i]);
            String answer = sc.nextLine();
            if (quiz.get(quiz.keySet().toArray()[i]).equals(answer)) {
                arr.add(new Question((String) quiz.keySet().toArray()[i], answer, "O"));
                System.out.println("�����Դϴ�.");
            } else {
                arr.add(new Question((String) quiz.keySet().toArray()[i], answer, "x"));
            }
        }
        System.out.println();
        for (Question obj : arr) {
            System.out.println(obj.q + "/" + obj.ans + "/" + obj.check);
        }
    }
}