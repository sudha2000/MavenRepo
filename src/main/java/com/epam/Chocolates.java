package com.epam;
import java.util.Scanner;
public class Chocolates extends NewYearGift{
	Scanner sc=new Scanner(System.in);
	int ch;
	int cost;
	public int choose() {
		System.out.println("\n 1.Milka 2.Toblerone 3.hersheys 4.lindt 5.cachet 6.Bianca"
				+ "7.Godvina 8.Diryas " );
		System.out.println("enter your choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1:cost=25;
		       break;
		case 2:cost=15;
	       break;
		case 3:cost=20;
	       break;
		case 4:cost=5;
	       break;
		case 5:cost=30;
	       break;
		case 6:cost=10;
	       break;
		case 7:cost=35;
	       break;
		case 8:cost=50;
	       break;
		default:
			   return 0;
	    
	       
		}
		return cost;
	}
	

}
