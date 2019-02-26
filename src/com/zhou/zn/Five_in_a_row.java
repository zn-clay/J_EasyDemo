package com.zhou.zn;

import java.util.Collections;
import java.util.Random;

public class Five_in_a_row {
	static int[][] chessboard = new int[5][5];
	static int pedometer=0;	
	public static void getNext() {	
		Random random = new Random();
		while(true) {
			int row = random.nextInt(5);
			int column = random.nextInt(5);
			if (chessboard[row][column] == 0) {
				if (pedometer % 2 == 0) {
					chessboard[row][column] = 1;
					pedometer++;
					getResult(chessboard, row, column);
					break;
				}
				chessboard[row][column] = 2;
				pedometer++;
				getResult(chessboard, row, column);
				break;
			}
		}
	}
	public static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();		
		}
	}
	public static void getResult(int[][] a,int r,int c) {
		int num = 0;
		int result = 0;		
		result = getResult(a, r, c, 1, 0, 0);	
		int result1 = getResult(a, r, c, -1, 0, 0);
		System.out.println(result+"  "+result1);
		int result2 = getResult(a, r, c, 0, 1, 0);
		int result3 = getResult(a, r, c, 0, -1, 0);
		System.out.println(result2+"  "+result3);
		int result4 = getResult(a, r, c, 1, 1, 0);
		int result5 = getResult(a, r, c, -1, -1, 0);
		System.out.println(result4+"  "+result5);
		int result6 = getResult(a, r, c, -1, 1, 0);
		int result7 = getResult(a, r, c, 1, -1, 0);
		System.out.println(result6+"  "+result7);
		if (result+result1 >=3 || result2+result3>=3
				||result4+result5>=3||result6+result7>=3) {
			System.out.println(a[r][c] == 1 ? "1方胜":"2方胜");
			return;
		}
	}
	
	public static int getResult(int[][] a,int r,int c,int r_,int c_,int num) {
		int n = a[r][c];
		//System.out.println(n);
		//System.out.println("r:"+r+"  "+"c:"+c+"  "+"r_:"+r_+"  "+"c:"+c_+"  *************");
		//System.out.println("num:"+num+"***********************");		
		/*if (num == 3) {
			System.out.println(a[r][c] == 1 ? "1方胜":"2方胜");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			return;
		}*/
		if (r+r_ >=0 && c+c_ >=0 && r+r_ <5 && c+c_ <5) {
			if (n == a[r+r_][c+c_]) {
				num = getResult(a,r+r_,c+c_,r_,c_,++num);
			}			
		}
		return num;
	}
	public static void main(String[] args) {
		int i = 0;
		while (i<25) {
			getNext();
			printMatrix(chessboard);
			System.out.println(i+"--------------------------------------");
			i++;
		}	
	}
}
