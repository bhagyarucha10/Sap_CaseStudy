package com.exception;
import java .util.*;

public class SampleExceptionDemo {

	public int divMeth(int a)throws ArithmeticException
	{
		int d=42/a;
		return (d);
		
	}
	public int arrayAccessMeth(int arr[],int pos)throws ArrayIndexOutOfBoundsException
	{
		
		return (arr[pos]);
	}

	public static void main(String[] args) {
		SampleExceptionDemo demo=new SampleExceptionDemo();
		System.out.println("1.Enter the number you want to divide 42 by");
		System.out.println("2.Enter a Array and access by position ");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
int choice=s.nextInt();
switch(choice)

{
case 1: System.out.println("Enter a number");
      int d=s.nextInt();
    System.out.println(demo.divMeth(d));
      break;
case 2:System.out.println("Enter  the No of elements in array");
int count=s.nextInt();
int arr[]=new int[count];
System.out.println("Enter "+count+" Array Elements");
for(int i=0;i<count;i++)
{
	arr[i]=s.nextInt();
	
}
System.out.println("enter position to access");
int pos=s.nextInt();
System.out.println(demo.arrayAccessMeth(arr,pos));
}


	}

}
