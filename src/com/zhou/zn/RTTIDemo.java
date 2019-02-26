package com.zhou.zn;
/**
 * 通过反射调用private方法
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RTTIDemo {
	private int num =1;
	private String str ="qw";
	int num2 =2;
	String str2 = "er";
	
	private void name2() {
		System.out.println("private+111");
	}
	public void name() {
		System.out.println("public");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		RTTIDemo demo = new RTTIDemo();
		Class c1 = demo.getClass();
		
		Method dm = c1.getDeclaredMethod("name2");
		//dm.setAccessible(true);
		dm.invoke(demo);
	}

}
