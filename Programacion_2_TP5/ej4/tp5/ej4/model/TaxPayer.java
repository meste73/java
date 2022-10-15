package tp5.ej4.model;

public class TaxPayer {
	
	private String name;
	private int taxId;
	private double amount;
	
	public TaxPayer(String name, int taxId, double amount) {
		this.name = name;
		this.taxId = taxId;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getTaxId() {
		return taxId;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getTaxAmount() {
		return this.getAmount();
	}
}
