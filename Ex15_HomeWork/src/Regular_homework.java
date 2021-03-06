
 
/* 작성일 : 2017.02.24
 * 작성자 : [2조] 이재민, 김영준, 김민성, 이은경, 김은영, 최은혜
 * [정규표현식 예제]
 * */
 
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Regular_homework {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // IP주소 확인
        System.out.println("IP주소를 입력해주세요.\n예)192.168.207.115");
        String ChkIp = "([0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9])";
        String Ip = sc.nextLine();
        boolean resultIp = Pattern.matches(ChkIp, Ip);
 
        if (resultIp) {
            System.out.println("[올바른] IP주소 입니다.");
        } else {
            System.out.println("[잘못된] IP주소 입니다.");
        }
 
         
        
        // 이름 확인
        System.out.println("이름을 입력해주세요.\n예)이재민");
        String ChkName = "([가-힣]{2,5})";
        String Name = sc.nextLine();
        boolean resultName = Pattern.matches(ChkName, Name);
 
        if (resultName) {
            System.out.println("[올바른] 이름 입니다.");
        } else {
            System.out.println("[잘못된] 이름 입니다.");
        }
 
        
        
        
        
        // 주민등록번호 확인
        System.out.println("주민등록번호를 입력해주세요. \n예)880517-1234567");
        String ChkJumin = "([0-9][0-9][0-1][0-9][0-3][0-9]-[1-4][0-9][0-9][0-9][0-9][0-9][0-9])";
        String Jumin = sc.nextLine();
        boolean resultJumin = Pattern.matches(ChkJumin, Jumin);
 
        if (resultJumin) {
            System.out.println("[올바른] 주민등록번호 입니다.");
        } else {
            System.out.println("[잘못된] 주민등록번호 입니다.");
        }
 
        
        
        
        
        // 휴대폰번호 확인
        System.out.println("휴대폰번호를 입력해주세요.\n예)010-3555-9217");
        String ChkPhone = "(01[016789]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])";
        String Phone = sc.nextLine();
        boolean resultPhone = Pattern.matches(ChkPhone, Phone);
 
        if (resultPhone) {
            System.out.println("[올바른] 휴대폰번호 입니다.");
        } else {
            System.out.println("[잘못된] 휴대폰번호 입니다.");
        }
 
        
        
        
        
        // Email주소 확인
        System.out.println("Email주소를 입력해주세요.\n예)ekbabo@naver.com");
        String ChkEmail = "([a-zA-Z][a-zA-Z0-9._]{2,11})@[a-zA-z]{3,5}.([a-zA-Z]{3,4}|[a-zA-Z]{2,4}.[a-zA-Z]{2,4})";
        String Email = sc.nextLine();
 
        boolean resultEmail = Pattern.matches(ChkEmail, Email);
 
        if (resultEmail) {
            System.out.println("[올바른] Email주소 입니다.");
        } else {
            System.out.println("[잘못된] Email주소 입니다.");
        }
    }
}
