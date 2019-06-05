package za.co.pointmagnificent.test;
import  za.co.pointmagnificent.employee.Cashier;
import za.co.pointmagnificent.employee.Manager;
import za.co.pointmagnificent.tradingStock.Product;
import za.co.pointmagnificent.sales.Sales;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
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
p1.timeManufactured=0.0;
p1.dateManufactured=null;
p1.bestBefore=null;
p1.barcode=123;
p1.productDescription="Eggs ritebrand 30 large";


p2.retailPrice=14.99;
p2.timeManufactured=0.0;
p2.dateManufactured=null;
p2.bestBefore=null;
p2.barcode=1234;
p2.productDescription="Milk ritebrand 1 LITRE full cream";


p3.retailPrice=13.99;
p3.timeManufactured=0.0;
p3.dateManufactured=null;
p3.bestBefore=null;
p3.barcode=12345;
p3.productDescription="Bread Albany Brown 600g";

System.out.println("\t\t\t\t>>>>>>>WELCOME TO POINTMAGNIFICENT SUPERMARKET>>>>>>>>>>>>>>>>");
System.out.println(" \t\t\t\t\t     763,madison view, Pretoria South Africa.");
System.out.println("	   \t\t\t\t\t  Tel: 012 357 9856, Fax: 012 558 6698.");
System.out.println("               \t\t\t\t\t   Email: info@pointmagnificent.com");
System.out.println("");

//scanner.nextLine();

System.out.println("\t\t\t>>>>>>>>>>>>>>>>>>>POINTMAGNICENT(employee registration)<<<<<<<<<<<<<<<<<<<<<");
System.out.println(date);

System.out.print("Press Enter KEY to continue ....");
String Press = scanner.nextLine();

System.out.println("	          PRESS (1) TO REGISTER CASHIER...");
//System.out.println("		        PRESS (2) TO REGISTER MANAGER...");


//scanner.nextLine();
//REGISTRATION CASHIER.
System.out.print("Enter input:");
int enterInput= scanner.nextInt();
if(enterInput ==1){

scanner.nextLine();
System.out.println("\t\tPLEASE FILL-IN YOUR DETAILS BELOW TO CONTINUE AS CASHIER..");

                  scanner.nextLine();

System.out.println("ENTER NAME:");
String Name = scanner.nextLine();

System.out.println("ENTER SURNAME:");
String Surname = scanner.nextLine();

System.out.println("ENTER GENDER:");
String Gender = scanner.nextLine();

System.out.println("ENTER ADDRESS:");
String Address = scanner.nextLine();



System.out.println("ENTER EMAIL:");
String Email = scanner.nextLine();



System.out.println("ENTER NEW USERNAME:");
String New = scanner.nextLine();



System.out.println("ENTER TELEPHONE:");
long telephone = scanner.nextLong();



System.out.println("ENTER ID NUMBER;");
long id = scanner.nextLong();

scanner.nextLine();


System.out.println("ENTER PASSWORD :");
String password = scanner.nextLine();

System.out.println("CONFIRM PASSWORD :"); 
String Confirm = scanner.nextLine();
  
if( password.equals(password) && Confirm.equals(password)) {
System.out.println("\t\t\t\t\tplease Wait while we process your Details........");
}
  
  else if (password.equals(password) && Confirm.equals(password)) {
        System.out.println("\t\t\t\tPASSWORD DO NOT MATCH PLEASE TRY AGAIN!!!!!!");
    
 } else {
        System.out.println("\t\t\t\tPASSWORD DO NOT MATCH PLEASE TRY AGAIN!!!!!!");
    }


System.out.println("\t\t\t\t\t\tPLEASE CONFIRM YOUR DETAILS  TO CONTINUE....");
  
scanner.nextLine();

System.out.println("ENTER NAME :" + Name);
System.out.println("ENTER SURNAME :" + Surname);
System.out.println("ENTER GENDER :" + Gender);
System.out.println("ENTER ADDRESS :" + Address);
System.out.println("ENTER EMAIL@ :" + Email);
System.out.println("ENTER TELEPHONE :" + telephone); 
System.out.println("ENTER ID NUMBER :" + id);
//System.out.println("PRETORIA:" + Pretoria);
System.out.println("ENTER  NEW USERNAME :" + New);
System.out.println("ENTER PASSWORD : **********");
System.out.println("CONFIRM PASSWORD: *********");

   for (int i = 0; i < 1; i++) {
        int random = (int)(Math.random() * (20 + 1));
        System.out.println("NEW EMPLOYEE NUMBER :MAG200" + random);
    }





//System.out.println("NEW EMPLOYEE NUMBER :");


System.out.println("\t\t\t\t\tCONGRATULATION YOUR REGISTRATION IS COMPLETED.........");
                        scanner.nextLine();            

System.out.println("\t\t\t\t\t\t\t........WELCOME : "+ Surname);
                      System.out.println();
System.out.println("CASHIER -TELLER ");
System.out.println(date);



System.out.println("    		   PRESS ENTER TO LOGIN		");
String input = scanner.nextLine();
String Enter = input;

}




     if(enterInput !=1){
        System.out.println("Invalid input!");
    } else if (enterInput !=1) {
  //  } else {
    //    System.out.println("INVALID INPUT");
 
}

 System.out.println("PLEASE ENTER ctrl c TO ABORT & CONTINUE....."); 
String To = scanner.nextLine();


//System.out.println("INVALID INPUT");
//Cashier loggin
 
String USERNAME;
 String PASSWORD;

    PASSWORD = "password";
    USERNAME = "New";

    Scanner input1 = new Scanner(System.in);
    System.out.println("ENTER USERNAME: ");
    String username = scanner.nextLine();

    Scanner input2 = new Scanner(System.in);
    System.out.println("ENTER PASSWORD : ");
    String password = input2.next();

    if (USERNAME.equals(USERNAME) &&  PASSWORD.equals(password)){

        System.out.println("\t\t\t\tACCESS GRANTED! WELCOME!");

System.out.println("	WELCOME NEW cashier Teller " );


    }


     if (USERNAME != username) {
        System.out.println("Invalid USERNAME!");
    } else if (PASSWORD != password) {
        System.out.println("Invalid PASSWORD!");
    } else {
        System.out.println("Invalid Username & Password!");
 
   //Thread t = new Thread() {
     //public void run() {             
       //  String[] args = { };
         //password.main(args);     
     }  
//};  
//t.start(); 
//}
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
System.out.println("\t\tTel:012 357 9856.  ");
System.out.println("\t\tFax:012 357 9856. ");
System.out.println("\t\tVat:4540149558.");
System.out.println("\t\t***GAU200422C***");
System.out.println();
System.out.println(p1.productDescription + "R" + p1.retailPrice);
System.out.println(p2.productDescription + "R" +  p2.retailPrice);
System.out.println(p3.productDescription + "R" +  p3.retailPrice);

System.out.println("TOTAL R" + total);
System.out.println("CASH R" + sales.cash);
System.out.println("CHANGE R" + change);
System.out.println("VAT R" + sales.vat);

System.out.println("........................TAX INVOICE............................");
System.out.println("VAT rate   excl.   TAX.      incl.");
System.out.println("15.00%      18.25    2.74     20.99A");
System.out.println("..................................................................");

System.out.println("Please keep your till slip as proof of purchase");
System.out.println("SLIP / TILL / CASHIER / DATE / TIME .");
System.out.println("7564    004     05" +        (date));
//System.out.println("CASHIER NAME : "+ Surn);
                          scanner.nextLine();
System.out.println("Thank you for Shopping with us at pointmagnificent Supermarket @ madison view..");
                          scanner.nextLine();
System.out.println("\t\tTrading Hours");
System.out.println("\tMon-Fri : 07H30-20H30");
System.out.println("\tSat : 07H30-20H30");
System.out.println("\tSun : 07H30-16H30");


System.out.println();//skip 2 lines
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println(" \t\t\t\t*POINT-MAGNIFICENT inc.");
System.out.println(" \t\t\t*Version 2.7 powered by Gather-do Tec .");
System.out.println("\t\t*Team:Katlego,Josh,Thato,Azu.");
System.out.println("\t\t\t*THIS PROJECT IS DEDICATED TO MR KELVIN.");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
} 
}
}







































