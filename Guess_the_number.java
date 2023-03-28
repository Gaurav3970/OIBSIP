package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random Random_Obj = new Random();
		int a=Random_Obj.nextInt(100);
		
		System.out.println("Lets Play a Game !!!");
		System.out.println("Guess a number between 1 to 100");
		int input=sc.nextInt();
		
		int counter=0;
		
		boolean x=false;
		
		while(x!=true)
		{
			
			if(input==a)
			{
				
				System.out.println("Its WIN!!! the number was "+a);
				x=true;
			}
			
		else if(input>a)
			{
				System.out.println(+input+" is too High");
				input=sc.nextInt();
			}
			else if(input<a)
			{
				System.out.println(+input+" is too low");
				input=sc.nextInt();
			}
			counter++;
		}
		System.out.println("You took "+counter+" Gusses to guess it Right");

	}

}
