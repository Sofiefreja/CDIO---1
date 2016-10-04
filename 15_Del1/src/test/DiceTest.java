package test;

import static org.junit.Assert.*;

import org.junit.Test;

import spil.Dice;

public class DiceTest {

	@Test
	public void test() {
		int en=0,to=0,tre=0,fire=0,fem=0,seks=0;
		Dice d1 = new Dice();
		for(int i=0;i<10000;i++){
			d1.roll();
			switch(d1.getValue()){
			case 1:
				en++;
				break;
			case 2:
				to++;
				break;
			case 3:
				tre++;
				break;
			case 4:
				fire++;
				break;
			case 5:
				fem++;
				break;
			case 6:
				seks++;
				break;
			}
		}
		System.out.println(en+"\n"+to+"\n"+tre+"\n"+fire+"\n"+fem+"\n"+seks);
	}

}
