package kr.or.kosta;

//Java �Լ�(method) 4���� ����
//void ���� Ÿ���� ���� (�����ִ� ���� ����)
//1. void , parameter(0)
//2. void , parameter(x)
//3. return Type , paramter(0)
//4. return Type , paramter(x)

//return Type : [8���� �⺻Ÿ��] + ���� Ÿ�� + �迭 + Collection + Interface
//parameter : ������ �� (��������) [8���� �⺻Ÿ��] + ���� Ÿ�� + �迭 + Collection + Interface
//�Լ��� �ݵ�� ȣ�⿡ ���ؼ� ���� 
public class FClass {
	public void m(){ //�����
		System.out.println("�Ϲ��Լ�:(void,param(x))");
	}
	public void m2(int i){
		System.out.println("paramter value : " + i);
		System.out.println("�Ϲ��Լ�:(void,param(0))");
	}
	public int m3(){
		//���� ���� 
		return -1000;
		
	}
	public int m4(int i){
		return i + 100; //���� Ÿ��(int)
	}

	////////////////////////////////////////////////
	//method Ȯ���ϱ� 
	//2���� �������� �޾Ƽ� ���� ���� �����ϴ� �Լ�
	public int sum(int i , int j){
		//return i + j;
		int sum = i + j;
		return sum;
	}
	
	//Quiz
	//a �� b ���߿� ū ���� return �ϵ��� �ϼ���
	//������ ����( max(100, 200)  return 200 
	public int max(int a , int b){
		
		//1 (30��)
		//if(a > b){
		//	return a;
		//}else{
		//	return b;
		//}
		
		//2. 60��
		//int result = 0;
		//if(a > b){
		//	result = a;
		//}else{
		//	result = b;
		//}
		//return result;
		
		int max = (a > b) ? a : b;
		return max;
	}
	
	public String concat(String s , String s2 , String s3){
		//��
		String result = s + "/" + s2 + "/" + s3;
		return result;
				
	}
	
	//Class �� Ÿ���̴�
	public Tv ObjMethod(){
		Tv t = new Tv();
		t.brandname="ss";
		return t;
		//return new Tv(); //�ּҰ�(Tv Ÿ���� ������)
	}
	public void ObjMethod2(Tv t){ // (int i)
		System.out.println("ObjMethod2:" +t.brandname); 
	}
	
	/*
	   public List<Car> 
	   
	   public ... obj(Car[] c , String s , int s , int[] s )
	 
	 
	 */
}





