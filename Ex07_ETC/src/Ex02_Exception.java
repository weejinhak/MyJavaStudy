public class Ex02_Exception {
	public static void main(String[] args) {
		int num =100;
		int result = 0;
		
		
		
		try{
			for(int i = 0; i < 10 ; i++){
				result = num/(int)(Math.random()*10);//0~9
				System.out.println("결과 : " +  result);
			}
		}catch(ArithmeticException e){
			//하위 예외를 앞에 배치
			System.out.println("연산예외 :" + e.getMessage());
		}catch(IndexOutOfBoundsException e){
			System.out.println("index :" + e.getMessage() );
		}catch(Exception e){
			
		}
		
		
		System.out.println("MAIN 함수 END");
	}

}
