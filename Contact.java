package briglabz.Watch_Service;

public class Contact {
		
		   private String firstname;
		   private String lastname;
		   private String city;
		   private String state;
		   private String zip;
		   private String phoneNumber;
		   private String emailId;
		   
		   
			public String getFirstname() {
		        return firstname;
		    }
		    public void setFirstname(String firstname) {
		        this.firstname = firstname;
		    }
		    
		    public String getLastname() {
		        return lastname;
		    }
		    public void setLastname(String lastname) {
		        this.lastname = lastname;
		    }
		    
		    public String getCity() {
		        return city;
		    }
		    public void setCity(String city) {
		        this.city = city;
		    }
		    
		    public String getState() {
		        return state;
		    }
		    public void setState(String state) {
		        this.state = state;
		    }
		    
		    public String getZip() {
		        return zip;
		    }
		    public void setZip(String zip) {
		        this.zip = zip;
		    }
		    
		    public String getphoneNumber() {
		        return phoneNumber;
		    }
		    public void setphoneNumber(String phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }

		    public String getemail() {
		        return emailId;
		    }
		    public void setemail(String email) {
		        this.emailId = email;
		    }

			
			 @Override 
			 public String toString() { return " " + firstname + " " + lastname
			  +" " + city + " " + state + " " + zip + " "+ phoneNumber + " "
			  + emailId +""; }
			 

	}
