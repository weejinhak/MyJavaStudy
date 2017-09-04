package kr.or.kosta;

import java.io.Serializable;

//객체 통신
//네트워크 간에 , 파일간에 , 프로세스간에 
//직렬화 (객체를 분해해서 줄을 세워서 보내는 과정)
//역직렬화(객체를 조립하는 과정)

//파일에 객체를 write
//그 파일에서 객체를 read

//전제 조건 : implements Serializable

public class UserInfo implements Serializable {
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo(){}
	public UserInfo(String name, String pwd , int age){
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
}
