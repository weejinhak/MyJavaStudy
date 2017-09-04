/*
제어문 
1. 조건문 : if , if~else , if~else if ~else if
            switch(){case ...} (경우의 수가 많은 경우)
            Tip) C# > select case 
2. 반복문 : ...
 
 */
public class Ex07_Opr {
	public static void main(String[] args) {
		int score = 60;
		switch (score) { // 조건식 또는 조건값
		case 100:
			System.out.println("100 :" + score);
			break;
		case 90:
			System.out.println("90 :" + score);
			break;
		case 80:
			System.out.println("80 :" + score);
			break;
		case 70:
			System.out.println("70 :" + score);
			break;
		case 60:
			System.out.println("60 :" + score);
			break;
		default:
			System.out.println("불일치");
		}
		//소스정리
		//Ctrl + A (전체 블럭)
		//Ctrl + shift + F (자동 들여쓰기 정리)
		//switch(){
		//case 1 : 실행문;
		//   break;
		//}
		int data = 80;
		switch(data){
			case 100:System.out.println("100");
			case 90:System.out.println("90");
			case 80:System.out.println("80");
			case 70:System.out.println("70");
			case 60:System.out.println("60");
				  break;
			default : System.out.println("default");
		}
		
		//난수 (랜덤값 : 임의의 추출값)
		//Math ( import java.lang.Math 원칙 )
		//default : java.lang Open 생략 
		//random()
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random()*10 : " + Math.random()*10);
		
		//0~9 사이의 난수 값 
		System.out.println("(int)(Math.random()*10): " + (int)(Math.random()*10));
	
	    //1~10 사이의 난수 
		System.out.println("((int)(Math.random()*10) + 1): " + ((int)(Math.random()*10) + 1));
	
		//시나리오
		//이 시스템은 백화점 경품 추첨 시스템이다
		//경품 추첨시 1000 점수가 나오면
		//경품으로 Tv, NoteBook , 냉장고 , 한우 , 휴지 
		//경품 추첨시 900 점수가 나오면
		//경품으로 NoteBook , 냉장고 , 한우 , 휴지
		//경품 추첨시 800 점수가 나오면
		//경품으로 냉장고 , 한우 , 휴지
		//경품 추첨시 700 점수가 나오면
		//경품으로 한우 , 휴지
		//경품 추첨시 600 점수가 나오면
		//경품으로 휴지
		//그외 점수는 양말
		
		//제어문 (switch~ , Math.Random() (100~1000))
		int jumsu = (int)(Math.random()*10) + 1;
		System.out.println("추첨번호 : " + jumsu);
		String msg=""; //초기화
		jumsu*=100;
		msg="고객님의 점수는 :" + jumsu + "이고 상품은 : ";
		switch (jumsu) {
			case 1000:msg+="Tv ";
			case 900:msg+="NoteBook ";
			case 800:msg+="냉장고 ";
			case 700:msg+="한우 ";
			case 600:msg+="휴지 ";
			 break;
			default :msg+="양말";
		}
		System.out.println(msg);
	}

}
