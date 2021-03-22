/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettergrade;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LetterGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final double A = 4.0;
        final double B = 3.0;
        final double C = 2.0;
        final double D = 1.0;
        final double F = 0.0;
        
        String letterGrade;
        
        System.out.println("Enter your letter grade: ");
        
        Scanner grade = new Scanner(System.in);
        
        String name = grade.nextLine();	
        
       // int A = 4
        
       //String str = grade;
                
        
        switch(name) 
        {
                    case "A" :
                        System.out.println("The numerical value of A is 4.0 ");
                        break;
                        
                    case "B" : 
                        System.out.println("The numerical value of B is 3.0");
                        break;
                        
                    case "C" :
                        System.out.println("The numerical value of C is 2.0");
                        break;
                     
                    case "D" :
                        System.out.println("The numerical value of D is 1.0");
                        break;
                        
                    case "F" :
                        System.out.println("The numerical value of F is 0.0");
                        break;
                        
                    default :
                        System.out.println("This is an invalid input");
                }
        
        
        
        

    }
    
}
