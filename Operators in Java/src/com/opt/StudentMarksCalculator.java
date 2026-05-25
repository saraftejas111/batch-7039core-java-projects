package com.opt;

public class StudentMarksCalculator {

	
	public static void main(String[] args) {
		
	 double math = 78 ; 
	 
	 double science = 60 ; 
	 
	 double english = 67 ; 
	 
	 double totalMarks = math+science+english ; 
	 
	 double average = totalMarks / 3 ; 
	 
	 
	 System.out.println("Total Marks = "+totalMarks);
	 
	 System.out.println("Average Marks = "+average);
	 
	 String grade = (average > 75) ? "Distinction" : "Normal" ; 
	 
	 System.out.println("Grade --> "+grade);
	 
	}
}
