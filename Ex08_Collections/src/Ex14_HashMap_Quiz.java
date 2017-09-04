import java.util.HashMap;
import java.util.Scanner;

/*
 * HashMap 활용 
 * 회원 ID , PWD 
 * 
 * 
 * 
 * 
 */
public class Ex14_HashMap_Quiz {
	public static void main(String[] args) {
		//회원로그인 처리
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		//시스템에 로그인 (인증처리)
		//ID(0) , PWD(x)
		//ID(0) , PWD(0)
		
		//ID(x) , PWD(x)
		//ID(x) , PWD(0) 
		
		Scanner sc = new Scanner(System.in);
		//ID PWD console에서 입력 받아서 처리
		while(true){
					System.out.println("ID , PWD 입력해주세요");
					
					System.out.print("ID: ");
					String id = sc.nextLine().trim().toLowerCase();
					
					System.out.print("PWD: ");
					String pwd = sc.nextLine().trim();
					
					if(!loginmap.containsKey(id)){ //일치하는 ID가 없으면
						System.out.println("재입력 하세요");
						continue;
					}else{
						if(loginmap.get(id).equals(pwd)){
							System.out.println("로그인 방가방가^^");
							break;
						}else{
							System.out.println("패스워드 재입력");
						}
					}
		}
		
	}

}
