package test;

import static org.junit.Assert.*;

import org.junit.Test;

import spil.Cup;

public class testPrintTime {

	@Test
	public void test() {
		double threshold=333;//defines threshold for accepted time spent
		long startTime=0;//initiates timer
		long endTime = 0;
		double r=0;//initiates double 
		Cup c = new Cup();
		String p2="Player#";
		
		startTime=System.nanoTime();
		c.roll();
		System.out.println(p2 + " rolls" + c.toString());
		endTime=System.nanoTime();
		r=((double) endTime - (double) startTime)/ (double)1000000;
		System.out.println(r+"ms");
		assertTrue(r<threshold);
		

	}

}
