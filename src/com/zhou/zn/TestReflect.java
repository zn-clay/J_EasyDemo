package com.zhou.zn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射调用private方法
 */


public class TestReflect {
	public void name() {
		System.out.println("name");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*TestReflect testReflect = new TestReflect();
		System.out.println(testReflect.getClass().getName());*/
		TestReflect testReflect = new TestReflect();
		Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("com.zhou.zn.TestReflect");
        class2 = new TestReflect().getClass();
        class3 = TestReflect.class;
        Method method = class3.getMethod("name");
        method.invoke(testReflect);
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
		
	}	
}
