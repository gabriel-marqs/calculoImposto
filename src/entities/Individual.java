package entities;

public class Individual extends Payer {

	private Double health;

	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public Double tax() {
		if (income < 20000) {
			income = income*0.15 - health/2;
		}
		else {
			income = income*0.25 - health/2;
		}
		return income;
	}

}
