package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Hashmap_homework {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProManager pm = new ProManager();
 
        while(true){
            System.out.println("input menu number");
            System.out.println("[ 1.���       2.��ȸ        3.����        4.����         5.��ü��ȸ      0. Quit ]");
            String menu = sc.next();
            String no = "";
            
            switch(menu){
            case "1": //��ǰ ���
                System.out.println("��ǰ�� ���ڵ�� ��ǰ���� �Է��Ͻÿ�");
                String barcode = sc.next();
                String name = sc.next();
                Product p = new Product(barcode,name);
                pm.register(p);
                System.out.println("���� ���");
                break;
            case "2": //��ǰ �ϳ� ��ȸ
                System.out.println("��ȸ�� ��ǰ ���ڵ� �Է�");
                no = sc.next();
                System.out.println(pm.get(no));
                break;
            case "3":
                System.out.println("������ ��ǰ ���ڵ� �Է�");
                no = sc.next();
                pm.remove(no);
                System.out.println("���� ����");
                break;
            case "4":
                System.out.println("������ ��ǰ�� ��ǰ���  ���ڵ带 �Է��Ͻÿ�");
                Product modPro = pm.get(sc.next());
                System.out.println("������ �̸� : ");
                modPro.setName(sc.next()); //�̸�����
                System.out.println("������ ���ڵ� : ");
                modPro.setBarcode(sc.next()); //���ڵ� ����
                pm.modify(modPro);
                System.out.println("���� ����");
                break;
            case "5":
                ArrayList<Product> pl = pm.get();
                System.out.println(pl);
                break;
            case "0":
                System.out.println("Bye");
                sc.close();
                return;
            default:
                System.out.println("�߸� �Է��ϼ̽��ϴ�");
                break;
            }
        }
    }
 
}