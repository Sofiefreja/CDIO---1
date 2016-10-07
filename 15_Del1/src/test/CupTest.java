package test;

import static org.junit.Assert.*;
import org.junit.Test;

import spil.Cup;

public class CupTest {

	@Test
	public void test() {
		Cup c = new Cup();
		//initializes counters
		int to = 0, tre = 0, fire = 0, fem = 0, seks = 0, syv = 0, otte = 0, ni = 0, ti = 0, elleve = 0, tolv = 0;
		for (int i = 1; i <= 10000; i++) { //increments counters for every roll
			c.roll();
			switch (c.getSum()) {
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
			case 7:
				syv++;
				break;
			case 8:
				otte++;
				break;
			case 9:
				ni++;
				break;
			case 10:
				ti++;
				break;
			case 11:
				elleve++;
				break;
			case 12:
				tolv++;
				break;
			}
		}
		//print the counters for manual evaluation.
		System.out.println(to);
		System.out.println(tre);
		System.out.println(fire);
		System.out.println(fem);
		System.out.println(seks);
		System.out.println(syv);
		System.out.println(otte);
		System.out.println(ni);
		System.out.println(ti);
		System.out.println(elleve);
		System.out.println(tolv);
	}

}
