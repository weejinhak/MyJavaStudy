//���Խ��̶� �ؽ�Ʈ ������ �߿��� ���ϴ� ����(����, pattern)�� ��ġ�ϴ� ���ڿ��� ã�Ƴ��� ���� ����ϴ� ������ 
//�̸� ���ǵ� ��ȣ�� ���ڸ� �̿��ؼ� �ۼ��� ���ڿ��� �ǹ�
 
 
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class sik {
    // static ���� �������� ��ƶ�
    static String data = "";
    static String regExp;
    static Scanner sc = new Scanner(System.in); //�Է�
 
    public static void main(String[] args) throws Exception {
 
        while (true) {
            System.out.println("1.�̸� 2.��й�ȣ 3.�ڵ�����ȣ 4.�̸��� 5.�ֹι�ȣ 6.������");
            int a = sc.nextInt();
            sc.nextLine();
 
            switch (a) {
            
            case 1:
                name();
                break;
            case 2:
                pwd();
                break;
            case 3:
                phone();
                break;
            case 4:
                email();
                break;
            case 5:
                jumin();
                break;
            case 6:
                System.out.println("�����մϴ�");
                System.exit(0);
                break;
                
            default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
            break;
 
            }
        }
    }
 
    public static void name() {
       
        System.out.println("1.�̸� �Է�:");
        
        String regExp = "^[��-����-�R]*$";
        String data = sc.nextLine();
        
       //����ǥ������ ���Ͽ� ��ġ�ϴ��� ���θ� �׽�Ʈ�Ѵ�.
       boolean b = data.matches(regExp); // true ,false ��ȿ�� �˻�
 
        if (b == true) {
            System.out.println("�ùٸ� �����Դϴ� , ¦¦¦!!");
        } else {
            System.out.println("�̸����� �ѱ۸� ���ü� �־��.");
        }
 
    }
 
    public static void pwd() {
        System.out.println("2.��й�ȣ �Է�:");
        //
        String regExp = "^[A-Za-z0-9_@./#&+-?~]*.{6,20}$";
        String data = sc.nextLine();
 
        boolean b1 = data.matches(regExp); // true ,false ��ȿ�� �˻�
 
        if (b1 == true) {
            System.out.println("�ùٸ� �����Դϴ� , ¦¦¦!!");
        } else {
            System.out.println("6~20�� ���̿� �����ҹ���,Ư�����ڵ� ���ü� �ֽ��ϴ�.");
        }
    }
 
    public static void phone() {
        System.out.println("3.�޴��ȣ �Է�:");
        // �ڵ��� ���ڸ�(010)
        // ��� 4�ڸ�
        // ������ 4�ڸ�
        String regExp = "(010)-\\d{4}-\\d{4}";
        String data = sc.nextLine();
 
        boolean b2 = data.matches(regExp); // true ,false ��ȿ�� �˻�
 
        if (b2 == true) {
            System.out.println("�ùٸ� �����Դϴ�, ¦¦¦!!!");
        } else {
            System.out.println("�޴���ȭ�� 010-xxxx-xxxx �� ���ü� �־��. �ٽ� �Է����ּ���!!");
        }
 
    }
 
    public static void email() {
       //@�տ� �����ҹ��� ���ڸ�
       //@�ڿ��� �����ҹ��ڸ�
       //.(��)�ڿ��� �����ҹ��ڸ�
        System.out.println("4.E-Mail �Է�:");
 
        String regExp = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
        String data = sc.nextLine();
 
        boolean b3 = data.matches(regExp); // true ,false ��ȿ�� �˻�
 
        if (b3 == true) {
            System.out.println("�ùٸ� �����Դϴ� , ¦¦¦!!");
        } else {
            System.out.println("E-mail ������ ex)csyong92@kosta.com �Դϴ�. �ٽ� �Է� �ϼ��� ");
        }
    }
    public static void jumin(){
          System.out.println("5.�ֹι�ȣ �Է�:");
          
          String regExp = "^\\d{6}-[1-4]\\d{6}";
          String data = sc.nextLine();
          
          boolean b4 = data.matches(regExp); // true ,false ��ȿ�� �˻�
          
          if(b4 == true){
             System.out.println("�ùٸ� �����Դϴ� , ¦¦¦!!");
          }
          else {
             System.out.println("�ֹι�ȣ ������ xxxxxx-xxxxxxx�̰�, ���ڸ� ù��° ��ȣ�� 1~4�� �Է� ���� �մϴ�.");
          }
       }
 
    
}
