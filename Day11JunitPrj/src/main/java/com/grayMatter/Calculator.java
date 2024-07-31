package com.grayMatter;

public class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public boolean isEven(int num) {
		return num%2==0;
	}
	public int findKey(int arr[],int key) {//these are not static methods so an object is needed to call
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static String checkstr(String str) { //static methods can be called by class 
		return str;
	}
	public static Student createStudent() {
		return new Student("amrit",123,22);
	}
	
}
