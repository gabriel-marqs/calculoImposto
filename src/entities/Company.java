package entities;

public class Company extends Payer {

	private Integer employees;

	public Company() {
		super();
	}

	public Company(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double tax() {
		double basicTax = 0;
		if (employees > 10) {
			basicTax = income*0.14;
		}
		else {
			basicTax = income*0.16;
		}
		return basicTax;
	}

}
