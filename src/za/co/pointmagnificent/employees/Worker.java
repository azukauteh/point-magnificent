package za.co.pointmagnificent.employees;

  public abstract class Worker{

    private String name;
    private String surname;
    private String gender;
    private String dateOfBirth;
    private int telephoneNumber;
    private long idNumber;
    private String email;    
    private long employeeNumber;
   

    public void setName(String name){
        this.name = name;
}
    public String getName(){
    return name;
}

public void setSurname(String surname){
     this.surname = surname;
}
 public String getSurname(){
   return surname;
}

 public void setGender(String gender){
     this.gender = gender;
}
 public String getGender(){
     return this.gender;
}
public void setDateOfBirth(String dateOfBirth){
     this.dateOfBirth = dateOfBirth;
}
 public String getDateOfBirth(){
     return dateOfBirth;
}


public void setPhoneNumber(int phoneNumber){
     this.phoneNumber = phoneNumber;
}
 public int getPhoneNumber(){
return phoneNumber; 
}

public void setIdNumber(long idNumber){
this.idNumber = idNumber;
}

public long getIdNumber(){
     return idNumber;
}

public void setEmail(String email){
this.email = email;
}
public String getEmail(){
  return email;
}


public void setEmployeeNumber(long employeeNumber){
     this.employeeNumber = employeeNumber;
}
public long getEmployeeNumber(){
     return employeeNumber;
}




//methods

 public void purchase(){
}
 public void scanProduct(){
 }
 public void recievePayement(){
 }
 public void issueReciept(){
 }
public void cancelProduct(){
}


}
