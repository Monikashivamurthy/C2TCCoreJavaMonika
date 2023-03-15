package com.Basic;

public class Continue {

	public static void main(String[] args) {
		for(int j=5;j<15;j++) {
			if(j %2!=0)
				continue;
			System.out.println(j);
		}
	}

}
