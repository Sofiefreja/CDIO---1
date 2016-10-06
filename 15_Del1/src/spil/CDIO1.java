package spil;

import java.util.*;

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
		//The game is started, and the players are able to input a name
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
			if(cp.equals(p1)){
				System.out.println("Roll the die " + p1 + " (Y/N)?" );
				String ans = input.nextLine();
				if(ans.equals("Y")|| ans.equals("y")){
					//The die are thrown and the result printed 
					cup.roll();
					System.out.println(p1 + " rolls" + cup.toString());
					/*The switch case takes use of the cup class
					 * it defines what  happens if the result is 
					 * two equal numbers or different*/
					switch(cup.getEqual()) {
					case 0: //Different numbers.
						sumP1 = sumP1 + cup.getSum();//Points are summed
						printPoints();//Point score is printed
						six1 = 0;//In case of the last result being two six'es, this nulls it
						cp = p2;//Next players turn
						break;
					case 1: 
						sumP1 = 0;//Two one's means the current players score nulls
						printPoints();
						six1 = 0;
						cp = p1;//When the player gets two equal numbers, another turn is granted
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
						if(six1 == 0) {//First double six'es
						sumP1 = sumP1 + cup.getSum();
						printPoints();
						six1 = 1;
						cp = p1;
						} else if(six1 == 1) {//Second, means automatic win
							System.out.println(p1 + "is the winner!!!");
							return;
						}
						break;
					}
					} 
				 else if(ans.equals("N") || ans.equals("n")) {
					System.out.println("Game over");//Game terminates
					break;
				} else {
					/*In case of the player entering something else than Y or N
					 * it asks for a correct input*/
					System.out.println("Please enter Y or N");
				}
			} else {//The same routine for player 2
				System.out.println("Roll the die " + p2 + "(Y/N)?" );
				String ans = input.nextLine();
				if(ans.equals("Y")|| ans.equals("y")){
					cup.roll();
					System.out.println(p2 + " rolls" + cup.toString());
					switch(cup.getEqual()) {
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
			if(cp.equals(p2) && sumP2 > 39){//Checks to see which is the current player, afterwards if the player gets two equal numbers
				if(cup.getEqual() == 2 || cup.getEqual()== 3|| cup.getEqual()== 4|| cup.getEqual()== 5|| cup.getEqual()== 6){
					System.out.println(p2 + " is the winner!!!");
					done = 1;//Exits while loop and terminates game
				} else {
					cp = p2;//The player has more than 40 points, but hasn't thrown two equals, gets another turn.
				}
			} else if(cp.equals(p1) && sumP1 > 39){
				if(cup.getEqual() == 2 || cup.getEqual()== 3|| cup.getEqual()== 4|| cup.getEqual()== 5|| cup.getEqual()== 6){
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
	//Print function, to print point score.
	System.out.println(p1 + " has " + sumP1 + " points");
	System.out.println(p2 + " has " + sumP2 + " points");
}
}