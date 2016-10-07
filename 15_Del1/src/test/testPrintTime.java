package test;

import static org.junit.Assert.*;

import org.junit.Test;

import spil.Cup;

public class testPrintTime {

	@Test
	public void test() {
		double threshold=333;//defines threshold for accepted time spent
		long startTime=0;//initiates timer
		long endTime = 0;//initiates time stopper
		double r=0; 
		Cup c = new Cup();
		String p2="Player#";
		
		startTime=System.nanoTime();//start timer
		c.roll();
		System.out.println(p2 + " rolls" + c.toString());
		endTime=System.nanoTime(); //stop timer
		r=((double) endTime - (double) startTime)/ (double)1000000; //recalculate to miliseconds
		System.out.println(r+"ms");
		assertTrue(r<threshold); //true if the time is below treshold
	}
}
