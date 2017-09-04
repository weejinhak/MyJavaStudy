import kr.or.kosta.Airplane;

public class Ex07_Airplane_main {

	public static void main(String[] args) {
		Airplane air = new Airplane(707, "대한항공");
		//air.setAirData(707, "대한항공"); 함수 생성자
		air.airDisplay();
		air.airTotalDisplay();

		
		Airplane air2 = new Airplane(808, "아시아나");
		//air2.setAirData(808, "아시아나");
		air2.airDisplay();
		air2.airTotalDisplay();
		
		
		
	}

}
