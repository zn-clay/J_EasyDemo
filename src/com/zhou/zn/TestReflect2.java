package com.zhou.zn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射调用private方法
 */

class Candy {
	static {
		System.out.println("Loading Candy");
	}
	public Candy() {
		System.out.println("123");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
	public Gum() {
		System.out.println("456");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
	public Cookie() {
		System.out.println("789");
	}
}

public class TestReflect2 {
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		print("inside main");
		new Candy();
		print("After creating Candy");
		try {
			Class.forName("com.zhou.zn.Gum");
		} catch (ClassNotFoundException e) {
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"com.zhou.zn.Gum\")");
		new Cookie();
		print("After creating Cookie");
	}

}
