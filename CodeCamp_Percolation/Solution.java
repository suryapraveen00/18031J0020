package com.percolation.algorithm;

import java.util.Scanner;

public class Solution {

	 public static void main(String[] args)
     {
    	 int n,row,col,count=0;
    	 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	
    	 System.out.println("please enter size");
    	 n=sc.nextInt();
         Percolation p=new Percolation(n);
         /*for(int i=0;sc.hasNext();i++)
         {
        	 System.out.println("please enter row and colomn");
             row=sc.nextInt();
             col=sc.nextInt();
             p.open(row,col);
         }*/
         while(count==0)
         {
         System.out.println("please enter row and colomn");
         row=sc.nextInt();
         col=sc.nextInt();
         p.open(row,col);
         	System.out.println("enter 1 to insert 0 to exit");
         	int ch=sc.nextInt();
         	if(ch==1)
         	{
         		count=0;
         	}
         	else
         		count=1;
         }
         //System.out.println(p.isOpen(1,2));
         //System.out.println(p.isFull(1,2));
         //System.out.println("no of open sites are "+p.numberOfOpenSites());
         System.out.println(p.percolates());
         //p.disp();
     }
}
