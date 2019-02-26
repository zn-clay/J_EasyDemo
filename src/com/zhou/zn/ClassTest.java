package com.zhou.zn;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassTest {
	public static void main(String[] args) {
		
		int[] as= new int[6];
		
		char[] bs = new char[2];
		
		byte[] bys = new byte[555];
		
//		System.out.println(as.getClass());
//		System.out.println(bs.getClass());
//		System.out.println(bys.getClass());
		boolean fal = false;
		//System.out.println(fal |= true);
		int a = 2;
		a = a>>>2;
		//System.out.println(a);
//		a |= a>>>1;
//		a |= a>>>4;
//		a |= a>>>8;
		a |= a>>>16;
		int[] ars = {1,2,3,4,5};  
		//System.out.println(1|2);//3
		//System.out.println(1&2);

	int num = 0;
	int count = 0;
	for (int i = 0; i <= 100; i++) {
		num = num+1;
		count = count++;
	}
	System.out.println(""+(count*num));
	}	
}
