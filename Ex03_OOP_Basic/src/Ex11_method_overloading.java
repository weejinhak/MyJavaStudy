//��ü������
//ĸ��ȭ(����ȭ) > private

//���� : method overloading
//�ϳ��� �̸����� �������� ���
//�������� ���
//�Լ��� paramter �� ������ Ÿ���� �޸��ؼ� ���
//1.�Լ��� �̸��� ���ƾ� �Ѵ�
//2.[parameter] ���� or [Type] �޶�� �Ѵ�
//3.return type �� �����ε��� �Ǵܱ���[x]
//4.paramter ������ �ٸ��� ����

//why ���:���ؼ�=> ������ 
//���� ���� ���� (0%)

class Overtest{
	int add(int i){
		return i + 100;
	}
	//int addtwo(int i , int j){
	//	return i + j;
	//}
	int add(int i , int j){
		return i+j;
	}
	
	//void add(int number){} �浹
	
	void add(String s , int i){
		
	}
	//������ ���� ����
	void add(int i , String s){
		
	}
	
	//���� �迭 (Array)�� ������� ....
	//key point
	int[] add(int[] param){ //param �迭 ��ü �ּҰ�
		int[] target = new int[param.length];
		for(int i=0; i< param.length;i++){
			target[i] = param[i]+1;
		}
		
		return target;
	}
	
	int[] add(int[] so , int[] so2){
	 //�Լ��� error ���� ���۵ǰ� 	
	 int length = so.length > so2.length ? so.length : so2.length;
	 int[] result = new int[length];
	     for(int i = 0; i < result.length; i++){
	            result[i] = so[i] + so2[i];
	        }
	     return result;
	}
}
public class Ex11_method_overloading {

	public static void main(String[] args) {
		Overtest test = new Overtest();
		test.add(100);
		test.add(100,300);
		
		System.out.println(); //overloading
		
		int[] soruce = {10,11,12,13,14,15}; //new
		
		int[] array = test.add(soruce);
		System.out.println(soruce == array);
		
		//���� �Լ� ȣ�� ���
		int[] s = {10,20,30};
		int[] t = {11,21,31};
		int[] target3 = test.add(s, t);
		        
		  for(int value : target3){
		            System.out.print(value+" ");
		}
	}

}
