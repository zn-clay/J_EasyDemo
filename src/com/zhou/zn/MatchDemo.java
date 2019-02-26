package com.zhou.zn;

import java.math.BigInteger;
import java.util.Scanner;

public class MatchDemo {
	//计算阶乘
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int pre_answer = 1;
		String xString = String.valueOf(pre_answer);
		BigInteger answer = new BigInteger(xString);
		for (int i = 1; i < n; i++) {
			answer = answer.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(answer);
		
		
		scanner.close();
	}*/
	//计算x的m次方
	public static void main(String[] args) {
		System.out.println(MatchDemo.power(10,10));
		
	}
	public static int power(int i,int j) {
		int y = 0;
		if (j == 0) {
			y = 1;
		}else {
			y = power(i,j/2);
			y = y * y;
			if (j % 2 != 0) {
				y = i * y;
			}
		}
		return y;
	}
}
