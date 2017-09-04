package Practice;
public class Product {
    private String barcode;
    private String name;
 
    public String getBarcode() {
        return barcode;
    }
 
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Product(String barcode, String name) {
        super();
        this.barcode = barcode;
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "ProManager [barcode=" + barcode + ", name=" + name + "]";
    }
 
}