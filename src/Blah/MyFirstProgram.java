package Blah;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// String = กลุ่มคำ ("คำ")
		// int = จำนวนเต็ม (Interger)
		// double = จำนวนทศนิยม
		// boolean = ตระกะ
		// != คือ เครื่องหมายไม่เท่ากับ
		
//		//1
//		String x = "Hello";
//		String y = "World";
//		int myNumber = 1+2+3+4+5;
//		double myDouble = 12.345;
//		boolean myBool = 20 < 15;
//		System.out.println(x +" "+ y);
//		System.out.println("My name is Knot");
//		System.out.println(myNumber);
//		System.out.println(myDouble);
//		System.out.println(myBool);
//		
//		//2
//		int num = 5;
//		double numm = 5;
//		System.out.println(num+4);
//		System.out.println(num-4);
//		System.out.println(num*4);
//		System.out.println(num/4);
//		System.out.println(num/4.0);//1.25
//		System.out.println(numm/4);//1.25
//		
//		//3
//		System.out.println(num +" + 4 = "+(num+4));
//		System.out.println(num +" - 4 = "+(num-4));
//		System.out.println(num +" * 4 = "+(num*4));
//		System.out.println(num +" / 4 = "+(num/4.0));
//		
//		//4
//		int num1 = 5;
//		System.out.println(num1 +" คูณ  1 เท่ากับ "+(num1*1));
//		System.out.println(num1 +" คูณ  2 เท่ากับ "+(num1*2));
//		System.out.println(num1 +" คูณ  3 เท่ากับ "+(num1*3));
//		System.out.println(num1 +" คูณ  4 เท่ากับ "+(num1*4));
//		System.out.println(num1 +" คูณ  5 เท่ากับ "+(num1*5));
//		System.out.println(num1 +" คูณ  6 เท่ากับ "+(num1*6));
//		System.out.println(num1 +" คูณ  7 เท่ากับ "+(num1*7));
//		System.out.println(num1 +" คูณ  8 เท่ากับ "+(num1*8));
//		System.out.println(num1 +" คูณ  9 เท่ากับ "+(num1*9));
//		System.out.println(num1 +" คูณ  10 เท่ากับ "+(num1*10));
//		System.out.println(num1 +" คูณ  11 เท่ากับ "+(num1*11));
//		System.out.println(num1 +" คูณ  12 เท่ากับ "+(num1*12));
//		
//		//5
//		Scanner myScanner = new Scanner(System.in);
//		System.out.print("Please enter a number : ");
//		int num2 = myScanner.nextInt();
//		System.out.println(num2 +" คูณ  1 เท่ากับ "+(num2*1));
//		System.out.println(num2 +" คูณ  2 เท่ากับ "+(num2*2));
//		System.out.println(num2 +" คูณ  3 เท่ากับ "+(num2*3));
//		System.out.println(num2 +" คูณ  4 เท่ากับ "+(num2*4));
//		System.out.println(num2 +" คูณ  5 เท่ากับ "+(num2*5));
//		System.out.println(num2 +" คูณ  6 เท่ากับ "+(num2*6));
//		System.out.println(num2 +" คูณ  7 เท่ากับ "+(num2*7));
//		System.out.println(num2 +" คูณ  8 เท่ากับ "+(num2*8));
//		System.out.println(num2 +" คูณ  9 เท่ากับ "+(num2*9));
//		System.out.println(num2 +" คูณ  10 เท่ากับ "+(num2*10));
//		System.out.println(num2 +" คูณ  11 เท่ากับ "+(num2*11));
//		System.out.println(num2 +" คูณ  12 เท่ากับ "+(num2*12));
//		
//		//6
//		Scanner myScanner1 = new Scanner(System.in);
//		System.out.print("Please enter a number : ");
//		double num3 = myScanner1.nextDouble();
//		System.out.println(num3 +" คูณ  1 เท่ากับ "+(num3*1));
//		System.out.println(num3 +" คูณ  2 เท่ากับ "+(num3*2));
//		System.out.println(num3 +" คูณ  3 เท่ากับ "+(num3*3));
//		System.out.println(num3 +" คูณ  4 เท่ากับ "+(num3*4));
//		System.out.println(num3 +" คูณ  5 เท่ากับ "+(num3*5));
//		System.out.println(num3 +" คูณ  6 เท่ากับ "+(num3*6));
//		System.out.println(num3 +" คูณ  7 เท่ากับ "+(num3*7));
//		System.out.println(num3 +" คูณ  8 เท่ากับ "+(num3*8));
//		System.out.println(num3 +" คูณ  9 เท่ากับ "+(num3*9));
//		System.out.println(num3 +" คูณ  10 เท่ากับ "+(num3*10));
//		System.out.println(num3 +" คูณ  11 เท่ากับ "+(num3*11));
//		System.out.println(num3 +" คูณ  12 เท่ากับ "+(num3*12));
//		
//		//7
//		Scanner myScanner2 = new Scanner(System.in);
//		System.out.print("Enter your name : ");
//		String name = myScanner2.nextLine();
//		System.out.print("Your name is : "+name+" ?");
//		
//		//8
//		Scanner myScanner3 = new Scanner(System.in);
//		System.out.print("Enter your First name : ");
//		String name1 = myScanner3.nextLine();
//		System.out.print("Enter your last name : ");
//		String name2 = myScanner3.nextLine();
//		System.out.print("Your name is : "+name1+" "+name2);
//		
//		//9
//		Scanner myScanner4 = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		int a = myScanner4.nextInt();
//		System.out.print("Enter Name : ");
//		String name = Myscanner.nextLine();
//		System.out.println(a+" and "+name);
		
		//10
		Scanner scan = new Scanner(System.in);
			int n = 0;
			int x = 0;
			int sum = 0;
				System.out.print("Enter value of n : ");
				n = scan.nextInt();

			
			while(n>=x)
			{					
							sum = sum+x;
							x++;
			}
			System.out.println(sum);
 }
}