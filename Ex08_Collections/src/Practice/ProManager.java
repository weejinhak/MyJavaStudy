package Practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ProManager {
 
    private HashMap<String,Product> db;
    
    public ProManager(){
        db = new HashMap<>();
    }
    
    public void register(Product p){//product µî·Ï
        db.put(p.getBarcode(),p); //barcode register
    }
    
    public Product get(String barcode){
        Product pro = db.get(barcode);
        return pro;
    }
    
    public void remove(String barcode){
        db.remove(barcode);
    }
    
    public void modify(Product pro){
        db.put(pro.getBarcode(), pro);
    }
    
    public ArrayList<Product> get(){
        Set<String> keys = db.keySet();
        ArrayList<Product> plist = new ArrayList<>();
        for(String k : keys){
            plist.add(db.get(k));
        }
        return plist;
    }
 
}
 