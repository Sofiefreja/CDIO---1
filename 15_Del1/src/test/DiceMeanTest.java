package test;

import static org.junit.Assert.*;

import org.junit.Test;

import spil.Dice;

public class DiceMeanTest {

	@Test
	public void test() {
		Dice d1 = new Dice();
		int n=100000;//definerer antal kast
		boolean test=false;
		double lowerThreshold=3.45;//definerer nedre grænse for en acceptabelt middelværdi
		double upperThreshold=3.55;//definerer øvre grænse for en acceptabelt middelværdi
//		double varians=0;
//		double temp = 0;
		double sum=0.0;
		double mean=0.0;
//		double StdDev=0.0;
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			d1.roll();
			arr[i]=d1.getValue();
		} 	
		for(double a : arr){
			sum+=a;
		}
		mean=sum/(double)arr.length;
//		for(double a:arr){
//			temp+=Math.pow((a-mean), 2);
//		}
//		varians=temp/arr.length;
//		StdDev=Math.sqrt(varians);
		System.out.println(mean);
		if(mean>lowerThreshold &&mean<upperThreshold){
			test=true;
		}
		assertTrue(test);
		System.out.println(test);
	}
	
}
