package com.lab2.denomination;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DenominationMain {

	public static boolean bubbleSort(int array[]) {
		int temp=0;
		int offset=array.length-1;

		if (array.length<=0) {
			System.out.println ("Returning");
			return false;
		}

		do{
			for(int i=0;i<offset;i++) {
				if (array[i]<array[i+1]) {
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
			offset--;
		}while(offset>0);

		return true;
	}

	public static void main (String args[]) {
		int size=0;
		int curArray[];
		int amount=0;
		int number=0;
		Scanner sc = new Scanner(System.in);

		try { // handling wrong format exception.

			System.out.println("Enter the size of currency denominations");
			size = sc.nextInt();

			//Allocating memoery for Array for above size.
			curArray = new int[size];
			System.out.println("Enter the currency denomination value");

			//Taking the array elements
			for(int i=0;i<size;i++) {
				curArray[i]=sc.nextInt();
			}

			System.out.println("Enter the amount you want to pay");
			amount = sc.nextInt();

			//sorting in descending order to consider the highest denomination currency first.
			bubbleSort(curArray);

			//Problem statement solution logic
			System.out.println("");
			for(int i=0;i<curArray.length;i++) {

				if(curArray[i]<=amount && curArray[i]>0) {
					number=amount/curArray[i];
					if(number>=1) {
						amount-=curArray[i]*number;
						System.out.println(curArray[i] + ":"+number);
					}
				}
			}
			//in case if some case denomination is not fully done then displaying the below message
			if (amount>0)
				System.out.println("Balance amount to pay: " + amount);

		}catch (InputMismatchException e) {
			System.out.println("Plesae input proper values, re-execute the program, existing !!! ");
			sc.close();
			System.exit(0);
		}

		sc.close();
	}
}
