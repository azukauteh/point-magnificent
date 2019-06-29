
public class Company{


public registerEmployee(
System.out.println("\t\t\t\t>>>>>>>WELCOME TO POINTMAGNIFICENT SUPERMARKET>>>>>>>>>>>>>>>>");
System.out.println(" \t\t\t\t\t     763,madison view, Pretoria South Africa.");
System.out.println("	   \t\t\t\t\t  Tel: 012 357 9856, Fax: 012 558 6698.");
System.out.println("               \t\t\t\t\t   Email: info@pointmagnificent.com");
System.out.println("");

//scanner.nextLine();

System.out.println("\t\t\t>>>>>>>>>>>>>>>>>>>POINTMAGNICENT(employee registration)<<<<<<<<<<<<<<<<<<<<<");
System.out.println(date);

System.out.print("Press Enter KEY to continue ....");
scanner.nextLine();




//scanner.nextLine();

           
 int a = 0;   
int enterInput  = 0;                                              //Exceptions, the do,try and catch (NPE).
do  {
         try {
     scanner.nextLine();
System.out.println("	            PRESS (1) TO REGISTER CASHIER...");
System.out.println("		        PRESS (2) TO LOG-IN...");

enterInput= scanner.nextInt();
a = 10;
 
}catch(InputMismatchException ex){
System.out.println("INVALID INPUT TRY AGAIN");
 }

} while(a < 5);

if(enterInput ==1) {


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

int n = 0;
long telephone = 0;
do{
try{
scanner.nextLine();
System.out.println("ENTER TELEPHONE:");
 telephone = scanner.nextLong();
n  =10;
}catch(InputMismatchException ex){
System.out.println("INVALID INPUT. TRY AGAIN");

}
}while( n < 5);
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

System.out.println("NAME :" + Name);
System.out.println("SURNAME :" + Surname);
System.out.println("GENDER :" + Gender);
System.out.println("ADDRESS :" + Address);
System.out.println("EMAIL :" + Email);
System.out.println("TELEPHONE :" + telephone); 
System.out.println("ID NUMBER :" + id);
//System.out.println("PRETORIA:" + Pretoria);
System.out.println("USERNAME :" + New);
System.out.println("PASSWORD : **********");
//System.out.println("CONFIRM PASSWORD: *********");

   for (int i = 0; i < 1; i++) {
        int random = (int)(Math.random() * (20 + 1));
        System.out.println("NEW EMPLOYEE NUMBER :MAG200" + random);
    }
}