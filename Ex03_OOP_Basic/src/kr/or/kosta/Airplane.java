package kr.or.kosta;
/*
 * �츮 ȸ��� ����⸦ �ֹ� �����ϴ� ȸ���Դϴ� 
 * �츮ȸ��� ����⸦ �����ϴ� ���赵�� ������� �մϴ�
 * �䱸����
 * 1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��մϴ�
 * 2.����Ⱑ ����Ǹ� ����(�̸�, ��ȣ)�� Ȯ���� �� �ֽ��ϴ�
 * 3.�����ڴ� ������� ������� ������� �� ��������� Ȯ�� �� �� �ֽ��ϴ�
 */
/*public class Airplane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	public void setAirData(int num , String name){
		airnum = num;
		airname = name;
		airtotalcount++; //����� ���۽� 1�� ����
	}
	public void airDisplay(){
		System.out.println("airNum:" + airnum + " airName:" + airname);
	}
	
	public void airTotalDisplay(){
		System.out.println("Total Air Count:" + airtotalcount);
	}
	
	//�� �ڵ�� this �� constructor ����� ���� ��Ȳ�� �ڵ�
	//���� �� �ڵ� �����ϰڽ��ϴ�.(�̻ڰ�)
	
	
	
}
*/
public class Airplane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	//public Airplane(){}  //���� �ó��������� �ȵǿ�
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
	
	
	
	
	//�� �ڵ�� this �� constructor ����� ���� ��Ȳ�� �ڵ�
	//���� �� �ڵ� �����ϰڽ��ϴ�.(�̻ڰ�)
	
	
	
}