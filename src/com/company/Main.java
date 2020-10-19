package com.company;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int r, h;
	System.out.print("Introduzca valor de r: ");
	r = sc.nextInt();
	System.out.print("Introduzca valor de h: ");
	h = sc.nextInt();
	double v = Math.PI * Math.pow(r,2) * h;

	System.out.println(v);
    }
}
