package com.Basic;

public class NestedForloop {

	public static void main(String[] args) {
		// program to print the multiplication tables in a given range by using nested
		int begin=10;
		int end=20;
		for(int i=begin;i<=end;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i +"*" + j +"=" +i*j);
				
			}
			System.out.println();
		}
	}

}
