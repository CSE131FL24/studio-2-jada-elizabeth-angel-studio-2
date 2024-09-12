package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the start amount: ");
		Double startAmount = in.nextDouble();
		
		System.out.print("Enter the probability that you win: ");
		Double winChance = in.nextDouble();
		
		System.out.print("Enter the winning amount: ");
		Double winLimit = in.nextDouble();
		
		int winTimes = 0;
		int loseTimes = 0;
		
		//while startAmount < winLimit, enter loop && startAmount !=0
		while (startAmount < winLimit && startAmount > 0) {
		
		// randomNumber = Math.random() 
			
			double randomNumber = Math.random();
			
			//if randomNumber >= winChance, startAmount = startAmount + 1
			if (randomNumber <= winChance) {
				
				startAmount = startAmount + 1;
				winTimes = winTimes+1;
			}
			//else, startAmount = startAmount - 1
			else {
				startAmount = startAmount - 1;
				loseTimes = loseTimes+1;
			}
			
			//System.out.println(startAmount);
	
		}
		// if startAmount >= winLimit, print "win"
		if (startAmount >= winLimit) {
			System.out.println("Success!");
			
		}
		// else if startAmount == 0, print "lose"
		else {
			System.out.println("Ruin!");
			
		}
		
		System.out.println("Win Times: " + winTimes);
		System.out.println("Lose Times: " + loseTimes);
		
	}
}
