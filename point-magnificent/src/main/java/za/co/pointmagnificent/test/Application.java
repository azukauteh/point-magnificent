package za.co.pointmagnificent.test;
import  za.co.pointmagnificent.employee.Cashier;
import za.co.pointmagnificent.employee.Manager;
import za.co.pointmagnificent.tradingStock.Product;
import za.co.pointmagnificent.sales.Sales;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.util.InputMismatchException;

public class Application {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
Date date = new Date();
Sales sales = new Sales();
Cashier cashier = new Cashier();
Manager manager = new Manager();
Product product = new Product();
Product p1 = new Product();
Product p2 = new Product();
Product p3 = new Product();


p1.setRetailPrice(49.99);
p1.setTimeManufactured(09.50);
p1.setBestBefore("16 July 2019");
p1.setBarcode(123);
p1.setProductDescription("Eggs ritebrand 30 large");


p2.setRetailPrice(14.99);
p2.setTimeManufactured(09.50);
p2.setBestBefore("9 June 2019");
p2.setBarcode(1234);
p2.setProductDescription("Milk ritebrand 1 LITRE full cream");


p3.setRetailPrice(13.99);
p3.setTimeManufactured(09.50);
p3.setBestBefore("10 June 2019");
p3.setBarcode(12345);
p3.setProductDescription("Bread Albany Brown 600g");


int aa;
int press;
int n;
long bc1;
int abc;

Product inventories[]=new Product[n];

int r = 0;
while( r < 5){

System.out.println("\t\t\t\t>>>>>>>WELCOME TO POINTMAGNIFICENT SUPERMARKET>>>>>>>>>>>>>>>>             ");
System.out.println(" \t\t\t\t\t     763,madison view, Pretoria South Africa.                           ");
System.out.println("	   \t\t\t\t\t  Tel: 012 357 9856, Fax: 012 558 6698.                          ");
System.out.println("               \t\t\t\t\t   Email: info@pointmagnificent.com                       ");
System.out.println("");
System.out.println("\t\t\t>>>>>>>>>>>>>>>>>>>POINTMAGNICENT(employee registration)<<<<<<<<<<<<<<<<<<<<<");
System.out.println(date);

System.out.print("Press Enter KEY to continue ....");
scanner.nextLine();

         int a = 0;   
         int enterInput  = 0;                                              //Exceptions, the do,try and catch (NPE).
 
do  {
       try {
     scanner.nextLine();
     System.out.println("	            PRESS (1) TO REGISTER CASHIER...  ");
     System.out.println("                    PRESS (2) TO LOG-IN...             ");
     System.out.println("                    PRESS (3) TO REGISTER A MANAGER... ");

     enterInput= scanner.nextInt();
     a = 10;
 
       }  catch(InputMismatchException ex){
        System.out.println("INVALID INPUT TRY AGAIN");
          }

    } while(a < 5);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

             if(enterInput ==3) {


   scanner.nextLine();
 System.out.println("\t\tPLEASE FILL-IN YOUR DETAILS BELOW TO CONTINUE AS  MANAGER..");

                  scanner.nextLine();

System.out.println("ENTER NAME:");
manager.setName(scanner.nextLine());

System.out.println("ENTER SURNAME:");
manager.setSurname(scanner.nextLine());


System.out.println("ENTER ADDRESS:");
manager.setAddress(scanner.nextLine());


System.out.println("ENTER EMAIL:");
manager.setEmail(scanner.nextLine());


System.out.println("USERNAME: Manager");
manager.setUsername("Manager");

     int nn = 0;                                          
//////////////////////////////////////////////////  INPUTMISMATCH EXCEPTION  /////////////////////////////////////////////////
  
    do{
 
     try{
       scanner.nextLine();
       System.out.println("ENTER TELEPHONE:");
       manager.setTelephone(scanner.nextLong());
       nn  =10;
       }  catch(InputMismatchException ex){
          System.out.println("INVALID INPUT. TRY AGAIN");

          }
    }     while( nn < 5);

      int ff = 0;
       
    do {
  
     try {
     scanner.nextLine();
     System.out.println("ENTER ID NUMBER;");
     manager.setIdNumber(scanner.nextLong());
     ff =10;
         }   catch(InputMismatchException ex){
             System.out.println("INVALID INPUT. TRY AGAIN");
             }
    }        while( ff<5);
scanner.nextLine();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("ENTER PASSWORD :");
manager.setPassword(scanner.nextLine());

System.out.println("CONFIRM PASSWORD :"); 
manager.setConfirm(scanner.nextLine());
  
if( manager.getPassword().equalsIgnoreCase(manager.getPassword()) && manager.getConfirm().equalsIgnoreCase(manager.getPassword())) {
System.out.println("\t\t\t\t\tplease Wait while we process your Details........");

}
  
 else {
        System.out.println("\t\t\t\tPASSWORD DO NOT MATCH PLEASE TRY AGAIN!!!!!!");
    }


System.out.println("\t\t\t\t\t\tPLEASE CONFIRM YOUR DETAILS  TO CONTINUE....");
  
scanner.nextLine();

System.out.println("Name      :" + manager.getName());
System.out.println("Surname   :" + manager.getSurname());
System.out.println("Address   :" + manager.getAddress());
System.out.println("Email     :" + manager.getEmail());
System.out.println("Telephone :" + manager.getTelephone()); 
System.out.println("ID Number :" + manager.getIdNumber());
//System.out.println("PRETORIA:" + Pretoria);
System.out.println("USERNAME  :Manager");
System.out.println("PASSWORD  : **********");
//System.out.println("CONFIRM PASSWORD: *********");




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


             if(enterInput ==1) {


   scanner.nextLine();
 System.out.println("\t\tPLEASE FILL-IN YOUR DETAILS BELOW TO CONTINUE AS CASHIER..");

                  scanner.nextLine();

System.out.println("ENTER NAME:");
cashier.setName(scanner.nextLine());

System.out.println("ENTER SURNAME:");
cashier.setSurname(scanner.nextLine());

System.out.println("ENTER ADDRESS:");
cashier.setAddress(scanner.nextLine());


System.out.println("ENTER EMAIL:");
cashier.setEmail(scanner.nextLine());


System.out.println("ENTER NEW USERNAME:");
cashier.setUsername(scanner.nextLine());

     int asa = 0;                                          
//////////////////////////////////////////////////  INPUTMISMATCH EXCEPTION  /////////////////////////////////////////////////
  
    do{
 
     try{
       scanner.nextLine();
       System.out.println("ENTER TELEPHONE:");
       cashier.setTelephone(scanner.nextLong());
       asa  =10;
       }  catch(InputMismatchException ex){
          System.out.println("INVALID INPUT. TRY AGAIN");

          }
    }     while( asa < 5);

      int f = 0;
       
    do {
  
     try {
     scanner.nextLine();
     System.out.println("ENTER ID NUMBER;");
     cashier.setIdNumber(scanner.nextLong());
     f =10;
         }   catch(InputMismatchException ex){
             System.out.println("INVALID INPUT. TRY AGAIN");
             }
    }        while( f<5);
scanner.nextLine();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("ENTER PASSWORD :");
cashier.setPassword(scanner.nextLine());

System.out.println("CONFIRM PASSWORD :"); 
cashier.setConfirm(scanner.nextLine());
  
if( cashier.getPassword().equals(cashier.getConfirm()) && cashier.getConfirm().equals( cashier.getPassword() )) {
System.out.println("\t\t\t\t\tplease Wait while we process your Details........");
}
  
  else if (cashier.getPassword().equals(cashier.getConfirm()) && cashier.getConfirm().equals(cashier.getPassword())) {
        System.out.println("\t\t\t\tPASSWORD DO NOT MATCH PLEASE TRY AGAIN!!!!!!");
    
 } else {
        System.out.println("\t\t\t\tPASSWORD DO NOT MATCH PLEASE TRY AGAIN!!!!!!");
    }


System.out.println("\t\t\t\t\t\tPLEASE CONFIRM YOUR DETAILS  TO CONTINUE....");
  
scanner.nextLine();

System.out.println("NAME      : " + cashier.getName());
System.out.println("SURNAME   : " + cashier.getSurname());
System.out.println("ADDRESS   : " + cashier.getAddress());
System.out.println("EMAIL     : " + cashier.getEmail());
System.out.println("TELEPHONE : " + cashier.getTelephone()); 
System.out.println("ID NUMBER : " + cashier.getIdNumber());
//System.out.println("PRETORIA:" + Pretoria);
System.out.println("USERNAME  : " + cashier.getUsername());
System.out.println("PASSWORD  : **********");
//System.out.println("CONFIRM PASSWORD: *********");

   for (int i = 0; i < 1; i++) {
        int random = (int)(Math.random() * (20 + 1));
        System.out.println("NEW EMPLOYEE NUMBER :MAG200" + random);
    }

if(enterInput ==2){


}


System.out.println("\t\t\t\t\tCONGRATULATION YOUR REGISTRATION IS COMPLETED.........");
                        scanner.nextLine();            

System.out.println("\t\t\t\t\t\t\t........WELCOME : "+ cashier.getSurname());
                      System.out.println();
System.out.println("CASHIER -TELLER ");
System.out.println(date);



System.out.println("    		   PRESS ENTER TO LOGIN		");
String input = scanner.nextLine();
String Enter = input;

}
////////////////////////////////////////////  Do - While loop with if statements  /////////////////////////////////////////////////
int in=5;
 do{


    scanner.nextLine();
    Scanner input1 = new Scanner(System.in);
    System.out.println("ENTER USERNAME: ");
    String USERNAME = scanner.nextLine();

    Scanner input2 = new Scanner(System.in);
    System.out.println("ENTER PASSWORD : ");
    String PASSWORD = input2.next();

    if (USERNAME.equals(cashier.getUsername()) &&  PASSWORD.equals(cashier.getPassword())){

        System.out.println("\t\t\t\tACCESS GRANTED! WELCOME!");

        System.out.println("	WELCOME NEW cashier Teller " );
    }

else{

        System.out.println("Invalid Username or Password! try again, you have " +in+ " chances remaining" );          
        in--;
    }
 }  while(in > 0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("		       PRESS (1) TO SCAN PRODUCT");
System.out.println("                    PRESS (2) TO ADD-PRODUCT ");		        
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


System.out.print("Enter input:");
press = scanner.nextInt();

////////////////////////////////////////////////  PRODUCT ADDITION  ///////////////////////////////////////////////////
if(press ==2 ){

System.out.println("to Add products you need to enter the managers Password");



while(aa == 0){

System.out.println("Username: Manager");
System.out.print  ("Password: ");
String password2 = scanner.nextLine();
System.out.println();

if(password2 .equals(manager.getPassword())){

aa=1;
}

else{

System.out.println("incorrect password! you have two options");
System.out.println("PRESS THE  ctrl AND c to abort and start all over OR try again");
System.out.println();
}
}


do{
System.out.println("Enter the product's Name (eg. bread)                           :");
product.setProductName(scanner.nextLine());
System.out.println();

System.out.println("Enter the product's barcode  (eg. 97987125565781)              :");
product.setBarcode(scanner.nextLong());
System.out.println();

System.out.println("Enter the product's description  (eg. 700g Albany brown bread ):");
product.setProductDescription(scanner.nextLine());
System.out.println();

System.out.println("Enter the product's best before date  (eg. 12 May 2019)         :");
product.setBestBefore(scanner.nextLine());
System.out.println();


inventories[n]= product;
n++;


for(int cc=0; cc < n; cc++){
System.out.println("Press (1) to continue scan");
System.out.println("Press (2) to stop scanning");
int response0 =scanner.nextInt();

if(response0 == 1)
{}

else{
cc=n+1;
abc=1;
}
}

}while(abc==0);
}

}
System.out.println();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

if(press ==1){



for(int z=0; z<3; z++){
System.out.println("Enter Barcode");
  bc1 =scanner.nextLong();      

 if(bc1 == inventories[n--].getBarcode()){
 System.out.println("" + inventories[n--].getProductDescription() + "R" + inventories[n--].getRetailPrice());
 inventories[n--]=null;
 

 }

System.out.println("..........................");

for(int j=0; j<3; j++){
System.out.println("Press (1) to continue scan");
System.out.println("Press (2) to stop scanning");
int response0 =scanner.nextInt();

if(response0 == 1){

j=5;
}

if(response0 == 2){
j=5;
z=5;
}
}
}// the end of the barcode loop
int x=0;
int xx;


do{

sales.setTotal( inventories[x].getRetailPrice() + inventories[x+1].getRetailPrice() + inventories[x+2].getRetailPrice());
System.out.println(sales.getTotal());


System.out.println("..........................");


//System.out.print("DO  YOU WANT TO VOID AN ITEM? PRESS 2 TO VOID: ");
//int 

System.out.print("DO YOU WANT TO VOID AN ITEM? PRESS (2) TO VOID OR (3) TO CONTINUE : ");

int option2=scanner.nextInt();
	
if(option2==2){
	System.out.print("ENTER BARCODE OF ITEM YOU WISH TO VOID: ");
	long vd = scanner.nextLong();
	if(vd == p1.getBarcode()){
	sales.setTotal(inventories[x+1].getRetailPrice()*inventories[x+1].getQuantity() + inventories[x+2].getRetailPrice()*inventories[x+2].getQuantity());
	sales.setVat(p2.getRetailPrice()*p2.getQuantity()*0.15);
	inventories[n] = p1;
	}
	else if(vd == p2.getBarcode()){
	sales.setTotal( inventories[x].getRetailPrice()*inventories[x].getQuantity() + inventories[x+2].getRetailPrice()*inventories[x+2].getQuantity());
	sales.setVat( p1.getRetailPrice()*p1.getQuantity()*0.15);
	inventories[n+1] = p2;
	}
	else if(vd == p3.getBarcode()){
	sales.setTotal( inventories[x].getRetailPrice()*inventories[x].getQuantity() + inventories[x+2].getRetailPrice()*inventories[x+2].getQuantity());
	sales.setVat( p1.getRetailPrice()*inventories[x].getQuantity()*0.15+ inventories[x+2].getRetailPrice()*inventories[x+2].getQuantity()*0.15);
	inventories[n+2] = p3;
        }
}
}       while(xx == 0);

System.out.println("Enter cash amount: ");
sales.setCash(scanner.nextDouble());
System.out.println();

sales.setChange(sales.getCash() - sales.getTotal());

sales.setTotalVat( sales.getTotal()*0.15);


System.out.println();//skip 2 lines
System.out.println(">>>>>>>>>>>>POINT_MAGNIFICENT>>>>>>>>>>>>>>>>>");
System.out.println("\t\t.....RECIEPT....");
System.out.println("\t*****Madinson view******");
scanner.nextLine();
System.out.println("\t\tTel:012 357 9856.  ");
System.out.println("\t\tFax:012 357 9856. ");
System.out.println("\t\tslip number:4540149558.");
System.out.println("\t\t***GAU200422C***");
System.out.println();

System.out.println(inventories[x].getProductDescription() +"                   R" + inventories[x].getRetailPrice());


//if(bc1 == p2.barcode){

System.out.println(inventories[x+1].getProductDescription() +"                   R" + inventories[x+1].getRetailPrice());
//}

//if(bc1 == p3.barcode){

System.out.println(inventories[x+2].getProductDescription() +"                   R" + inventories[x+2].getRetailPrice());
//}

//if(bc1 == p1.barcode && bc1 == p2.barcode){

//total = p1.price + p2.price; 
//}

System.out.println("TOTAL R" + sales.getTotal());
System.out.println("CASH R" + sales.getCash());
System.out.println("CHANGE R" + sales.getChange());
System.out.println("TOTAL VAT R" + sales.getTotalVat());

System.out.println("........................TAX INVOICE............................");
System.out.println("VAT rate   excl.   TAX.      incl.");
System.out.println("15.00%      18.25    2.74     20.99A");
System.out.println("..................................................................");

System.out.println("Please keep your till slip as proof of purchase");
System.out.println("SLIP / TILL / CASHIER / DATE / TIME .");
System.out.println("7564    004     05" +        (date));
//System.out.println("CASHIER NAME : "+ Surname);
                          scanner.nextLine();
System.out.println("Thank you for Shopping with us at pointmagnificent Supermarket @ madison view..");
                          scanner.nextLine();
System.out.println("Trading Hours");
System.out.println("\tMon-Fri : 07H30-20H30");
System.out.println("\tSat : 07H30-20H30");
System.out.println("\tSun : 07H30-16H30");

System.out.println("\t\t\t\t\t\t\tPOINT-MAGNIFICENT");
System.out.println("\t\t\t\t\t\t\t|||||||||||||||||");
System.out.println("\t\t\t\t\t\t\t|||||||||||||||||");
System.out.println("\t\t\t\t\t\t\t2679055091835HYMM");


System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

scanner.nextLine();
System.out.println("\t\t\t\tNEXT CUSTOMER!!!!!");
System.out.println("PRESS (1) FOR NEXT CUSTOMER :");
System.out.println("PRESS (0) TO LOG OUT:");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.println(" \t\t\t\t*POINT-MAGNIFICENT inc.");
System.out.println(" \t\t\t*Version 2.7 powered by Gather-do Tec .");
System.out.println("\t\t\t*Team:Katlego,Josh,Thato,Azu.");
System.out.println("\t\t\t*THIS PROJECT IS DEDICATED TO MR KELVIN.");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
} 
else{
 r = 100;
}
}
}
}



































