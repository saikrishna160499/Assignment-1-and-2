package demo1;

public class Product {
	private String productCode;
	private String productName;
    private double productPrice;
    private char categoryCode;
    public Product(String initCode,String initName,double initPrice,char initCategory)
    {
    	productCode=initCode;
    	productName=initName;
    	productPrice=initPrice;
    	categoryCode=initCategory;
    }
    public String productCode()
    {
    	return productCode;
    }
    
}
