//��Ӱ��迡�� override(overriding) : ������(�Լ�)
//��Ӱ��迡�� �ڽ�Ŭ������ �θ� Ŭ������ �޼��带 ������
//������(���� { } �ȿ� ����)

//���� (override)
//1. �θ��Լ��� �̸��� ���ƾ� �Ѵ�
//2. �θ��Լ��� �Ķ���Ϳ� ���ƾ� �Ѵ�
//3. �θ��Լ��� ����Ÿ�԰� ���ƾ� �Ѵ�
//4. �ᱹ �θ��Լ��� {�߰�ȣ �� ���� ������ �ٲ�� ������}

//3���� ��ǥ���� ����ϴµ�
//�θ� ������ getPosition �� ��Ȱ�� �� �� ������
class Point2{
	int x = 3;
	int y = 5;
	String getPosition(){
		return "x :" + this.x + " y :" + this.y;
	}
}
class Point3D extends Point2 {
	//�߰�
	int z = 6;
	/*String get3DPosition(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}*/
	
	//���� �ǵ��Ѱ��� �θ��Լ��� ������ 
	//��Ÿ (�Ϲ��Լ�)
	/*String getPositon(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}*/
	
	@Override //annotation (�����Ϸ��� �̸� ������ ���� ���� ������)
	String getPosition(){
		return "x :" + this.x + " y :" + this.y + " z :" + this.z;
	}
}


public class Ex04_inherit_override {
	public static void main(String[] args) {
		Point3D point = new Point3D();
		//System.out.println(point.get3DPosition());
		System.out.println(point.getPosition());
		
	}

}
