import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
/*
 * hashMap에 문제와 정답이 저장되어 있다. 
 * ArrayList에는 문제, 그에 대한 대답, 정답여부가 저장
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
        quiz.put("김일성 주석 일가와 북한정권 수립 1세대 등이 묻힌 북한의 국립묘지", "혁명열사릉");
        quiz.put("1+1", "2");
        quiz.put("대한민국의 수도는 무엇인가", "서울");
        quiz.put("중세 유럽의 상공업자들이 만든 동업조합", "길드");
        quiz.put("4년마다 열리는 국제 운동경기 대회는 무엇인가", "올림픽");
 
        Scanner sc = new Scanner(System.in);
        ArrayList<Question> arr = new ArrayList();
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println(quiz.keySet().toArray()[i]);
            String answer = sc.nextLine();
            if (quiz.get(quiz.keySet().toArray()[i]).equals(answer)) {
                arr.add(new Question((String) quiz.keySet().toArray()[i], answer, "O"));
                System.out.println("정답입니다.");
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