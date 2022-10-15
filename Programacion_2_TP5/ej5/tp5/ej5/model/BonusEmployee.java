package tp5.ej5.model;

public class BonusEmployee extends SaleEmployee {

	private int limitSales;
	private double bonus;

	public BonusEmployee(String name, String lname, int dni, double monthSalary, double saleExtraPercent,
			int limitSales, double bonus) {
		super(name, lname, dni, monthSalary, saleExtraPercent);
		this.limitSales = limitSales;
		this.bonus = bonus;
	}

	public int getLimitSales() {
		return limitSales;
	}

	public double getBonus() {
		return bonus;
	}

	public void setLimitSales(int limitSales) {
		this.limitSales = limitSales;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalaryBonus() {
		double amount = 0;
		if(this.getSales().size() > this.limitSales) {
			amount = this.getBonus();
		}
		return amount;
	}
	
	public double getFinalSalary() {
		return getMonthSalary() + (super.getTotalSalarySales() * super.getSaleExtraPercent() + this.getSalaryBonus());
	}
	
}
