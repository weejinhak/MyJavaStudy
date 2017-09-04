//대량의 문자열 누적시에는 String 보다는 StringBuffer 권장
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
		//많은양의 누적값 처리
		
		//Collection 타입을 StringBuffer 
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
