package za.co.pointmagnificent.test;
import  za.co.pointmagnificent.employees.Cashier;
import za.co.pointmagnificent.employees.Manager;
import za.co.pointmagnificent.tradingStock.Product;
import za.co.pointmagnificent.sales.Sales;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class Application{

public static void main (String [] args){
Scanner scanner = new Scanner(System.in);
Date date = new Date();
Cashier cashier1 = new Cashier();
Manager manager = new Manager();
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
p1.productDescription="EGGS RITEBRAND LARGE 30s";


p2.retailPrice=(14.99);
p2.timeManufactured=0.0;
p2.dateManufactured=null;
p2.bestBefore=null;
p2.barcode=1234;
p2.productDescription="MILK RITEBRAND 1l F/CREAM";


p3.retailPrice=13.99;
p3.timeManufactured=0.0;
p3.dateManufactured=null;
p3.bestBefore=null;
p3.barcode=12345;
p3.productDescription="BROWN BREAD SUPERIOR 700G";

System.out.println("\t\t\t\t>>>>>>>WELCOME TO POINTMAGNIFICENT SUPERMARKET>>>>>>>>>>>>>>>>");
System.out.println(" \t\t\t\t\t     763 Madison View, Pretoria, South Africa");
System.out.println("	   \t\t\t\t\t  Tel: 012 357 9856, Fax: 012 558 6698");
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
cashier1.name = scanner.nextLine();

System.out.println("ENTER SURNAME:");
cashier1.surname = scanner.nextLine();

System.out.println("ENTER GENDER:");
cashier1.gender = scanner.nextLine();

System.out.println("ENTER ADDRESS:");
cashier1.address = scanner.nextLine();



System.out.println("ENTER EMAIL:");
cashier1.email = scanner.nextLine();



System.out.println("ENTER NEW USERNAME:");
String New = scanner.nextLine();



System.out.println("ENTER TELEPHONE:");
cashier1.telephoneNumber = scanner.nextLong();



System.out.println("ENTER ID NUMBER;");
cashier1.idNumber = scanner.nextLong();

scanner.nextLine();


System.out.println("ENTER PASSWORD :");
String password = scanner.nextLine();

System.out.println("CONFIRM PASSWORD :"); 
String Confirm = scanner.nextLine();
  
if( password.equals(password) && Confirm.equals(password)) {
System.out.println("\t\t\t\t\tplease Wait while we process your Details........");
}
  
  else if (password.equals(password) && Confirm.equals(password)) {
        System.out.println("\t\t\t\tPASSWORD DOES NOT MATCH PLEASE TRY AGAIN!!!!!!");
    
 } else {
        System.out.println("\t\t\t\tPASSWORD DOES NOT MATCH PLEASE TRY AGAIN!!!!!!");
    }


System.out.println("\t\t\t\t\t\tPLEASE CONFIRM YOUR DETAILS  TO CONTINUE....");
  
scanner.nextLine();

System.out.println("ENTER NAME :" + cashier1.name);
System.out.println("ENTER SURNAME :" + cashier1.surname);
System.out.println("ENTER GENDER :" + cashier1.gender);
System.out.println("ENTER ADDRESS :" + cahsier1.address);
System.out.println("ENTER EMAIL@ :" + cashier1.email);
System.out.println("ENTER TELEPHONE :" + cashier1.telephoneNumber); 
System.out.println("ENTER ID NUMBER :" + cashier1.idNumber);
//System.out.println("PRETORIA:" + Pretoria);
System.out.println("ENTER  NEW USERNAME :" + New);
System.out.println("ENTER PASSWORD : **********");
System.out.println("CONFIRM PASSWORD: *********");

   for (int i = 0; i < 1; i++) {
        int random = (int)(Math.random() * (20 + 1));
        System.out.println("NEW EMPLOYEE NUMBER :MAG200" + random);
    }





//System.out.println("NEW EMPLOYEE NUMBER :");


System.out.println("\t\t\t\t\tCONGRATULATIONS! YOUR REGISTRATION IS COMPLETED.........");
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
	System.out.print("Enter the quantity of products you want to purchase: ");
 	p1.quantity=scanner.nextInt();
	

 if(bc1 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice*p1.quantity);
 inventories[0]=null;
}

else if (bc1 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice*p2.quantity);
inventories[1]=null;
}

else if(bc1 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice*p3.quantity);
inventories[2]=null;
}

System.out.println("..........................");
        
System.out.println("Enter Barcode");
        long bc2 = scanner.nextLong();
	System.out.print("Enter the quantity of products you want to purchase: ");
	p2.quantity=scanner.nextInt();

 if(bc2 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice*p1.quantity);
 inventories[0]=null;
}
else if (bc2 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice*p2.quantity);
inventories[1]=null;
}

else if(bc2 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice*p3.quantity);
inventories[2]=null;
}

System.out.println("..........................");
        
System.out.println("Enter Barcode");
        long bc3 = scanner.nextLong();
	System.out.print("Enter the quantity of products you want to purchase: ");
	p3.quantity=scanner.nextInt();

 if(bc3 == p1.barcode){
 System.out.println(p1.productDescription + "R" + p1.retailPrice*p1.quantity);
 inventories[0]=null;
}
else if (bc3 == p2.barcode){
System.out.println(p2.productDescription + "R" + p2.retailPrice*p2.quantity);
inventories[1]=null;
}

else if(bc3 == p3.barcode){
System.out.println(p3.productDescription + "R" + p3.retailPrice*p3.quantity);
inventories[2]=null;
}

sales.total = p1.retailPrice*p1.quantity + p2.retailPrice*p2.quantity + p3.retailPrice*p3.quantity;
System.out.println(sales.total);

System.out.println("..........................");

System.out.print("DO TO YOU WANT TO VOID AN ITEM? PRESS 2 TO VOID OR 3 TO CONTINUE: ");
int option2=scanner.nextInt();
	if(option2==2){
	System.out.print("ENTER BARCODE OF ITEM YOU WISH TO VOID: ");
	long vd=scanner.nextLong();
	if(vd==p1.barcode){
	sales.total=p2.retailPrice*p2.quantity + p3.retailPrice*p3.quantity;
	sales.vat=p2.retailPrice*p2.quantity*0.15;
	inventories[0]=p1;
	}
	else if(vd==p2.barcode){
	sales.total=p1.retailPrice*p1.quantity + p3.retailPrice*p3.quantity;
	sales.vat=p1.retailPrice*p1.quantity*0.15;
	inventories[1]=p2;
	}
	else if(vd==p3.barcode){
	sales.total=p1.retailPrice*p1.quantity + p3.retailPrice*p3.quantity;
	sales.vat=p1.retailPrice*p1.quantity*0.15+p3.retailPrice*p3.quantity*0.15;
	inventories[2]=p3;
	}
}

System.out.println("enter cash amount: ");
sales.cash=scanner.nextDouble();




sales.change = sales.cash - sales.total;


sales.vat=p1.retailPrice*p1.quantity*0.15 + p2.retailPrice*p2.quantity*0.15;

System.out.println();//skip 2 lines
System.out.println(">>>>>>>>>>>>POINTMAGNIFICENT>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println("\t******Madison View********");
scanner.nextLine();
System.out.println("\t\tTel:012 357 9856.  ");
System.out.println("\t\tFax:012 357 9856. ");
System.out.println("\t\tVat:4540149558.");
System.out.println("\t\t***GAU200422C***");
System.out.println();
System.out.println(p1.productDescription + "R" + p1.retailPrice*p1.quantity);
System.out.println(p2.productDescription + "R" +  p2.retailPrice*p2.quantity);
System.out.println(p3.productDescription + "R" +  p3.retailPrice*p3.quantity);

System.out.println("TOTAL R" + sales.total);
System.out.println("CASH R" + sales.cash);
System.out.println("CHANGE R" + sales.change);
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







































