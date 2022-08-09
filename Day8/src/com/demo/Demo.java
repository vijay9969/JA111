package com.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String arr111[] = {"1","2","3","4","Win"};
//		String x[] = arr111[4].split("");
//		System.out.println(x[0]);
		
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 10;
		arr[3] = 20;
		arr[4] = 90;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int arr1[] = {1,2,3,4,5,6,7,8,9,0};
		
		for(int j:arr1) {
			System.out.println(j);
		}
		
		
		
		A[] arr3 = new A[3];
		
		arr3[0] = new A();
		arr3[1] = new A();
		arr3[2] = new A();
		int i = 1;
		for(A k:arr3) {
			k.funA(i);
			i++;
		}
	}

}
