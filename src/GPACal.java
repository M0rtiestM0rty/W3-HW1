/*
Write a client that creates a symbol table mapping letter grades to numerical scores, as in the table
below, then reads from standard input a list of letter grades and computes and prints the GPA (the average
of the numbers corresponding to the grades).

*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GPACal
{
    public static void main (String[]args)
    {
        Map<String, Double> gradeMap = new HashMap<>();

        gradeMap.put("A+", 4.33);
        gradeMap.put("A", 4.00);
        gradeMap.put("A-",3.67);
        gradeMap.put("B+", 3.33);
        gradeMap.put("B", 3.00);
        gradeMap.put("B-",3.67);
        gradeMap.put("C+", 2.33);
        gradeMap.put("C", 2.00);
        gradeMap.put("C-",1.67);
        gradeMap.put("D", 1.00);
        gradeMap.put("F", .00);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Letter grade (capital letter): ");
        String[] grades = in.nextLine().split(" //s+");

        double total = 0;
        int counter = 0;

        for (String grade : grades)
        {
            if (gradeMap.containsKey(grade))
            {
                total += gradeMap.get(grade);
                counter++;

            }// end if
                else
                {
                    System.out.println("Invalid grade: " + grade);
                    break;
                }// end else

        }// end for

        if (counter > 0)
        {
            double gpa = (total / counter);
            System.out.println("Your GPA is " + gpa);
        }// end if
        else
        {
            System.out.println("No grades were found");
        }// end else statement




    }// end main
}// end class
