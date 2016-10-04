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
		Field[] fields = new Field[1];
		fields[0] = new Empty.Builder().build();
		
		GUI.create(fields);
		GUI.setChanceCard("");
		
//		Scanner input = new Scanner(System.in);
//		Cup cup = new Cup();
		Dice d1 = new Dice();
		Dice d2 = new Dice();

		GUI.showMessage("********Welcome to the dice game********");
		
		p1 = GUI.getUserString("Player One: input your name:");
		p2 = GUI.getUserString("Player Two input your name:");
		
		String cp = p1;
		do {
			if(cp == p1){
				//System.out.println("Roll the die " + p1 + " (Y/N)?" );
				String ans = GUI.getUserButtonPressed(p1+": do you want to roll the dice?:", "Yes","No");
				if(ans.equals("Yes")){
					d1.roll();
					d2.roll();
					GUI.setDice(d1.getValue(), d2.getValue());
					GUI.showMessage(p1+" rolled a "+d1.getValue()+" and a "+d2.getValue());
					sumP1 = sumP1 +d1.getValue()+d2.getValue();
					printPoints();
					cp = p2;
				} else if(ans.equals("No")) {
					GUI.showMessage("Game over");
					GUI.close();
					break;
				} 
//				else {
//					System.out.println("Please enter Y or N");
//				}
			} else {
				String ans = GUI.getUserButtonPressed(p2+": do you want to roll the dice?:", "Yes","No");
				if(ans.equals("Yes")){
//					cup.roll();
//					System.out.println(p2 + " rolls" + cup.toString());
//					sumP2 = sumP2 + cup.getSum();
//					printPoints();
//					cp = p1;
					d1.roll();
					d2.roll();
					GUI.setDice(d1.getValue(), d2.getValue());
					GUI.showMessage(p2+" rolled a "+d1.getValue()+" and a "+d2.getValue());
					sumP2 = sumP2 +d1.getValue()+d2.getValue();
					printPoints();
					cp = p1;
				} else if (ans.equals("N0")) {
					GUI.showMessage("Game over");
					GUI.close();
					break;
				} 
//				else {
//					System.out.println("Please enter Y or N");
//				}
			}
		}
		while(sumP1 < 40 && sumP2 < 40); 
			if(sumP1 > sumP2) {
				GUI.showMessage(p1 + " is the winner!!!");
			}	else if(sumP2 > sumP1){
				GUI.showMessage(p2 + " is the winner!!!");
			}
			GUI.close();
	}
public static void printPoints() {
	System.out.println(p1 + " has" + sumP1 + " points");
	System.out.println(p2 + " has" + sumP2 + " points");
}
}
