package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nic = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
        double nicInt = Integer.parseInt(nic);
        
        nicInt = nicInt * 0.05;
		// Ask the user how many dimes they have, and convert their answer
        String dime = JOptionPane.showInputDialog("how many dimes do you have?");
		
        double dimeInt = Integer.parseInt(dime);
       
        dimeInt = dimeInt * 0.10;
   
        
String quar = JOptionPane.showInputDialog("how many quarters do you have?");
		
        double quarInt = Integer.parseInt(quar);
        
        quarInt = quarInt * 0.25;
        
        
        double total = nicInt + dimeInt + quarInt;
        System.out.println(total);
        
        JOptionPane.showMessageDialog(null, "Your total is $" + total + ".");
		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

