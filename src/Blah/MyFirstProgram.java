package Blah;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// String = ������� ("��")
		// int = �ӹǹ��� (Interger)
		// double = �ӹǹ�ȹ���
		// boolean = ��С�
		// != ��� ����ͧ���������ҡѺ
		
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
//		System.out.println(num1 +" �ٳ  1 ��ҡѺ "+(num1*1));
//		System.out.println(num1 +" �ٳ  2 ��ҡѺ "+(num1*2));
//		System.out.println(num1 +" �ٳ  3 ��ҡѺ "+(num1*3));
//		System.out.println(num1 +" �ٳ  4 ��ҡѺ "+(num1*4));
//		System.out.println(num1 +" �ٳ  5 ��ҡѺ "+(num1*5));
//		System.out.println(num1 +" �ٳ  6 ��ҡѺ "+(num1*6));
//		System.out.println(num1 +" �ٳ  7 ��ҡѺ "+(num1*7));
//		System.out.println(num1 +" �ٳ  8 ��ҡѺ "+(num1*8));
//		System.out.println(num1 +" �ٳ  9 ��ҡѺ "+(num1*9));
//		System.out.println(num1 +" �ٳ  10 ��ҡѺ "+(num1*10));
//		System.out.println(num1 +" �ٳ  11 ��ҡѺ "+(num1*11));
//		System.out.println(num1 +" �ٳ  12 ��ҡѺ "+(num1*12));
//		
//		//5
//		Scanner myScanner = new Scanner(System.in);
//		System.out.print("Please enter a number : ");
//		int num2 = myScanner.nextInt();
//		System.out.println(num2 +" �ٳ  1 ��ҡѺ "+(num2*1));
//		System.out.println(num2 +" �ٳ  2 ��ҡѺ "+(num2*2));
//		System.out.println(num2 +" �ٳ  3 ��ҡѺ "+(num2*3));
//		System.out.println(num2 +" �ٳ  4 ��ҡѺ "+(num2*4));
//		System.out.println(num2 +" �ٳ  5 ��ҡѺ "+(num2*5));
//		System.out.println(num2 +" �ٳ  6 ��ҡѺ "+(num2*6));
//		System.out.println(num2 +" �ٳ  7 ��ҡѺ "+(num2*7));
//		System.out.println(num2 +" �ٳ  8 ��ҡѺ "+(num2*8));
//		System.out.println(num2 +" �ٳ  9 ��ҡѺ "+(num2*9));
//		System.out.println(num2 +" �ٳ  10 ��ҡѺ "+(num2*10));
//		System.out.println(num2 +" �ٳ  11 ��ҡѺ "+(num2*11));
//		System.out.println(num2 +" �ٳ  12 ��ҡѺ "+(num2*12));
//		
//		//6
//		Scanner myScanner1 = new Scanner(System.in);
//		System.out.print("Please enter a number : ");
//		double num3 = myScanner1.nextDouble();
//		System.out.println(num3 +" �ٳ  1 ��ҡѺ "+(num3*1));
//		System.out.println(num3 +" �ٳ  2 ��ҡѺ "+(num3*2));
//		System.out.println(num3 +" �ٳ  3 ��ҡѺ "+(num3*3));
//		System.out.println(num3 +" �ٳ  4 ��ҡѺ "+(num3*4));
//		System.out.println(num3 +" �ٳ  5 ��ҡѺ "+(num3*5));
//		System.out.println(num3 +" �ٳ  6 ��ҡѺ "+(num3*6));
//		System.out.println(num3 +" �ٳ  7 ��ҡѺ "+(num3*7));
//		System.out.println(num3 +" �ٳ  8 ��ҡѺ "+(num3*8));
//		System.out.println(num3 +" �ٳ  9 ��ҡѺ "+(num3*9));
//		System.out.println(num3 +" �ٳ  10 ��ҡѺ "+(num3*10));
//		System.out.println(num3 +" �ٳ  11 ��ҡѺ "+(num3*11));
//		System.out.println(num3 +" �ٳ  12 ��ҡѺ "+(num3*12));
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