package com.zhou.zn;

import java.util.Random;

public class Quicksort {
	public static void main(String[] args) {
		int[] a = new int[100]; 
		for (int i = 0; i < a.length; i++) {
			Random random = new Random();
			a[i] = random.nextInt(10000);
		}		
		QSourt(a, 0, a.length-1);
		printInt(a);
	}
	public static void printInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i%10==0) {
				System.out.println();
			}
			System.out.print(a[i]+"  ");
		}
	}
	public static void QSourt(int[] a,int row,int hight) {
		int i = row;
		int j = hight;
		if (i >= j) {
			return;
		}
	
		int n = a[i];
		while(i<j) {
			while(i<j && a[i] <= n) {
				i++;
			}
		
			while (i<j && a[j] >= n) {
				j--;
			}
			int p = a[i];  
            a[i] = a[j];  
            a[j] = p; 
          
		}
		if (a[i] < n) {
			int p = a[i];  
	        a[i] = a[row];  
	        a[row] = p;
		}
        QSourt(a, row, i-1 ); 
        QSourt(a, i, hight); 
	}
}
