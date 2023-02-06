package entities;

public abstract class Payer {
	private String name;
	protected Double income;

	public Payer() {
	}

	public Payer(String name, Double income) {
		super();
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public abstract Double tax();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ": $ ");
		sb.append(String.format("%.2f", tax()));
		return sb.toString();
	}
}
