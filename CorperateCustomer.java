package OOP1;

public class CorperateCustomer extends Customer {
	private String companyName;
	private String taxNumberString;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumberString() {
		return taxNumberString;
	}

	public void setTaxNumberString(String taxNumberString) {
		this.taxNumberString = taxNumberString;
	}

}
