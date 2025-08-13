package Javalab;

import java.util.Scanner;

public class Addmat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows of matrix:");
		int rows=sc.nextInt();
				System.out.println("Enter columns of matrix:");
		int cols=sc.nextInt();
		int [][]matrix= new int[rows][cols];
		int [][]transpose= new int[cols][rows];
		System.out.println("Enter matrix elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		matrix[i][j]=sc.nextInt();
		}
	}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		transpose[j][i]=matrix[i][j];
		
	}

		}	
		 System.out.println("\nOriginal Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        
	        System.out.println("\nTranspose Matrix:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(transpose[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
	
	



