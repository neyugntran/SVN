package project;

import java.util.Scanner;

public class CongTru {
	int a,b,c;
	float ketqua;
	Scanner sc=new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap a : ");
		a=sc.nextInt();
		System.out.println("Nhap b : ");
		b=sc.nextInt();
		System.out.println("Ban muon nhap phep tinh nao ???? ");
		c=sc.next().charAt(0);
	}
	public void tinh() {
		if(c=='+') {
			System.out.println("Dap an ="+(a+b));
		}
		if(c=='-') {
			System.out.println("Dap an ="+(a-b));
		}
		
	}
}