import java.util.Scanner;

public class subjectgrading3 {
    public static void main (String[] args)
    {
         
        Scanner sc = new Scanner(System.in);
        int totalSubjects = 5;
        int totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += sc.nextInt();
        }

        double avg = totalMarks / totalSubjects;
        char grade;

        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("average : " + avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
    
}
