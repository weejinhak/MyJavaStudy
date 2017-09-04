import java.util.ArrayList;

//Cart 기능 (ArrayList)
class Product{}

class Tv extends Product{
	//@Override
	//public String toString(){
	//	return "Tv";
	//}
}

class Audio extends Product{
	@Override
	public String toString(){
		return "Audio";
	}
}

class NoteBook {
	@Override
	public String toString(){
		return "NoteBook";
	}
}

public class Ex08_Generic_ArrayList {
	public static void main(String[] args) {
		
	  //Cart
	  Product[] parray = {new Tv(), new Audio()};
	  //,new NoteBook()};
	  
	  //Cart (ArrayList 설계하세요)
	  ArrayList<Product> cartlist = new ArrayList<>();
	  cartlist.add(new Tv());
	  cartlist.add(new Audio());
	  //cartlist.add(new NoteBook());
	  for(Product pro : cartlist){
		  System.out.println(pro.toString());
	  }
	  
	}
}
