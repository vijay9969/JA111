
//Q4:----------------------------

package com.Score;

public class Main {
	
	public static void runScored(int one, int two, int three, int four ,int six) {
		// write your logic here
		int TotalScore = (one*1)+(two*2)+(three*3)+(four*4)+(six*6);
		if(TotalScore>=100) {
			System.out.println("Batsman completed his Century : "+TotalScore);
		}
		else if(TotalScore>=50) {
			System.out.println("Batsman completed his Fifty : "+TotalScore);
		}else {
		    System.out.println("Batsman Total Score is : "+TotalScore);
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int one = 0;
		int two = 1;
		int three = 0;
		int four = 3;
		int six = 6;
		
		runScored(one,two,three,four,six);
	}

}
