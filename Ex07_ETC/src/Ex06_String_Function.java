import java.util.StringTokenizer;

//String 클래스가 가지는 public 함수
//String 클래스의 static 함수 (public)
//String 클래스의 일반함수     (public)
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str=""; //문자열의 초기화
		//지역변수 초기화 //instance variable 기본값(null)
		char c=' ';//한문자 초기화 \u0000
		
		String[] strarr = {"abc","abcd","a"};
		for(String s : strarr){
			System.out.println(s);
		}
		/////////////복습/////////////////
		//함수 (10개 암기)
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
		//java 문자열이 filename변수에 있으면 
		//0 보다 크면 OK 
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
		//파일명과 확장자를 분리해서 출력
		//파일명 : aaa   c
		//확장자 : txt   jpg
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		
		String extention = 
				filename2.substring(position+1,filename2.length());
		
		String extention2 = filename2.substring(++position);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);

		//***치환함수(replace)
		String s4 = "ABCD";
		String result2 = s4.replace("A", "가");
		System.out.println(result2);
		System.out.println(s4.replace("BC", "아배고프다"));
		
		System.out.println(s4.charAt(0));
		System.out.println(s4.endsWith("CD"));
		System.out.println(s4.equalsIgnoreCase("aBCD")); //대소문자구별(x)
		
		/////////////////////////////////////
		//split
		String s6 ="슈퍼맨,팬티,노랑색,우하하,우하하";
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
		//조별 과제
		//정규표현식 
		//정규 표현식에 관하여 조사 하시고
		//정규 표현식을 조당 5개 만드세요
		//DB , Javascript , java , C# 
		//010-{\d4}-0000  >010-122-0000 > false
		//                >010-1222-0000 > true
		
		//split (정규표현식)
		System.out.println("***************");
		String s7 = "a//b.c,d-f";
		StringTokenizer sto = new StringTokenizer(s7, "/.,-");
		while(sto.hasMoreTokens()){
			System.out.println(sto.nextToken());
		}
		
		//넌센스 퀴즈
		String s8 = "홍       길       동";
		//저장 : 공백제거 저장 > 홍길동
		System.out.println(s8.replace(" ",""));
		String s9 = "     홍길동      ";
		System.out.println(">" + s9  +"<");
		System.out.println(">" + s9.trim()  +"<");
		
		String s1 = "    홍   길동     ";
		//홍길동
		String str2 = s1.trim();
		String str3 = str2.replace(" ", "");
		System.out.println(str3);
		
		//method chain 기법
		System.out.println(s1.trim().replace(" ", ""));
		s1.isEmpty();
		
		//Quiz-1
		String snumstr="";
		int sum=0;
		String[] numberarr = {"1","2","3","4","5"};
		//배열안에 있는 값들의 합을 출력하세요
		//1+2+3+4+5 
		for(String s : numberarr){
			snumstr+=s;
			sum+= Integer.parseInt(s);
		}
		System.out.println("합:" + sum);
		System.out.println("문자열:" + snumstr);
	
	    //Quiz-2
		//주민번호의 합을 구하세요
		String jumin = "123456-1234567";
		
		   int sum2 = 0;
		   for(int i = 0 ; i < jumin.length() ; i++){
			   String numstr = jumin.substring(i,i+1);
			   if(numstr.equals("-"))continue;
			   sum2+= Integer.parseInt(numstr);
		   }
		   System.out.println("주민번호합 :  " + sum2);
		  
	  
		   //주민번호의 합을 구하세요 _2
		   String jumin2 = jumin.replace("-", "");
		   String[] numarr = jumin2.split("");
		   int sum3 =0;
		   for(String i : numarr){
			   sum3 += Integer.parseInt(i);
		   }
		   System.out.println("주민번호합2 : " + sum3);
		
		   
		   //주민번호의 합을 구하세요 _3
		   String jumin4 = jumin.replace("-", "");
		   int sum4 = 0;
		   for(int i = 0; i < jumin4.length() ; i++){
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("주민번호합3 : " + sum4);
	
		   //foramt
		  //System.out.printf("%d-%s", 10,"A"); 
		   
		  //String 클래스 (foramt)함수
		  String str7 = String.format("%d-%s", 10,"AAA");
		  System.out.println(str7);
		  
		  //String 클래스 static : valueOf , format 함수들
	} 

}




