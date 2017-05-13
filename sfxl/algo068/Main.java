package com.gwh.sfxl.algo068;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.charAt(0)>='0'&&input.charAt(0)<='9')
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
