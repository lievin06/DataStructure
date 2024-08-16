

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        
        if (subjects<=0) {
            
            System.out.print("Invalid number of subjects");
            
            return;
        }
        
        int totalGrades = 0;
        int failedSubjects = 0;
                
        
        int grades = 0 ;
        
        
        
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the grade for subject " + ( i + 1) + ": ");
            grades = scanner.nextInt();

            if (grades < 60) {
                failedSubjects++;
            }
            
            totalGrades +=grades;
          }

      
        int averageGrade = totalGrades / subjects;

        
        System.out.println("Average Grade: " + averageGrade);

        if (averageGrade >= 90) {
            System.out.println("Performance: Excellent");
        } else if (averageGrade >= 80) {
            System.out.println("Performance: Good");
        } else if (averageGrade >= 70) {
            System.out.println("Performance: Average");
        } else if (averageGrade >= 60) {
            System.out.println("Performance: Pass");
        } else {
            System.out.println("Performance: Fail");
        }

     
        System.out.println("Number of failed subjects: " + failedSubjects);

        
        scanner.close();
    }
}