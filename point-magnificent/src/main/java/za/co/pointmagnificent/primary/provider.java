package za.co.pointmagnificent.primary;

public abstract class Provider{

private String name;
private String address;
private long contactNumber;

public void setName(String name){
	this.name=name;
	}

public String getName(){
	return this.name;
	}

public void setAddress(String address){
	this.address=address;
	}

public String getAddress(){
	return this.address;
	}

public void setContactNumber(long contactNumber){
	this.contactNumber=contactNumber;
	}

public long getContactNumber(){
	return this.contactNumber;
	}

public abstract void createProduct();

public String toString(){
return "Name: " + this.name + "Address: " + this.address + "Contact Number: " + this.contactNumber;
}

public boolean equals(Object p){
	if(p instanceof Provider){
	Provider provider=(Provider) p;
	if(provider.getName()==this.name){
	return true;
	}
return false;
}	
return false;
}

}

