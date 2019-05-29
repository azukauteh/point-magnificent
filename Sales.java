package za.co.shoprite.sales;


public class Sales{

        public long barcode;
        public String nameOfproduct;
        public double retailPrice;
        public double vat;
        public double cash;
        public double total;
        public double change;
        public double totalVat;




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
