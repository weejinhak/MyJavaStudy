//�뷮�� ���ڿ� �����ÿ��� String ���ٴ� StringBuffer ����
public class Ex10_StringBuffer {
	public static void main(String[] args) {
		String str = "A";
		str+="B";
		System.out.println(str.hashCode());
		str+="C";
		System.out.println(str.hashCode());
		str+="D";
		System.out.println(str.hashCode());
		System.out.println(str);
		//�������� ������ ó��
		
		//Collection Ÿ���� StringBuffer 
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("A");
		System.out.println(sb.hashCode());
		sb.append("B");
		System.out.println(sb.hashCode());
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		sb.append("B");
		System.out.println(sb.hashCode());
		System.out.println(sb.capacity());
	}

}
