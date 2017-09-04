import java.util.Scanner;

//다음 주 월요일쯤 다시
public class Ex12_doWhile_Quiz {

	//static 객체 생성 없이 사용할 수 있는 자원
	static Scanner sc = new Scanner(System.in);
	static void inputRecord(){
		System.out.println("성적 데이터 입력");
	}
	static void deleteRecord(){
		System.out.println("성적 데이터 삭제");
	}
	static void sortRecord(){
		System.out.println("성적 데이터 정렬");
	}
	static int displayMenu(){
		System.out.println("*******************");
		System.out.println("*****[성적관리]*****");
		System.out.println("1.학생성적 입력하기");
		System.out.println();
		System.out.println("2.학생성적 삭제하기");
		System.out.println();
		System.out.println("3.학생성적 이름순 정렬");
		System.out.println();
		System.out.println("4.프로그램 종료");
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
				System.out.println("메뉴를 잘못 선택");
				System.out.println("원하는 메뉴(1~4)까지 선택");
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
					System.out.println("프로그램 강제 종료");
					System.exit(0); //프로세스 종료
			}
		}

	}

}
