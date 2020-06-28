package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {

Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(7);
		
		System.out.println(randomNumber);
		
		if (randomNumber == 0) {
//		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again");
		}
		if (randomNumber == 1) {
		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again"); 
		}
		if (randomNumber == 2) {
		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again");
		}
		if (randomNumber == 3) { 
		JOptionPane.showMessageDialog(null, "Congratulations! You won the lottery!");
		}
		if (randomNumber == 4) {
		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again");
		}
		if (randomNumber == 5) { 
		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again");
		}
	   if (randomNumber == 6) { 
		JOptionPane.showMessageDialog(null, "Sorry you didn't get the ticket try again");   
	   }
	   
	   }
	
	}
