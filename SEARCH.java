package project1;

import java.util.Scanner;

public class SEARCH {

	public static void main(String[] args)
	{
    int i,j,n=0,search,flag=0;
    int marks[]=new int[20];
    System.out.println("enter n value");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("enter"+n+"values");
    for(i=0;i<n;i++)
    {
    	marks[i]=s.nextInt();
    }
    System.out.println("enter search value");
    search=s.nextInt();
    for(i=0;i<n;i++)
    {
    	if(search==marks[i])
    	{
    	flag++;	
    	}
    }
    	if(flag==1)
    	{
    		System.out.println("yes");
    	}
    	else
    		System.out.println("no");
    }
    

	}


