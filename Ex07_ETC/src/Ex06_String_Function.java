import java.util.StringTokenizer;

//String Ŭ������ ������ public �Լ�
//String Ŭ������ static �Լ� (public)
//String Ŭ������ �Ϲ��Լ�     (public)
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str=""; //���ڿ��� �ʱ�ȭ
		//�������� �ʱ�ȭ //instance variable �⺻��(null)
		char c=' ';//�ѹ��� �ʱ�ȭ \u0000
		
		String[] strarr = {"abc","abcd","a"};
		for(String s : strarr){
			System.out.println(s);
		}
		/////////////����/////////////////
		//�Լ� (10�� �ϱ�)
		String ss = "hello";
		String concat_ss = ss.concat(" world");
		System.out.println(concat_ss);
		
		boolean bo = ss.contains("h");
		System.out.println(bo);
		System.out.println(ss.contains("llo"));
		System.out.println(ss.contains("elo"));
		
		
		String ss2 = "a b c d";//[a][][b][][c]...
		System.out.println(ss2.length());
		String filename = "hello java, world";
		int index = filename.indexOf(",");
		System.out.println(index);
		index = filename.indexOf("java");
		System.out.println(index);
		//java ���ڿ��� filename������ ������ 
		//0 ���� ũ�� OK 
		index = filename.indexOf("javp");
		System.out.println(index);
		
		index = filename.lastIndexOf("a");
		System.out.println(index);
		
		//indexof() , substring() , replace()
		String result = "superman";
		System.out.println(result.substring(1));
		System.out.println(result.substring(1, 2)); //endIndex - 1
		System.out.println("(1,1) : " + result.substring(1, 1));
		
		//Returns a string that is a substring of this string. 
		//The substring begins at the specified beginIndex 
		//and extends to the character at index endIndex - 1. 
		//Thus the length of the 
		//substring is endIndex-beginIndex
		
		//Quiz
		String filename2 = "a.png"; //or c.jpg , aaaaaa.png
		//���ϸ�� Ȯ���ڸ� �и��ؼ� ���
		//���ϸ� : aaa   c
		//Ȯ���� : txt   jpg
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		
		String extention = 
				filename2.substring(position+1,filename2.length());
		
		String extention2 = filename2.substring(++position);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);

		//***ġȯ�Լ�(replace)
		String s4 = "ABCD";
		String result2 = s4.replace("A", "��");
		System.out.println(result2);
		System.out.println(s4.replace("BC", "�ƹ������"));
		
		System.out.println(s4.charAt(0));
		System.out.println(s4.endsWith("CD"));
		System.out.println(s4.equalsIgnoreCase("aBCD")); //��ҹ��ڱ���(x)
		
		/////////////////////////////////////
		//split
		String s6 ="���۸�,��Ƽ,�����,������,������";
		String[] namearry = s6.split(",");
		for(String st : namearry){
			System.out.println(st);
		}
		
		String filename3 = "kosta.jpg";
		String[] arr =filename3.split("\\.");  //filename3.split(".");
		System.out.println(arr.length);
		for(String st : arr){
			System.out.println("for : " + st);
		}
		//���� ����
		//����ǥ���� 
		//���� ǥ���Ŀ� ���Ͽ� ���� �Ͻð�
		//���� ǥ������ ���� 5�� ���弼��
		//DB , Javascript , java , C# 
		//010-{\d4}-0000  >010-122-0000 > false
		//                >010-1222-0000 > true
		
		//split (����ǥ����)
		System.out.println("***************");
		String s7 = "a//b.c,d-f";
		StringTokenizer sto = new StringTokenizer(s7, "/.,-");
		while(sto.hasMoreTokens()){
			System.out.println(sto.nextToken());
		}
		
		//�ͼ��� ����
		String s8 = "ȫ       ��       ��";
		//���� : �������� ���� > ȫ�浿
		System.out.println(s8.replace(" ",""));
		String s9 = "     ȫ�浿      ";
		System.out.println(">" + s9  +"<");
		System.out.println(">" + s9.trim()  +"<");
		
		String s1 = "    ȫ   �浿     ";
		//ȫ�浿
		String str2 = s1.trim();
		String str3 = str2.replace(" ", "");
		System.out.println(str3);
		
		//method chain ���
		System.out.println(s1.trim().replace(" ", ""));
		s1.isEmpty();
		
		//Quiz-1
		String snumstr="";
		int sum=0;
		String[] numberarr = {"1","2","3","4","5"};
		//�迭�ȿ� �ִ� ������ ���� ����ϼ���
		//1+2+3+4+5 
		for(String s : numberarr){
			snumstr+=s;
			sum+= Integer.parseInt(s);
		}
		System.out.println("��:" + sum);
		System.out.println("���ڿ�:" + snumstr);
	
	    //Quiz-2
		//�ֹι�ȣ�� ���� ���ϼ���
		String jumin = "123456-1234567";
		
		   int sum2 = 0;
		   for(int i = 0 ; i < jumin.length() ; i++){
			   String numstr = jumin.substring(i,i+1);
			   if(numstr.equals("-"))continue;
			   sum2+= Integer.parseInt(numstr);
		   }
		   System.out.println("�ֹι�ȣ�� :  " + sum2);
		  
	  
		   //�ֹι�ȣ�� ���� ���ϼ��� _2
		   String jumin2 = jumin.replace("-", "");
		   String[] numarr = jumin2.split("");
		   int sum3 =0;
		   for(String i : numarr){
			   sum3 += Integer.parseInt(i);
		   }
		   System.out.println("�ֹι�ȣ��2 : " + sum3);
		
		   
		   //�ֹι�ȣ�� ���� ���ϼ��� _3
		   String jumin4 = jumin.replace("-", "");
		   int sum4 = 0;
		   for(int i = 0; i < jumin4.length() ; i++){
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("�ֹι�ȣ��3 : " + sum4);
	
		   //foramt
		  //System.out.printf("%d-%s", 10,"A"); 
		   
		  //String Ŭ���� (foramt)�Լ�
		  String str7 = String.format("%d-%s", 10,"AAA");
		  System.out.println(str7);
		  
		  //String Ŭ���� static : valueOf , format �Լ���
	} 

}




