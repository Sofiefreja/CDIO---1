package spil;

import java.util.*;
/*
 * Brah
 */

public class CDIO1 {
	public static String p1;
	public static String p2;
	public static int sumP1 = 0;
	public static int sumP2 = 0;
	public static void main(String[] args) {
		int done = 0;
		int six1 = 0;
		int six2 = 0;
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
		while(done == 0){
		do {
			if(cp == p1){
				System.out.println("Roll the die " + p1 + " (Y/N)?" );
				String ans = input.nextLine();
				if(ans.equals("Y")|| ans.equals("y")){
					cup.roll();
					System.out.println(p1 + " rolls" + cup.toString());
					switch(cup.getEns()) {
					case 0: 
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 0;
						cp = p2;
						break;
					case 1: 
						sumP1 = 0;
						printPoints();
						six1 = 0;
						cp = p1;
						break;
					case 2: 
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 0;
						cp = p1;
						break;
					case 3:
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 0;
						cp = p1;
						break;
					case 4:
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 0;
						cp = p1;
						break;
					case 5:
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 0;
						cp = p1;
						break;
					case 6: 
						if(six1 == 0) {
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 1;
						cp = p1;
						} else if(six1 == 1) {
							System.out.println(p1 + "is the winner!!!");
							return;
						}
						break;
					}
					} 
				 else if(ans.equals("N") || ans.equals("n")) {
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
					switch(cup.getEns()) {
					case 0: 
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 0;
						cp = p1;
						break;
					case 1: 
						sumP2 = 0;
						printPoints();
						six2 = 0;
						cp = p2;
						break;
					case 2: 
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 0;
						cp = p2;
						break;
					case 3:
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 0;
						cp = p2;
						break;
					case 4:
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 0;
						cp = p2;
						break;
					case 5:
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 0;
						cp = p2;
						break;
					case 6: 
						if(six2 == 0) {
						sumP2 = sumP2 + cup.getSum();
						printPoints();
						six2 = 1;
						cp = p2;
						} else if(six2 == 1) {
							System.out.println(p2 + "is the winnersdfg!!!");
							return;
						} break;
					}
				} else if (ans.equals("N")|| ans.equals("n")) {
					System.out.println("Game over");
					break;
				} else {
					System.out.println("Please enter Y or N");
				}
			}
		}
		while(sumP1 < 40 && sumP2 < 40); 
			if(cp == p2){
				if(cup.getEns() != 0 || cup.getEns()!= 1){
					System.out.println(p2 + " is the winner!!!");
					done = 1;
				} else {
					cp = p2;
				}
			} else if(cp == p1) {
				if(cup.getEns() != 0 || cup.getEns() != 1){
					System.out.println(p1 + " is the winner!!!");
					done = 1;
				} else {
					cp = p1;
				}
			}
		}
		input.close();
	}
public static void printPoints() {
	System.out.println(p1 + " has" + sumP1 + " points");
	System.out.println(p2 + " has" + sumP2 + " points");
}
}
