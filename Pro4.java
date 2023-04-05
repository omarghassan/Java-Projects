/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro4;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        for (int counter = 0; counter < 6; counter++) {
        
            System.out.println("Hello");
        }*/
        
        
        // Print Numbers from 30 -> 60
        /*
        for (int num = 30; num <= 60; num++) {
        
            System.out.println(num);
        }
        */
        
        // Print Even Numbers from 19 -> 23
        /*
        for (int num = 20; num <= 23; num++) {
        
            if (num % 2 == 0)
            System.out.println(num);
        }
        */
        
        // Start -- End
        /*
        int start = 1;
        int end = 5;
        for ( ; start <= end; start++) {
        
            System.out.println(start);
        }
        */
        
        // Let User enter the Start and End of the Loop
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Start no.: ");
        int start = input.nextInt();
        
        System.out.println("Enter The End no.: ");
        int end = input.nextInt();
        
        for ( ; start <= end; start++) {
        
            System.out.println(start);
        }
        */
        
        // Print All Numbers except numbers that accept dividence on 7
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Start no.: ");
        int start = input.nextInt();
        
        System.out.println("Enter The End no.: ");
        int end = input.nextInt();
        
        for ( ; start <= end; start++) {
        
            if (start % 7 != 0)
                System.out.println(start);
        }
        */
        
        //Let User enter The End number
        /*
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The End no.: ");
        int end = input.nextInt();
        
        for (int start = 1; start <= end; start++) {
        
            System.out.println(start);
        }
        */
        
        // Sum
        /*
        int sum = 0;
    
        for (int counter = 1; counter <= 10; counter++) {
        
            sum = sum + counter;
        }
        System.out.println("The Sum is: " + sum);
        */
        
        // Average
        /*
        int sum = 0;
   
        for (int counter = 1; counter <= 10; counter++) {
        
            sum = sum + counter;
        }
        System.out.println("The Sum is: " + sum);
        
        double average = sum / 2;
        
        System.out.println("Average = " + average);
        */
        
        
        Scanner input = new Scanner(System.in);
       
        int grade = input.nextInt();
        
        int sum = 0;
        
        while (grade != -1) {
        
            sum = sum + grade;
            grade = input.nextInt();
            
        }
        
        System.out.println("Sum of grades = " + sum);
        
    }
    
    
}
