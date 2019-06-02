package za.co.pointmagnificent.test;
//import  za.co.pointmagnificent.employee;
//import za.co.pointmagnificent.employee.Worker;
import java.util.Scanner;
public class Application{

public static void main (String [] args){
Scanner scanner = new Scanner(System.in);



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
    Username = "katelego";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("\t\t\t\tACCESS GRANTED! WELCOME!");

System.out.println("	WELCOME KATELEGO(cashier Teller 01");


    }


    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }


System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("		       Press (1) to Scan Product");
System.out.println("		       Press (2) to Receive payment");
System.out.println("		       Press (3) to Issue Receipt");
System.out.println("		       Press (4) to log-Out");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
}
}

//Manager

/*String Username;
 String Password;

    Password = "1234";
    Username = "prince";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("\t\t\t\tACCESS GRANTED! WELCOME!");


System.out.println("	WELCOME PRINCE(floor Manager )");



    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }



System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("		       Press (1) to void Product");
System.out.println("		       Press (2) to Receive Product");












}

*/





















