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
		Double basicTax = 0.0;
		if (income < 20000) {
			basicTax = income*0.15 - health/2;
		}
		else {
			basicTax = income*0.25 - health/2;
		}
		
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}

}
