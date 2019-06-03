package za.co.pointmagnificent.test;
import  za.co.pointmagnificent.employee.Cashier;
import za.co.pointmagnificent.employee.Manager;
import za.co.pointmagnificent.tradingStock.Product;
import za.co.pointmagnificent.sales.Sales;
import java.util.Scanner;
import java.util.Date;
public class Application{

public static void main (String [] args){
Scanner scanner = new Scanner(System.in);
Date date = new Date();
Sales sales = new Sales();
Product product = new Product();
Product p1 = new Product();
Product p2 = new Product();
Product p3 = new Product();

Product inventories[]=new Product[3];
inventories[0]=p1;
inventories[1]=p2;
inventories[2]=p3;

p1.retailPrice=49.99;
p1.timeManufactured=09.50;
p1.dateManufactured="3 June 2019";
p1.bestBefore="16 July 2019";
p1.barcode=123;
p1.productDescription="Eggs ritebrand 30 large";


p2.retailPrice=14.99;
p2.timeManufactured=09.50;
p2.dateManufactured="3 June 2019";
p2.bestBefore="9 June 2019";
p2.barcode=1234;
p2.productDescription="Milk ritebrand 1 LITRE full cream";


p3.retailPrice=13.99;
p3.timeManufactured=09.50;
p3.dateManufactured="3 June 2019";
p3.bestBefore="10 June 2019";
p3.barcode=12345;
p3.productDescription="Bread Albany Brown 600g";

System.out.println("\t\t\t\t>>>>>>>WELCOME TO POINTMAGNIFICENT SUPERMARKET>>>>>>>>>>>>>>>>");
System.out.println(" \t\t\t\t\t     763,madison view, Pretoria South Africa.");
System.out.println("	   \t\t\t\t\t  Tel: 012 357 9856, Fax: 012 558 6698.");
System.out.println("               \t\t\t\t\t   Email: info@pointmagnificent.com");
System.out.println("");

System.out.println("    		   PRESS ENTER TO LOGIN		");
String input = scanner.nextLine();
String Enter = input;

//Cashier loggin
 
String Username;
 String Password;

    Password = "123";
    Username = "katlego";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("\t\t\t\tACCESS GRANTED! WELCOME!");

System.out.println("	WELCOME KATLEGO(cashier Teller 01");


    }


    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }



System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("		       PRESS (1) TO SCAN PRODUCT");
System.out.println("		       PRESS (2) To VOID PRODUCT");
System.out.println("		       PRESS (3) TO log-out");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


System.out.print("Enter input:");
int press = scanner.nextInt();
if(press ==1){
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
System.out.println("..........................");
        
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

System.out.println("..........................");
        
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

double total = p1.retailPrice + p2.retailPrice + p3.retailPrice;
System.out.println(total);

System.out.println("..........................");

System.out.println("enter cash amount");
sales.cash=scanner.nextDouble();




double change = sales.cash - total;


sales.vat=p2.retailPrice*0.15 + p3.retailPrice*0.15;

System.out.println();//skip 2 lines
System.out.println(">>>>>>>>>>>>POINTMAGNIFICENT>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("\t******Madinson view********");
scanner.nextLine();
System.out.println("\t\tTel no.012 357 9856.  ");
System.out.println("\t\t***GAU200422C***");
System.out.println();
System.out.println(p1.productDescription + "R" + p1.retailPrice);
System.out.println(p2.productDescription + "R" +  p2.retailPrice);
System.out.println(p3.productDescription + "R" +  p3.retailPrice);

System.out.println("TOTAL R" + total);
System.out.println("CASH R" + sales.cash);
System.out.println("CHANGE R" + change);
System.out.println("VAT R" + sales.vat);

System.out.println("Please keep your till slip as proof of purchase");

System.out.println(date);



System.out.println();//skip 2 lines
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

} 
}




}


































