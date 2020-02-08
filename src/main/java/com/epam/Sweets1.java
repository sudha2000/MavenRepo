package com.epam;
import java.util.Scanner;
public class Sweets1 extends Chocolates{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,x,y,p;
		System.out.println("enter total no of persons");
		p=sc.nextInt();
		for(int i=1;i<=p;i++) {
			
		System.out.println("for person "+i+"");
		Sweets1 s=new Sweets1();
		a=s.giftwt1();
		b=s.choose();
		
		   if(a>=b) {
			   x=a/b;
			   y=a-(x*b);
		
			   System.out.println(x+" chocolates as per your desire "+y+" cadburies ");
			   System.out.println();
		   }
		   else {
			   System.out.println("gift wt is too less for ur chocolate weight");
			   System.out.println(" you will gey "+b+" cadburies only");
			   System.out.println();
		   }
		}
		
		}
	}

