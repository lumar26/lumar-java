package main;

import java.util.Scanner;

import shape.circle.*;

import shape.rectangle.*;

public class Main {
	public static void main(String[] args) {
		int izbor;
		CircleList listaKrugova = new CircleList();
		RectList listaPravougaonika = new RectList();
		do {
			
			System.out.println("1. Unesi krug");
			System.out.println("2. Unesi pravougaonik");
			System.out.println("3. Unesi kvadrat");
			System.out.println("4. Prikazi izvestaj");
			System.out.println("5. Kraj rada");
			
			System.out.println("Unesite vas izbor");
			Scanner s  = new Scanner(System.in);
			izbor = s.nextInt();
		
			
			switch (izbor) {
			case 1:
				System.out.println("Unos kruga:");
				System.out.println();
				System.out.println("Unesite poluprecnik kruga:");
				double r = s.nextDouble();
				Circle krug = new Circle(r);
				listaKrugova.ubaciUListu(krug);
				break;
			case 2:
				System.out.println("Unos pravougaonika:");
				System.out.println();
				System.out.println("Unesite stranicu a:");
				double a = s.nextDouble();
				System.out.println("Unesite stranicu b:");
				double b = s.nextDouble();
				Rectangle pravougaonik = new Rectangle(a, b);
				listaPravougaonika.ubaciPravougaonikUListu(pravougaonik);
				break;
			case 3:
				System.out.println("Unos kvadrata:");
				break;
			case 4:
				System.out.println("Izvestaj:");
				listaKrugova.izlistajKrugove();
				listaPravougaonika.izlistajPravougaonike();
				break;
			case 5:
				System.out.println("Kraj rada");
				break;

			default:
				break;
			}
			
		} while (izbor != 5);
	}
}
