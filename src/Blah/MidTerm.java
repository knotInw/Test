package Blah;

import java.util.Random;
import java.util.Scanner;

public class MidTerm {
//	public static void printRoof(int a,String b){
//		while(a>1){
//			System.out.print(" ");
//			a--;
//		}
//		System.out.print(b);
//	}
	public static void printWall(int a,String b){
		int e = Math.floorDiv(a,2);
		for(e=e;e>=1;e--){
			for(int c=a;c>0;c--){
				System.out.print(b);
			}
			System.out.println();
		}
	}
//	public static void printFloor(int a,String b){
//		for(int r=3;r>0;r--){
//			System.out.print(" ");
//		}
//			for(int c=a;c>0;c--){
//				System.out.printf(b);
//			}
//			System.out.print(b);
//			System.out.println(b);
//	}
//	public static void main(String[] args){
//		printRoof(7,"#");
//	}
//}
	static Scanner scan = new Scanner(System.in);
	static int w1,w2,d1,d2,r1,r2,c=1,a,re=1;
	static Random rand = new Random();
	static int newRandom(){
		return rand.nextInt(6)+1;
	}
	static int Player1(int z){
		int r1=newRandom();
		System.out.printf("Player1 result: %d\n",r1);
		if(d1+r1>z){	
		}
		else{
			d1=d1+r1;
		}
		System.out.printf("Sum Player1 is %d\n",d1);
		if(d1==z){
			w1=1;
			d1=0;
		}
		else{
			w1=0;
		}
		return w1;
	}
	static int Player2(int z){
		int r2=newRandom();
		System.out.printf("Player2 result: %d\n",r2);
		if(d2+r2>z){	
		}
		else{
			d2=d2+r2;
		}
		System.out.printf("Sum Player2 is %d\n",d2);
		if(d2==z){
			w2=1;
			d2=0;
		}
		else{
			w2=0;
		}
		return w2;
	}
	static int checkWin(int w1,int w2,int c){
		if(w1==1&&w2==1){
			System.out.printf("Both Players Win! (Total %d tries)\n",c-1);
			d1=0;
			d2=0;
			a=0;
		}
		else if(w2==1){
			System.out.printf("Player 2 Wins! (Total %d tries)\n",c-1);
			d1=0;
			d2=0;
			a=0;
		}
		else if(w1==1){
			System.out.printf("Player 1 Wins! (Total %d tries)\n",c-1);
			d1=0;
			d2=0;
			a=0;
		}
		else{
			a=1;
		}
		return a;
	}
	static int TossOrQuit(String b){		
		if(b.equalsIgnoreCase("t")){
			a=1;
		}
		else if(b.equalsIgnoreCase("q")){
			a=0;
		}
		return a;
	}
	static int oneTurn(int z){
		System.out.printf("=======Toss %d=======\n",c);
		Player1(z);
		Player2(z);
		c++;
		
		a = checkWin(w1,w2,c);
		if(a==0){
			a=0;
		}
		else{
		}
		return a;
	}
	static void TossMethod(int a,int c,int z){
		do{
			a = oneTurn(z);
			if(a==0){
				break;
			}
			else{
			}
			
			System.out.print("(t)oss or (q)uit : ");
			
			String b = scan.next();
			a = TossOrQuit(b);
			if(a==0){
				break;
			}
			else{
			}
		}
		while(a==1);
	}
	static int PlayOrQuit(String ret){
		if(ret.equalsIgnoreCase("q")){
			re=0;
		}
		else{
			re=1;
		}
		return re;
	}
	static void Loop(){
		int c=0,a=0,re=1,z=0;
		do{
			System.out.print("Set the target: ");
			z = scan.nextInt();
			a=1;c=1;
			TossMethod(a,c,z);
			System.out.print("(p)lay again or (q)uit : ");
			String ret = scan.next();
			re = PlayOrQuit(ret);
			if(re==0){
				re=0;
				break;
			}
		}
		while(re==1);
	}
	static void GameWith2Players(){
		Loop();
		System.out.print("Bye\n");
	}
	public static void main(String[] args) {
		GameWith2Players();
		
//		System.out.println();
		
//		printWall(13,"#");
	}
}
