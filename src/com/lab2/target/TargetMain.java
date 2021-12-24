package com.lab2.target;

import java.util.Scanner;

public class TargetMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction Array ");
		int arraysize = sc.nextInt();
		int val = 0;
		int targetcounter = 0;
		Target tt = new Target(arraysize);

		System.out.println("Enter the values of Array ");
		for (int i = 0; i < arraysize; i++) {
			val = sc.nextInt();
			tt.setTransactionValue(i, val);
		}

		System.out.println("enter the total no of targets that need to be achieved");
		targetcounter = sc.nextInt();
		int target = 0;
		for (int i = 0; i < targetcounter; i++) {
			System.out.println("enter the value of target ");
			val = sc.nextInt();
			target = tt.targetCheck(val);
			if (target > 0)
				System.out.println("Target achieved after " + target + " transaction");
			else
				System.out.println("Given target is not acheived.");
		}

		sc.close();
	}
}
