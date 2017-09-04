package kr.or.kosta;

import java.io.Serializable;

//��ü ���
//��Ʈ��ũ ���� , ���ϰ��� , ���μ������� 
//����ȭ (��ü�� �����ؼ� ���� ������ ������ ����)
//������ȭ(��ü�� �����ϴ� ����)

//���Ͽ� ��ü�� write
//�� ���Ͽ��� ��ü�� read

//���� ���� : implements Serializable

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
