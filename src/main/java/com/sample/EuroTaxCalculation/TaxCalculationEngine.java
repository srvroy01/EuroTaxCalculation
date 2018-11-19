package com.sample.EuroTaxCalculation;

import java.util.Scanner;
import com.sample.service.Belgium;
import com.sample.service.Germany;

/**
 * This is a main class to launch to run the project
 */
public class TaxCalculationEngine {

	public static final void main(String[] args) {
	
		try {
			
			System.out.println("Welcome to Euro Tax Calculation Engine!! Enter 1 for Belgium, 2 for Germany: ");
			System.out.println("Please enter the choice of the country for tax calculation: ");
			Scanner in = new Scanner(System.in);
			
			String msg = in.nextLine();
			int input = Integer.valueOf(msg);
			
			switch (input) {
            case 1:  Belgium bl= new Belgium();
            		 bl.calculateBelTax();
            break;
            case 2:  Germany gr =new Germany();
            		gr.calculateGermanTax();
            		break;		
               default:  System.out.println("Not a valid input");
            	break;
			}	
			
			in.close();
	}
		
		catch(Throwable t1) {
			t1.printStackTrace();
		}
	}
	

}
