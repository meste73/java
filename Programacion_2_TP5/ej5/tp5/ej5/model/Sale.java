package tp5.ej5.model;

public class Sale {
	
	private int saleId;
	private double saleAmount;
	
	public Sale(int saleId, double saleAmount) {
		this.saleId = saleId;
		this.saleAmount = saleAmount;
	}

	public int getSaleId() {
		return saleId;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}
	
}
