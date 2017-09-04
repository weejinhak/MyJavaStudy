
public class Ex06_Opr {

	public static void main(String[] args) {
		int sum=0; //local variable (초기화)
		//sum = sum + 1;
		//줄임 : += , -= , *= ,/=
		sum+=1; //sum = sum + 1
		sum-=1; //sum = sum - 1
		
		//이상 , 이하 (= 포함)
		//초과 , 미만 
		
		//간단한 학점 계산기
		//학점이 90 점 이상이면 A 학점을 먼저 부여하고
		//부여된 학점이 95이상이면 A+
		//그나머지는 A-를 부여하세요
		
		//학점이 80 점 이상이면 B학점을 먼저 부여하고
		//부여된 학점이 85이상이면 B+
		//그나머지는 B-를 부여하세요
		
		int score = 83; //기준점수
		String grade=""; //문자열 초기화
		System.out.println("당신의 점수는:" + score);
		
		if(score >= 90){
			grade="A";
			if(score >= 95){
				//grade = grade + "+";
				grade+="+";
			}else{
				grade+="-";
			}
		}else if(score >= 80){
			grade="B";
			if(score >= 85){
				grade += "+";
			}else{
				grade += "-";
			}
		}else{
			grade="F";
		}
		
		System.out.println("당신의 학점은 "  + grade) ;

	
	
	}

}
