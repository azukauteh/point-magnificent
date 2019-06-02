package za.co.shoprite.application;


import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;
import java.util.Date;
import za.co.shoprite.staff.Cashier;
import za.co.shoprite.tradingStock.Product;
import za.co.shoprite.tradingStock.Inventory;
import za.co.shoprite.sales.Sales;
import za.co.shoprite.staff.Manager;
import za.co.shoprite.primary.Manufacturing;
import za.co.shoprite.primary.Supplier;

public class Application{

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
Date d1 = new Date();

Manufacturing manufacturing = new Manufacturing();
Supplier supplier = new Supplier();
Inventory inventory = new Inventory();
Cashier cashier = new Cashier();
Sales sales = new Sales();

cashier.cashierName=null;
cashier.cashierPassword=null;


	Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();


Product inventories[]=new Product[3];
inventories[0]=p1;
inventories[1]=p2;
inventories[2]=p3;

p1.retailPrice=0.0;
p1.timeManufactured=0.0;
p1.dateManufactured=null;
p1.bestBefore=null;
p1.barcode=0;
p1.productDescription=null;


p2.retailPrice=0.0;
p2.timeManufactured=0.0;
p2.dateManufactured=null;
p2.bestBefore=null;
p2.barcode=0;
p2.productDescription=null;


p3.retailPrice=0.0;
p3.timeManufactured=0.0;
p3.dateManufactured=null;
p3.bestBefore=null;
p3.barcode=0;
p3.productDescription=null;


sales.total=p1.retailPrice + p2.retailPrice + p3.retailPrice;

Manager manager = new Manager();
manager.managerName=null;
manager.managerPassword=null;

System.out.println("Welcome, press 1 to Sign up, or 2 to Log in");
int welcome = scanner.nextInt();

if(welcome == 1){
System.out.println("*****************SIGN UP*************");
scanner.nextLine();
System.out.println("ENTER NAME AND SURNAME");
String names = scanner.nextLine();

System.out.println("ENTER PREFFERED USERNAME");
String prefName = scanner.nextLine();

System.out.println("ENTER PREFFERED PASSWORD");
int prefPassword = scanner.nextInt();

System.out.println("CONFIRM SIGN IN PASSWORD");
int confirmPrefPassword = scanner.nextInt();

if(prefPassword == confirmPrefPassword){
System.out.println("THANK YOU FOR SIGNING UP, YOU MAY NOW CONTINUE WITH LOGIN.");
}
}


System.out.println("****************************LOGIN*************************");
scanner.nextLine();
System.out.println("ENTER YOUR NAME :");
String cashierName= scanner.nextLine();

System.out.println("ENTER YOUR NEW PASSWORD :");
String cashierPassword= scanner.nextLine();

System.out.println("CONFIRM YOUR NEW PASSWORD");
String confirmedPassword=scanner.nextLine();

if(cashierPassword == confirmedPassword){
System.out.println("ACCESS GRANTED");
}
System.out.println();//skip 4 lines

System.out.println("*************************SALES***********************");
        scanner.nextLine();


	System.out.println("Enter Barcode");
        long bc1 = scanner.nextLong();

 if(bc1 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice);
 inventories[0]=null;
}
else if (bc1 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice);
inventories[1]=null;
}

else if(bc1 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice);
inventories[2]=null;
}

        System.out.println("Enter Barcode");
        long bc2 = scanner.nextLong();

 if(bc2 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice);
 inventories[0]=null;
}
else if (bc2 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice);
inventories[1]=null;
}

else if(bc2 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice);
inventories[2]=null;
}

        System.out.println("Enter Barcode");
        long bc3 = scanner.nextLong();

 if(bc3 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice);
 inventories[0]=null;
}
else if (bc3 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice);
inventories[1]=null;
}

else if(bc3 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice);
inventories[2]=null;
}

System.out.println(sales.total);


System.out.println("enter cash amount");
sales.cash=scanner.nextDouble();
System.out.println(sales.cash);



sales.changeCalculator();

sales.vat=p2.retailPrice*0.15 + p3.retailPrice*0.15;

System.out.println();//skip 2 lines
System.out.println("********************SHOPRITE***************************");

System.out.println("*******Shoprite Acardia********");

System.out.println(" Tel no.  012 2011163");
System.out.println("********GAU200422C*******");

System.out.println(p1.productDescription + "R" + p1.retailPrice);
System.out.println(p2.productDescription + "R" + p2.retailPrice);
System.out.println(p3.productDescription + "R" + p3.retailPrice);

System.out.println("TOTAL R" + sales.total);
System.out.println("CASH R" + sales.cash);
System.out.println("CHANGE R" + sales.change);
System.out.println("VAT R" + sales.vat);

System.out.println("Please keep your till slip as proof of purchase");

System.out.println(d1);



System.out.println();//skip 2 lines

System.out.println("PRESS 1 TO LOG OUT OF SYSTEM, OR 2 TO CONTINUE.");
int logOutAnswer = scanner.nextInt();

if(logOutAnswer == 1){
scanner.nextLine();
System.out.println("enter password");
String logOutPassword = scanner.nextLine();
scanner.nextLine();
if(logOutPassword ==cashierPassword){
scanner.nextLine();
System.out.println("Goodbye");
System.out.println("*************GOODBYE**************");
} 
}


}
}


