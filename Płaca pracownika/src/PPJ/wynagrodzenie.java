package PPJ;

import java.util.Scanner;

public class wynagrodzenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int godziny;
		
		double stawka;
		
	Scanner scanner = new Scanner (System.in);
		
		System.out.println("godziny");
		
		godziny = scanner.nextInt();
		System.out.println("stawka");
		stawka = scanner.nextDouble();
		scanner.close();
		System.out.printf("wynagrodzenie=%f", godziny * stawka);
		
		
		{int maxGodzin;
		maxGodzin = 60;
		int p³acaMin;
		p³acaMin = 12;
		System.out.println(maxGodzin * p³acaMin);
		}
		
	}



}
