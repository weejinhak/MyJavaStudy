import java.util.Scanner;

//���� �� �������� �ٽ�
public class Ex12_doWhile_Quiz {

	//static ��ü ���� ���� ����� �� �ִ� �ڿ�
	static Scanner sc = new Scanner(System.in);
	static void inputRecord(){
		System.out.println("���� ������ �Է�");
	}
	static void deleteRecord(){
		System.out.println("���� ������ ����");
	}
	static void sortRecord(){
		System.out.println("���� ������ ����");
	}
	static int displayMenu(){
		System.out.println("*******************");
		System.out.println("*****[��������]*****");
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� �����ϱ�");
		System.out.println();
		System.out.println("3.�л����� �̸��� ����");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();
		
		int menu =0;
		do{
			try{
				 menu = Integer.parseInt(sc.nextLine());
				 if(menu >=1 && menu <=4){
					 break;
				 }else{
					 throw new Exception();
				 }
			}catch(Exception e){
				System.out.println("�޴��� �߸� ����");
				System.out.println("���ϴ� �޴�(1~4)���� ����");
			}
		}while(true);
		
		
		return menu;
	}
	public static void main(String[] args) {
		while(true){
			switch (Ex12_doWhile_Quiz.displayMenu()) {
				case 1: Ex12_doWhile_Quiz.inputRecord();
					break;
				case 2: Ex12_doWhile_Quiz.deleteRecord();
					break;
				case 3: Ex12_doWhile_Quiz.sortRecord();
					break;
				case 4:
					System.out.println("���α׷� ���� ����");
					System.exit(0); //���μ��� ����
			}
		}

	}

}
