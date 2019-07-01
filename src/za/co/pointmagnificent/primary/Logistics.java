package za.co.pointmagnificent.primary;

public class Logistics{

private long contactNumber;

public void setContactNumber(long contactNumber){
	this.contactNumber=contactNumber;
	}

public long getContactNumber(){
	return this.contactNumber;
	}

public void deliverStock(){
	String productDescription;
	int stockQuantity;
	String departureDate;
	double departureTime;
	String destination;
	double timeOfArrival;
}

public String toString(){
return "Contact Number: " + this.contactNumber;
}

public boolean equals(Object l){
	if(l instanceof Logistics){
	Logistics logistics=(Logistics) l;
	if(logistics.getContactNumber()==this.contactNumber){
	return true;
	}
return false;
}
return false;
}

}
