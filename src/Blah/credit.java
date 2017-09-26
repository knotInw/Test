package Blah;

import java.util.Random;
import java.util.Scanner;

public class credit {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	public static void lazy(){
		int z=0,count=0;
		
		int n = rand.nextInt(99999)+0;
		System.out.println("Note: the random number is "+n);
		
		do{
			System.out.print("Guess a number (0-99999):");
			int a = scan.nextInt();
			
			if(a<n){
				System.out.println("Less than");
				count++;
			}
			else if(a>n){
				System.out.println("More than");
				count++;
			}
			else if(a==n){
				count++;
				z=1;
			}
		}
		while(z!=1);
		System.out.println("Correct! Well done!");
		System.out.printf("Total tries = %d\n",count);
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		int h=1,j=1;
		do{
			lazy();
				
			do{
				System.out.print("(P)lay again, (Q)uit:");
				String g = scan.next();
				if(g.equalsIgnoreCase("Q")){
					h=0;
					j=0;
				}
				else if(g.equalsIgnoreCase("P")){
					h=1;
					j=0;
				}
				else{
					j=1;
				}
			}
			while(j==1);
			j=1;
		}
		while(h==1);
		System.out.print("Bye Bye");
	}
}