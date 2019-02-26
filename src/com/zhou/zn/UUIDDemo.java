package com.zhou.zn;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString());
		//print:7db87713-6eb0-4873-b3ca-bece664dc50c
		
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		//5877edbff0264b2491857b8a85e16bfb
	}
}
