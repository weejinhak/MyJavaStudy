
 
/* �ۼ��� : 2017.02.24
 * �ۼ��� : [2��] �����, �迵��, ��μ�, ������, ������, ������
 * [����ǥ���� ����]
 * */
 
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Regular_homework {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // IP�ּ� Ȯ��
        System.out.println("IP�ּҸ� �Է����ּ���.\n��)192.168.207.115");
        String ChkIp = "([0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9])";
        String Ip = sc.nextLine();
        boolean resultIp = Pattern.matches(ChkIp, Ip);
 
        if (resultIp) {
            System.out.println("[�ùٸ�] IP�ּ� �Դϴ�.");
        } else {
            System.out.println("[�߸���] IP�ּ� �Դϴ�.");
        }
 
         
        
        // �̸� Ȯ��
        System.out.println("�̸��� �Է����ּ���.\n��)�����");
        String ChkName = "([��-�R]{2,5})";
        String Name = sc.nextLine();
        boolean resultName = Pattern.matches(ChkName, Name);
 
        if (resultName) {
            System.out.println("[�ùٸ�] �̸� �Դϴ�.");
        } else {
            System.out.println("[�߸���] �̸� �Դϴ�.");
        }
 
        
        
        
        
        // �ֹε�Ϲ�ȣ Ȯ��
        System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���. \n��)880517-1234567");
        String ChkJumin = "([0-9][0-9][0-1][0-9][0-3][0-9]-[1-4][0-9][0-9][0-9][0-9][0-9][0-9])";
        String Jumin = sc.nextLine();
        boolean resultJumin = Pattern.matches(ChkJumin, Jumin);
 
        if (resultJumin) {
            System.out.println("[�ùٸ�] �ֹε�Ϲ�ȣ �Դϴ�.");
        } else {
            System.out.println("[�߸���] �ֹε�Ϲ�ȣ �Դϴ�.");
        }
 
        
        
        
        
        // �޴�����ȣ Ȯ��
        System.out.println("�޴�����ȣ�� �Է����ּ���.\n��)010-3555-9217");
        String ChkPhone = "(01[016789]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])";
        String Phone = sc.nextLine();
        boolean resultPhone = Pattern.matches(ChkPhone, Phone);
 
        if (resultPhone) {
            System.out.println("[�ùٸ�] �޴�����ȣ �Դϴ�.");
        } else {
            System.out.println("[�߸���] �޴�����ȣ �Դϴ�.");
        }
 
        
        
        
        
        // Email�ּ� Ȯ��
        System.out.println("Email�ּҸ� �Է����ּ���.\n��)ekbabo@naver.com");
        String ChkEmail = "([a-zA-Z][a-zA-Z0-9._]{2,11})@[a-zA-z]{3,5}.([a-zA-Z]{3,4}|[a-zA-Z]{2,4}.[a-zA-Z]{2,4})";
        String Email = sc.nextLine();
 
        boolean resultEmail = Pattern.matches(ChkEmail, Email);
 
        if (resultEmail) {
            System.out.println("[�ùٸ�] Email�ּ� �Դϴ�.");
        } else {
            System.out.println("[�߸���] Email�ּ� �Դϴ�.");
        }
    }
}
