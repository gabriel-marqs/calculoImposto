package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Payer;
import entities.Individual;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<Payer> payers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data:\n", i+1);
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				
				payers.add(new Individual(name, income, health));
			}
			
			if (type == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				payers.add(new Company(name, income, employees));
			}
			
		}
		
		double totalTaxes = 0.0;
		
		System.out.print("\nTAXES PAID:\n");
		for (Payer p : payers) {
			p.tax();
			totalTaxes += p.tax();
			System.out.println(p);
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
	}
}
