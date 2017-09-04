import java.util.ArrayList;

class Empdata{
	private ArrayList elist;
	private int[] numbers;
	
	public Empdata(){
		this.elist = new ArrayList();
		this.numbers = new int[10];
	}
	
	//elist (getter , setter) 함수
	//       getElist  setElist
	
	//numbers(getter , setter) 함수
	//       getNumbers   setNumbers
	public void setNumbers(int[] numbers){
		this.numbers = numbers;
	}
	public int[] getNumbers(){
		return numbers;
	}
	
	//ArrayList 도 타입니다
	public void setElist(ArrayList elist){
		this.elist = elist;
	}
	public ArrayList getElist(){
		return this.elist;
	}
}


public class Ex05_ArrayList_Variable {

	public static void main(String[] args) {
		Empdata empdata = new Empdata();
		ArrayList arrlist = new ArrayList();
		arrlist.add("홍길동");
		empdata.setElist(arrlist);
		
		
		ArrayList relist = empdata.getElist();
		System.out.println(relist.get(0).toString());
		System.out.println(arrlist.equals(relist));
		
	}

}
