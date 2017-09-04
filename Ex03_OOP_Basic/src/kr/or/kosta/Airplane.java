package kr.or.kosta;
/*
 * 우리 회사는 비행기를 주문 제작하는 회사입니다 
 * 우리회사는 비행기를 생산하는 설계도를 만들려고 합니다
 * 요구사항
 * 1.비행기를 생산하고 비행기의 이름과 번호를 부여합니다
 * 2.비생기가 생산되면 정보(이름, 번호)를 확인할 수 있습니다
 * 3.생산자는 현재까지 만들어진 비행기의 총 누적대수를 확인 할 수 있습니다
 */
/*public class Airplane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	public void setAirData(int num , String name){
		airnum = num;
		airname = name;
		airtotalcount++; //비행기 제작시 1씩 증가
	}
	public void airDisplay(){
		System.out.println("airNum:" + airnum + " airName:" + airname);
	}
	
	public void airTotalDisplay(){
		System.out.println("Total Air Count:" + airtotalcount);
	}
	
	//위 코드는 this 와 constructor 배우지 않은 상황의 코드
	//추후 위 코드 수정하겠습니다.(이쁘게)
	
	
	
}
*/
public class Airplane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	//public Airplane(){}  //현재 시나리오에서 안되요
	public Airplane(int airnum, String airname){
		this.airnum = airnum;
		this.airname = airname;
		airtotalcount++;
	}
	
	public void airDisplay(){
		System.out.println("airNum:" + airnum + " airName:" + airname);
	}
	
	public void airTotalDisplay(){
		System.out.println("Total Air Count:" + airtotalcount);
	}

/*	@Override
	public String toString() {
		return "Airplane [airnum=" + airnum + ", airname=" + airname + "]";
	}*/
	
	
	
	
	//위 코드는 this 와 constructor 배우지 않은 상황의 코드
	//추후 위 코드 수정하겠습니다.(이쁘게)
	
	
	
}