package org.school;

import java.util.Scanner;

public class Totalmarks {

public static void main(String[] args) {
	
	Scanner m=new Scanner(System.in);
	System.out.println("enter mark1,mark2,mark3,mark4,mark5");
	int Mark1=m.nextInt();
	int Mark2=m.nextInt();
	int Mark3=m.nextInt();
	int Mark4=m.nextInt();
	int Mark5=m.nextInt();
	
	int total=Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
	int Average=total / 5;
	
	
	System.out.println(" Total Marks =  " + total);
    System.out.println(" Average Marks =  " + Average);
}

	}


