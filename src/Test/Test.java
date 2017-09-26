package Test;

import java.util.Scanner;

public class Test {
	static long d;
	public static long getFactorial(long z){
		long sum1=1;
		for(long a=1;a<=z;a++){
			sum1 = sum1*a;
		}
		return sum1;
	}
	public static long combination(long a,long b,long c){
		d = a/(b*c);
		return d;
	}
	public static long BinomialCoefficients(long a,long b,long c){
		d = a/(b*c);
		return d;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		long size = scan.nextLong();
		
		for(long y=1;y<=size;y++){
			long a = getFactorial(y);
			for(long x=1;x<=y;x++){
			long b = getFactorial(x);
			long c = getFactorial(y-x);
			
			}
			
		}
	}
}
