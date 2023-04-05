/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro5;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Start no.: ");
        int start = input.nextInt();
        
        System.out.println("Enter End no.: ");
        int end = input.nextInt();
        
        for (int counter = 1; counter <= end; counter++) {
        
            if (counter == 6)
                continue;
        }
        System.out.println(start);
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter no. of students : ");
        int numOfStudents = input.nextInt();
        
        int numOfPass = 0;
        int numOfFail = 0;
        int max = 0;
        int min = 100;
        int sum = 0;
        
        System.out.println("Enter Students Grades : ");
        
        for (int counter = 1; counter <= numOfStudents; counter++) {
        
            int grade = input.nextInt();
            
            sum = sum + grade;
            
            if (grade >= 50) {
            
                numOfPass++;
            } else {
            
                numOfFail++;
            }
            
            if (grade >= max) {
        
            max = grade;
            
            }
            
            if (grade <= min) {
            
                min = grade;
                
            }
        }
        
        double average = sum / numOfStudents;

        System.out.println("Number of Pass Students: " + numOfPass);
        System.out.println("Number of Fail Students: " + numOfFail);
        System.out.println("Max Grade: " + max);
        System.out.println("Min Grade: " + min);
        System.out.println("Average of Grades: " + average);
    }
    
}
