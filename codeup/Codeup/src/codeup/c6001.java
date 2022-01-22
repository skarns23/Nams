package codeup;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.math.*;
public class c6001 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[10][10];
		for(int k=0;k<10;k++)
		{
			for(int j=0;j<10;j++)
			{
				arr[k][j]=sc.nextInt();
			}
		}
		int row=1;
		int col=1;
		while(true)
		{
			
			if(arr[row][col]==2)
			{	
				arr[row][col]=9;
				break;
			}
			else if(arr[row+1][col]==1 &&arr[row][col+1]==1)
			{
				arr[row][col]=9;
				break;
			}
			else if(arr[row][col]==0)
				arr[row][col]=9;
		
			switch (arr[row][col+1])
			{
			case 0:
				col++;
				break;
			case 1:
				row++;
				break;
			case 2:
				col++;
				break;
				
			}
		}
		for(int i=0;i<10;i++)
		{
			for(int k=0;k<10;k++)
				System.out.print(arr[i][k]+" ");
			System.out.println("");
		}
		
	}
	
	
}

