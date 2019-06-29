package za.co.pointmagnificent.employee;

  public abstract class Worker{

    private String name;
    private String surname;
    private String dateOfBirth;
    private long phoneNumber;
    private long idNumber;
    private String email;    
    private long employeeNumber;
    private String confirm;
    private String username;
    private String password;
    private String address;

////////////////////////////////////////////////////  Getters and Setters  ///////////////////////////////////////////////////////////
    public void setAddress(String address){
        this.address= address;
}
    public String getAddress(){
      return address;
}

    public void setConfirm(String confirm){
        this.confirm =confirm;
}
    public String getConfirm(){
      return confirm;
}

    public void setUsername(String username){
        this.username =username;
}
    public String getUsername(){
      return username;
}

    public void setPassword(String password){
        this.password =password;
}
    public String getPassword(){
      return password;
}

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

public void setDateOfBirth(String dateOfBirth){
     this.dateOfBirth = dateOfBirth;
}
 public String getDateOfBirth(){
     return dateOfBirth;
}


public void setTelephone(long phoneNumber){
     this.phoneNumber = phoneNumber;
}
 public long getTelephone(){
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////// Things a Worker can do ( Methods )  //////////////////////////////////////////////////

public void purchase(){}

public void scanProduct(){}

public void recievePayement(){}

public void issueReciept(){}

public void cancelProduct(){}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}