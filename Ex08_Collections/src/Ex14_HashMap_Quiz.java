import java.util.HashMap;
import java.util.Scanner;

/*
 * HashMap Ȱ�� 
 * ȸ�� ID , PWD 
 * 
 * 
 * 
 * 
 */
public class Ex14_HashMap_Quiz {
	public static void main(String[] args) {
		//ȸ���α��� ó��
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//�ý��ۿ� �α��� (����ó��)
		//ID(0) , PWD(x)
		//ID(0) , PWD(0)
		
		//ID(x) , PWD(x)
		//ID(x) , PWD(0) 
		
		Scanner sc = new Scanner(System.in);
		//ID PWD console���� �Է� �޾Ƽ� ó��
		while(true){
					System.out.println("ID , PWD �Է����ּ���");
					
					System.out.print("ID: ");
					String id = sc.nextLine().trim().toLowerCase();
					
					System.out.print("PWD: ");
					String pwd = sc.nextLine().trim();
					
					if(!loginmap.containsKey(id)){ //��ġ�ϴ� ID�� ������
						System.out.println("���Է� �ϼ���");
						continue;
					}else{
						if(loginmap.get(id).equals(pwd)){
							System.out.println("�α��� �氡�氡^^");
							break;
						}else{
							System.out.println("�н����� ���Է�");
						}
					}
		}
		
	}

}
