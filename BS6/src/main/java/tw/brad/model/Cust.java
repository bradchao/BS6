package tw.brad.model;

public class Cust {
	private String companyName;
	private String city;
	private String country;
	
	public Cust() {}
	public Cust(String companyName, String city, String country) {
		this.companyName = companyName;
		this.city = city;
		this.country = country;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
