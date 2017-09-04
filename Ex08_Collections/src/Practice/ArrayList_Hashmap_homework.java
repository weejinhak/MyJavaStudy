package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Hashmap_homework {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProManager pm = new ProManager();
 
        while(true){
            System.out.println("input menu number");
            System.out.println("[ 1.등록       2.조회        3.삭제        4.수정         5.전체조회      0. Quit ]");
            String menu = sc.next();
            String no = "";
            
            switch(menu){
            case "1": //상품 등록
                System.out.println("상품의 바코드와 상품명을 입력하시오");
                String barcode = sc.next();
                String name = sc.next();
                Product p = new Product(barcode,name);
                pm.register(p);
                System.out.println("정상 등록");
                break;
            case "2": //상품 하나 조회
                System.out.println("조회할 상품 바코드 입력");
                no = sc.next();
                System.out.println(pm.get(no));
                break;
            case "3":
                System.out.println("삭제할 상품 바코드 입력");
                no = sc.next();
                pm.remove(no);
                System.out.println("정상 삭제");
                break;
            case "4":
                System.out.println("수정할 상품의 상품명과  바코드를 입력하시오");
                Product modPro = pm.get(sc.next());
                System.out.println("수정할 이름 : ");
                modPro.setName(sc.next()); //이름수정
                System.out.println("수정할 바코드 : ");
                modPro.setBarcode(sc.next()); //바코드 수정
                pm.modify(modPro);
                System.out.println("정상 수정");
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
                System.out.println("잘못 입력하셨습니다");
                break;
            }
        }
    }
 
}