import kr.or.kosta.Airplane;

public class Ex07_Airplane_main {

	public static void main(String[] args) {
		Airplane air = new Airplane(707, "�����װ�");
		//air.setAirData(707, "�����װ�"); �Լ� ������
		air.airDisplay();
		air.airTotalDisplay();

		
		Airplane air2 = new Airplane(808, "�ƽþƳ�");
		//air2.setAirData(808, "�ƽþƳ�");
		air2.airDisplay();
		air2.airTotalDisplay();
		
		
		
	}

}
