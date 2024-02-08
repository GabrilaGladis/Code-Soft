package Code_Soft;

import java.util.Scanner;

public class Student_Grade_Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE TOTAL NUMBER OF SUBJECTS:");//getting the total subjects 
		int total_marks=0;
		int total_subjects=s.nextInt();
		for (int i = 1; i <= total_subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            total_marks =total_marks+ s.nextInt();
		}
        
		
		double avg_marks=total_marks/total_subjects;//calculating the average marks of Student
		
		char grade='G';
		if(avg_marks>=90)
			grade='A';
		else if(avg_marks>=80)
			grade='B';
		else if(avg_marks>=70)
			grade='C';

		else if(avg_marks>=60)
			grade='D'; if(avg_marks>=50)
			grade='E';

		else if(avg_marks>=40)
			grade='F';

		else if(avg_marks>=35)
			grade='G';

		else
			System.out.println("FAIL");
		System.out.println("To Display The Results Of The Student:");
		System.out.println("The Total Marks Of The Student"+total_marks);
		System.out.println("The Total Marks Of The Student"+avg_marks);
		System.out.println("The Grade Of The Student"+grade);
	}

}