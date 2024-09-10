package com.codsoft;
import java.util.*;
public class Grade {
	
	private int English;
	private int Maths;
	private int Science;
	private int History;
	private int Geography;
	
	public char grade;
	public int total_marks;
	public float percentage;
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter Student Marks out of 100: ");
		System.out.println("English: ");
		English = Integer.parseInt(sc.nextLine());
		System.out.println("Maths: ");
		Maths = Integer.parseInt(sc.nextLine());
		System.out.println("Science: ");
		Science = Integer.parseInt(sc.nextLine());
		System.out.println("History: ");
		History = Integer.parseInt(sc.nextLine());
		System.out.println("Geography: ");
		Geography = Integer.parseInt(sc.nextLine());

		marks();
		
	}
	
	public void marks() {
		
		total_marks = English + Maths + Science + History + Geography;
		//System.out.println("Total Marks Obtainer: "+total_marks+"/500");
		perc();
	}
	
	public void perc() {
		percentage = ((float)total_marks/500)*100;
		grd();
	}
	
	public void grd() {
		if(percentage > 89)
			grade = 'A';
		
		else if(percentage > 79 && percentage < 90)
			grade = 'B';
		
		else if(percentage > 69 && percentage < 80)
			grade = 'C';
		
		else if(percentage > 59 && percentage < 70)
			grade = 'D';
		else
			grade = 'F';
		result();
	}
	
	public void result() {
		System.out.println("\tStudent Details: ");
		System.out.println("Marks Obtained:");
		System.out.println("English:\t"+English+"\nMaths:\t"+Maths+"\nScience:\t"+Science+"\nHistory:\t"+History+"\nGeography:\t"+Geography);
		System.out.println("\nTotal Marks Obtained: "+total_marks+"/500");
		System.out.println("Percentage: "+percentage+"%");
		System.out.println("Grade: "+grade);
		
	}
	
}
