package za.co.pointmagnificent.tradingStock;

public class Product{

private double retailPrice; 
private int quantity;
private long barcode;
private String productDescription;
private double timeManufactured;
private String dateManufactured;
private String bestBefore;
   private String productName;


public void setProductName(String productName)
{

this.productName= productName;
}

public String getProductName()
{

return productName;
}

public void setRetailPrice(double retailPrice)
{

this.retailPrice =retailPrice;
}

public double getRetailPrice()
{

return retailPrice;
}


public void setQuantity(int quantity)
{

this.quantity =quantity;
}

public double getQuantity()
{

return quantity;
}

public void setBarcode(long barcode)
{

this.barcode= barcode;
}

public long getBarcode()
{

return barcode;
}

public void setProductDescription(String productDescription)
{

this.productDescription =productDescription;
}

public String getProductDescription()
{

return productDescription;
}

public void setTimeManufactured(double timeManufactured)
{

this.timeManufactured =timeManufactured;
}

public double getTimeManufactured()
{

return timeManufactured;
}
public void setBestBefore(String bestBefore)
{

this.bestBefore= bestBefore;
}

public String getBestBefore()
{

return bestBefore;
}



}

