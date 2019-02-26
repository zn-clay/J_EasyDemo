package com.zhou.zn;

public class TheArchitecturalColumnSum {

	public static void main(String[] args) {
		int[] a ={ 4, -3, 5, -2, -1, 2, 6, -2};
		int sum = theArchitecturalColumnSum(a);
		int sum2 = maxSumRec(a, 0, a.length-1);
		int sum4 = maxSubSum4(a);
		System.out.println(sum4);
	}

	public static int theArchitecturalColumnSum(int[] a) {
		int realSum = 0;
		for (int i = 0; i < a.length; i++) {
			int tempSum = 0;
			for (int j = i; j < a.length; j++) {

				tempSum += a[j];

				if (tempSum > realSum) {
					realSum = tempSum;

				}
			}
		}

		return realSum;

	}
	public static int maxSumRec(int[] a,int left,int right) {
		if (left==right) {
			if (a[left] > 0) {
				return a[left];
			}else {
				return 0;
			}
		}
		int center = (left + right) / 2;
		int maxLeftSum = maxSumRec(a, left, center);
		int maxRightSum = maxSumRec(a, center + 1, right);
		
		int maxLeftBorderSum = 0,leftBorderSum = 0;
		for (int i = center; i > left; i--) {
			leftBorderSum+=a[i];
			if (leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		int maxRightBorderSum = 0,rightBorderSum = 0;
		for (int i = center+1; i <= right; i++) {
			rightBorderSum+=a[i];
			if (rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}
		}
		
		return max3(maxLeftSum,maxRightSum,maxRightBorderSum+maxLeftBorderSum);	
	}

	private static int max3(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a>b ? a>c ? a:c : b>c ? b:c;
	}
	
	public static int maxSubSum4(int [] a) {
		int maxSum = 0,thisSum = 0;
		
		for (int j = 0; j < a.length; j++) {
			thisSum+=a[j];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			}else if (thisSum<0) {
				thisSum = 0;
			}
		}
		
		return maxSum;
	}
}

