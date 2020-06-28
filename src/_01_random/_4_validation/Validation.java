//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(11);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
		JOptionPane.showMessageDialog(null, "You are a good person");
		} 
		if (randomNumber == 1) {
		JOptionPane.showMessageDialog(null, "You have good friends");
		}
		if (randomNumber == 2) {
		JOptionPane.showMessageDialog(null, "You are going to be a great coder in life");	
		}
		if (randomNumber == 3) { 
		JOptionPane.showMessageDialog(null, "You will become a person that keeps on going and you would start caring for others");
		}
		if (randomNumber == 4) {
		JOptionPane.showMessageDialog(null, "You will become famous");
		}
		if (randomNumber == 5) {
		JOptionPane.showMessageDialog(null, "Corona virus would end very soon");
		} 
		if (randomNumber == 6) { 
		JOptionPane.showMessageDialog(null, "You might find a cure for cancer");
		}
		if (randomNumber == 7) { 
		JOptionPane.showMessageDialog(null, "The U.S milatary might consider Corona virus as a weapon");
		}
		if (randomNumber == 8) { 
		JOptionPane.showMessageDialog(null, "Trump will get impeached and Obama will become president again");
		}
		if (randomNumber == 9) { 
		JOptionPane.showMessageDialog(null, "You will become the nicest person alive");	
		}
		if (randomNumber ==10) { 
		JOptionPane.showMessageDialog(null, "You will be drafted for world war 3");	
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
