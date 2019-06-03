package za.co.shoprite.application;

import java.util.Scanner;
import java.util.Date;
import za.co.shoprite.tradingStock.Product;
import za.co.shoprite.tradingStock.Inventory;
import za.co.shoprite.primary.Manufacturer;
import za.co.shoprite.primary.Supplier;
import za.co.shoprite.sales.Sales;
import za.co.shoprite.employee.StoreManager;
import za.co.shoprite.employee.Cashier;

public class App
{

 public static void main(String args [] )
 {

int A=5;
double password;
String username;


Scanner scanner= new Scanner(System.in);
Date date= new Date();
Manufacturer manufacturer =new Manufacturer();
Supplier supplier= new Supplier();
Cashier cashier= new Cashier();
Inventory inventory = new Inventory();
StoreManager storeManager= new StoreManager();
Sales sales= new Sales();
Product p1= new Product();
Product p2= new Product();
Product p3= new Product();
Product p4= new Product();
Product p5= new Product();
Product p6= new Product();
Product p7= new Product();
Product p8= new Product();
Product inventories []= new Product[8];

System.out.println("                <<<<  Welcome to our POINT OF SALES SYSTEM   >>>>                ");
System.out.println();
System.out.println();
System.out.println("                           <<<<   LOGIN MENU   >>>>                              ");
System.out.println();
System.out.println();
System.out.print("would please enter your registered username: ");
     username= scanner.nextLine();
System.out.println();
System.out.print("Now "+username+" please proceed by entering your password : " );
     password= scanner.nextDouble();

for(int a=-1; a<A ;a++)
{
 if(password != cashier.password)
 {

  System.out.print("Now "+username+" please proceed by entering your password : " );
  password= scanner.nextDouble();

  System.out.println("Re-enter your password you have "+A+" chance(s) remaining");
  System.out.println();
  A--;


  if(A == 2)
  {

  System.out.println();  }

  else if(A == 1)
  {
 System.out.println("Re-enter your password you have "+A+" chance(s) remaining");
 System.out.println();
 A--;
  System.out.print("you are just playing here, if you miss the next chance, Sorry for you");

  System.out.print("You, "+username+" have just Spoiled this System. Just call the manager");
  }

 }// if password is incorrect statement //

}
 if(password == cashier.password)
 {
 System.out.println("Welcome "+username+" you now have access to this system");

 }


p1.setProductDescription("750g Albany brown Bread");
p1.setBarcode(123456789L);
p1.setRetailPrice(14.99);
p1.setProductQuantity(2);

p2.setProductDescription("1 Litre Ritebrand long life milk");
p2.setBarcode(987654321L);
p2.setRetailPrice(12.99);
p2.setProductQuantity(2);

p3.setProductDescription("30 large Ritebrand eggs");
p3.setBarcode(246813579L);
p3.setRetailPrice(44.99);
p3.setProductQuantity(2);


inventories[0] =p1;
inventories[1] =p2;
inventories[2] =p3;






 }

}
