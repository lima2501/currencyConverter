package currencyconverter;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o preço do dolar R$: ");
		Double dolarPrice = scan.nextDouble();
		System.out.print("Quantos dolares serão comprados? ");
		Double dollars = scan.nextDouble();
		
		CurrencyConverter currencyConverter = new CurrencyConverter(dolarPrice, dollars);
		
		System.out.println(currencyConverter);
		
		scan.close();
	}
}
