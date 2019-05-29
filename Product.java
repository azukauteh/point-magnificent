package za.co.shoprite.tradingStock;

public class Product
{

private double price; 
private String name;
private long barcode;
private String productDescription;


 public void setPrice(double price)
 { 
 
 this.price =price;
 } 

 public void setName(String name)
 {

 this.name=name;
 }

 public void setBarcode(long barcode)
 {

 this.barcode=barcode;
 }

 public void setProductDescription(String productDescription)
 {

 this.productDescription= productDescription;
 }

 public double getPrice()
 {
 
 return price; 
 } 
 
 public String getName()
 {

 return name;
 }

 public long getBarcode()
 {

 return barcode;
 }

 public String getProductDescription()
 {

 return productDescription;
 }

}
