package kr.or.kosta;
/*
class , member field , method �տ���
������ , ������ , ������
1. default [����(package)]
class Car{  //A ���� �ȿ��� ���� (B ���� ���� ���(x)
 int window;
 String color;
 int speed;
} 
*���ǻ��� : Ŭ���� �ȿ����� public , private �ǹ� ����
2. public (���� : ���� ���о��� ��� �ڿ��� ����)
3. private(���� : Ŭ�������ο����� ���� ��� , 
                   ���������� ���� �Ҽ� ����� )

��ü������ : private (ĸ��ȭ, ����ȭ)                   
 
  1. Ŭ���� ���ο��� Ȱ��
  2. window ������ �����Ҵ��� ���� �����Ҵ�(�Լ�) 

  �ڿ��� ��ȣ : �����ڰ� ���ϴ� ���� ���� ...
*/

public class Car {
	private int window;
	public String color;
	private int speed;
	
	//window (�Լ�) �� ���ؼ� ���� ����
	//read , write : �Լ� 1�� ��� 1��
	
	public void writeWindow(int data){
		if(data > 0){
			window = data;
		}else{
			window = 0;
		}
		
	}
	
	public int readWindow(){
		return window + 10;
	}

	//getter
	public int getSpeed() {
		return speed;
	}

	//setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//java ĸ��ȭ�� �ڿ��� read ,write �Լ�
	//��Ī�Ͽ� setter(���� ����) , getter (�б� ����)
	
	
	//�Լ� (��� , ����)
	//speed 5�� �����ϴ� �Լ�
	public void speedUp(){
		speed+=5;
	}
	//speed 5�� �����ϴ� �Լ�
	public void speedDown(){
		if(speed > 0){
			speed -=5;
		}else{
			speed = 0;
		}
	}
	
	private int data(){
		return 100;
	}
	//�Լ��� ������ private (���ο��� �ٸ� �Լ��� �����
	//���� �Լ�
}






