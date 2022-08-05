package com.Q4;

public class Number {

	void check(int data) {
		if(data%2==0) {
			   int x = data/10;
			   if(data%10==0){
				   int y = x*10;
				   System.out.println(y);
				   return;
			   }else {
			   int y = x*10+10;
			   System.out.println(y);
			   return;
			   }
		}else if(data<=0){
			   System.out.println("Error");
			    return;
			}else{
				System.out.println(data);
				return;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num = new Number();
		   int val = -1;
		   num.check(val); 
		   val = 62;
		   num.check(val); 
		   val = 45;
		   num.check(val); 
		   
	}

}
