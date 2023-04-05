/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro6;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pro6 {

    /**
     * @param args the command line arguments
     */
    
    public static int sum (int num1 ,int num2) {
    
        int result = num1 + num2;
        return result;
    }
    
    /*
    public static double computeArea (double length, double width) {
    
        Scanner input = new Scanner (System.in);
         
         System.out.println("Enter Length: ");
          length = input.nextDouble();
         
         System.out.println("Enter Width: ");
          width = input.nextDouble();
        
        double area = length * width;
        
        return area;
    }
    */
    
     public static double computeArea () {
    
        Scanner input = new Scanner (System.in);
         
         System.out.print("Enter Length: ");
         double length = input.nextDouble();
         
         System.out.print("Enter Width: ");
         double width = input.nextDouble();
        
        double area = length * width;
        
        return area;
    }
     
     public static boolean decide (int num) {
     
         if (num > 0) {
         
             return true;
         } else {
         
             return false;
         }
     }
     
     public static char evenOrOdd (int num) {
     
         if (num % 2 == 0) {
             
             //char res = 'E';
             //return res;
             return 'E';
             
         } else {
         
             //char res = 'O';
             //return res;
             return 'O';
         }
     }
     
     public static double convertTemp (double f) {
     
         double convert = (f - 32) * 5/9.0;
         return convert;
         
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         int x = 5, y = 9;
         int result = sum(x, y);
         
         System.out.println("The Result of summation is: " + result);
         
         System.out.println();
         
         // Area 
         
         //double a , b;
         //System.out.println("The Area is: " + computeArea());
         
         /*
         int d = 5;
         boolean res = decide(d);
         System.out.println(res);
         */
         
         /*
         int q = 55;
         char res = evenOrOdd(q);
         System.out.println(res);
         */
         
         double num = 132.5;
         double convert = convertTemp(num);
         
        System.out.println("The Tempretuere in Celisus is: " + convert);
    }
    
}
