package za.co.pointmagnificent.sales;


public class Sales{

        private double retailPrice;
        private double vat;
        private double cash;
        private double total;
        private double change;
        private double totalVat;

public void setVat(double vat)
{

this.vat =vat;
}

public double getVat()
{

return vat;
}

public void setRetailPrice(double retailPrice)
{

this.retailPrice= retailPrice;
}

public double getRetailPrice()
{

return retailPrice;
}

public void setCash(double cash)
{

this.cash =cash;
}

public double getCash()
{

return cash;
}

public void setChange(double change)
{

this.change= change;
}

public double getChange()
{

return change;
}

public void setTotalVat(double totalVat)
{

this.totalVat= totalVat;
}

public double getTotalVat()
{

return totalVat;
}

public void setTotal(double total)
{

this.total= total;
}

public double getTotal()
{

return total;
}

public Sales(){}


public double vatCalculator(){
vat= retailPrice*0.15;
totalVat= retailPrice-vat;
return totalVat;
}
public double changeCalculator(){
change=cash-total;


return change;

}
}

