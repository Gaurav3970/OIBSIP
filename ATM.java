package com.practice;

import java.util.Scanner;

public class ATM {
	
	Scanner scanner =new Scanner(System.in);
	int amount=0;
	public int Account_Balance()
	{
		return amount;
	}
	
	public int  Deposit_Money(int d)
	{
		System.out.println(+d+" deposited to your account ");
		amount=d+amount;
		return amount;
	}
	
	public void  Withdraw(int d)
	{
		if((amount-d)<0)
		{
			System.out.println("Insufficent Amount");
		}
		else
		{
		System.out.println(+d+" is Succesfully withdraw");
		amount=amount-d;
		
		System.out.println("Balance amount : "+amount);
		}
	}

	public void  Transfer()
	{
		System.out.print("Enter Receipent's Name :  ");
		String s=scanner.next();
		System.out.println("Enter Amount to be transfer");
		int a=scanner.nextInt();
		if((amount-a)<0)
		{
			System.out.println("Insufficent Amount");
		}
		else
		{
			System.out.println(+a+" Successfully Transfer");
			amount=amount-a;
			System.out.println("Available Balance : "+amount);
			
		}
	}


	public static void main(String[] args) {
		
		ATM atm=new ATM();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id :");
		double id=sc.nextDouble();
		System.out.print("Enter PIN");
		double pin=sc.nextDouble();
		
		double ID=123456789;
		double PIN=1234;
		int a;
		
Boolean b=true;
		if((id==ID)&&(pin==PIN))
		{
			System.out.println("validation Succesfull");
			while(b==true)
			{
				System.out.println();
				System.out.println("Press 1 to show Account Balance :");
				System.out.println("Press 2 to Deposit :");
				System.out.println("Press 3 to Withdraw :");
				System.out.println("Press 4 to Transfer :");
				System.out.println("Press 5 to EXIT :");
				a=sc.nextInt();
				
				 if(a==1)
				 {
					 System.out.println(+atm.Account_Balance());
				 }
				 else if(a==2)
				 {
					 System.out.print("Enter Amount to deposit :");
					 int d=sc.nextInt();
					 
					 System.out.println("Now your account Balance is RS "+atm.Deposit_Money(d));
					
				 }
				 else if(a==3)
				 {
					 System.out.println("Enter Amount To Withdraw :");
					 int x=sc.nextInt();
					 atm.Withdraw(x);
					 
				 }else if(a==4)
				 {
					atm.Transfer();
				 }
				 
				 else if(a==5)
				 {
					 System.out.println("Thank you for using ATM Interface..");
					 b=false;
				 }
				 else if(a>5)
				 {
					 System.out.println("Invalid Choice");
					
				 }
				}
			
		}
		else
		{
			System.out.println("wrong ID or Pin");
			System.out.println("Please try again !!!");
		}
	}

}
