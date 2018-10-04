package com.percolation.algorithm;

public class Percolation {

	int size,row,col,count=0;
    int matrix[][];
   public Percolation(int n)
    {
        size=n;
        matrix=new int[size][size];
        for(int i=0;i<size;i++)
     	{
     		for(int j=0;j<size;j++)
     		{
     			matrix[i][j]=1;
     		}
     	}
    }// create n-by-n grid, with all sites blocked
   
   public void open(int r, int c)
    {
        row=r;
        col=c;
        System.out.println("hello");
    	 matrix[row][col]=0;
    	
    
    }// open site (row, col) if it is not open already
   public void disp()
   {
   	for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println(matrix[i][j]);
				//System.out.println("\t");
			}
			System.out.println(" ");
		}
   }
   public boolean isOpen(int row, int col)
    {
        this.row=row;
        this.col=col;	
        for(int i=0;i<size;i++)
     	{
     		for(int j=0;j<size;j++)
     		{
     			if(matrix[row][col]==0)
     			return true;
     		}
     	}
        return false;
    }// is site (row, col) open?
   public boolean isFull(int row, int col)
    {
        this.row=row;
        this.col=col;
		return false;
    }// is site (row, col) full?
   public int numberOfOpenSites()
    {
   	for(int i=0;i<size;i++)
     	{
     		for(int j=0;j<size;j++)
     		{
     			if(matrix[row][col]==0)
     			count++;
     		}
     	}
   	//System.out.println("no of open sites are "+count);
   	return count;
    }// number of open sites
   public boolean percolates()
    {
        for(int i=0;i<size;)
        {
       	 for(int j=0;j<size;)
       	 {
       		if(matrix[i][j]!=0)
       		{
       			j++;
       		}
       		else
       		{
       			if(i>0)
       			{
       				if(matrix[i-1][j]==0)
       					i++;
       				if(i==size)
      				 {
      					 return true; 	
      				 }
       			}
       			else
       			{
       				 i++;
       				 if(i==size)
       				 {
       					 return true;
       				
       				 }
       			}
       		}
       	 }
        }
        return false;
    }

}
