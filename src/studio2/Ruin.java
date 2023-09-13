package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Start Amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What limit do you want to hit?");
		int winLimit = in.nextInt();
		System.out.println("How many days do you want to simulate?");
		int playday = in.nextInt();
		int outputplayday = 0;
		
		
		for(int count = 1; count <= playday; count ++ ) 
		{
			int playtime = 0;
			while(startAmount > 0 && startAmount < winLimit)
			{
				double random = Math.random();
				if(random >= 1 - winChance) {
					startAmount++;
				}
				else if(random < 1 - winChance){
					startAmount--;
				}
				
				
				playtime ++;
			
			}
			
			outputplayday ++; 
			
			if(startAmount == 0) {
				System.out.println("Simulation " + outputplayday + ": " + playtime + " Lose");
			}
			else {
				System.out.println("Simulation " + outputplayday + ": " + playtime + " Win");
				}
			
		
		}
	}

}
