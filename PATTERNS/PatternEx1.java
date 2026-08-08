
public class PatternEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int n = sc.nextInt();
		char ch='A';
		for (int a=1; a<=n;a++) {
			for (int i = 0; i < a; i++) {
				System.out.print(ch+=i);
			}
			System.out.println();
		}
	}
}

//*
//**
//***
//****
//*****

//		r=3   sp=2,1,0     st=1,3,5
//  *						  1,2,3
// ***
//*****

//   *		r=4   sp=3,2,1,0     st=1,3,5,7
//  ***								1,2,3,4
// *****
//*******

//    *		r=5   sp=4,3,2,1,0   st=1,3,5,7,9
//   ***							1,2,3,4,5
//  *****
// *******
//*********

//
//   A
//  ABA
// ABCBA
//ABCDCBA
//
//   A
//  ABa
// ABCba
//ABCDcba
//
//1
//21
//123
//4321

//*****
//System.out.print("*****");
//
//for(int i=1;i<=5;i++) {
//	System.out.print("*");
//}
//
//
//*****
//*****
//*****
//Code Optimization->Good Approach ->Less no of variables and loop
//Dynamic Code-User ->Row
//int a=sc.nextInt();
//for(int j=1;j<=a;j++) {	-outerloop-rows
//	for(int i=1;i<=j;i++) {	-innerloop-columns
//		System.out.print("*");
//	}
//	System.out.println();
//	
//}
//*
//**
//***
//****
//*****
//
//
//for(int j=5;j>=1;j--) {	-outerloop-rows
//	for(int i=1;i<=j;i++) {	-innerloop-columns
//		System.out.print("*");
//	}
//	System.out.println();
//}
//*****
//****
//***
//**
//*

//    *
//   **
//  ***
// ****
//*****
//int a=sc.nextInt();
//for (int i=1;i<=a;i++) {
//	for(int j=1;j<=a-i;j++) {
//		System.out.print(" ");
//	}
//	for(int k=1;k<=i;k++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
