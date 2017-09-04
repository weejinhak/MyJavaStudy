package kr.or.kosta;

public class Book {
	private String bname;
	private int price;
	
	
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//public Book(){}
	//오버로딩 생성자가 하나라도 존재 한다면
	//default 생성자는 구현여부
	public Book(String name , int money){
		bname = name;
		price = money;
	}
	
	public void print(){
		System.out.println(bname + "/" + price);
	}
}
