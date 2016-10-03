package spil;

import java.util.*;

public class CDIO1 {
	public static String p1;
	public static String p2;
	public static int sumP1 = 0;
	public static int sumP2 = 0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Cup cup = new Cup();
		System.out.println("****************************************");
		System.out.println("********Welcome to the dice game********");
		System.out.println("****************************************");
		System.out.println("Player One input your name:");
		p1 = input.nextLine();
		System.out.println("Player Two input your name:");
		p2 = input.nextLine();
		String cp = p1;
		do {
			if(cp == p1){
				System.out.println("Roll the die " + p1 + " (Y/N)?" );
				String ans = input.nextLine();
				if(ans.equals("Y")|| ans.equals("y")){
					cup.roll();
					System.out.println(p1 + " rolls" + cup.toString());
					sumP1 = sumP1 + cup.getSum();
					printPoints();
					cp = p2;
				} else if(ans.equals("N") || ans.equals("n")) {
					System.out.println("Game over");
					break;
				} else {
					System.out.println("Please enter Y or N");
				}
			} else {
				System.out.println("Roll the die " + p2 + "(Y/N)?" );
				String ans = input.nextLine();
				if(ans.equals("Y")|| ans.equals("y")){
					cup.roll();
					System.out.println(p2 + " rolls" + cup.toString());
					sumP2 = sumP2 + cup.getSum();
					printPoints();
					cp = p1;
				} else if (ans.equals("N")|| ans.equals("n")) {
					System.out.println("Game over");
					break;
				} else {
					System.out.println("Please enter Y or N");
				}
			}
		}
		while(sumP1 < 40 && sumP2 < 40); 
			if(sumP1 > sumP2) {
				System.out.println(p1 + " is the winner!!!");
			}	else if(sumP2 > sumP1){
				System.out.println(p2 + " is the winner!!!");
			}
			input.close();
	}

public static void printPoints(){
	System.out.println(p1 + " has" + sumP1 + " points");
	System.out.println(p2 + " has" + sumP2 + " points");
	}

}