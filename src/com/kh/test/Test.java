package com.kh.test;

import com.kh.test.person.model.vo.Person;

public class Test {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i] = new Person();
		}
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}
}
