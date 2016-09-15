/*
 * File Created by patrickmfsd.
 * Copyright © 2016 patrickmfsd. All rights reserved.
 */

package calculator;

import java.util.Scanner;

public class Calculator {

    private static double n1;
    private static double n2;
    private static String operation;

    public static void main(String[] args) {
        System.out.println("SimpleCalc");
        System.out.println("\nVersion 0.7");
        System.out.println("\nCopyright © 2016 patrickmfsd.");
        System.out.println("All Rights Reserved");
        System.out.println("\nA Simple Calculator Application");
        System.out.println("That can preform the following operations");
        System.out.println("+ - / * % sqrt");
        System.out.println("___________________________________");
        
        /* Calls functions */
        numEntry();
        operationSelect();
        operationList();
    }
    
    /* Asks user to enter two numbers */
    static void numEntry(){
        Scanner num = new Scanner(System.in);
        
        // TO DO: 
        // Add error handling display message if user doesnt enter a number
        System.out.println("\nEnter First Number: ");
        n1 = num.nextDouble();

        // TO DO: 
        // Add error handling display message if user doesnt enter a number
        System.out.println("\nEnter Second Number: ");
        n2 = num.nextDouble();
    }
    
    /* Diplays List of Operations */
    /* Asks user to select an operation from the list*/
    static void operationSelect(){ 
        System.out.println("\nList of Operations");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");   
        System.out.println("*");
        System.out.println("%");
        System.out.println("sqrt");
    
        Scanner op = new Scanner(System.in);
        System.out.println("\nEnter An Operation:");
        operation = op.next();
        op.nextLine();
        
        // TO DO: 
        // Move Error handeling for invalid operation here.
    }
    
    /* Once user enter two numbers and an operation */
    /* If user enters invalid operation it will display an error message */
    static void operationList(){
            
        switch(operation){
            case "+":
                System.out.println("\nAnswer Is:");
                System.out.println((n1 + n2));
            break;

            case "-":
                System.out.println("\nAnswer Is:");    
                System.out.println((n1 - n2));
            break;

            case "/":
                System.out.println("\nAnswer Is:");
                System.out.println(((float)n1 / n2));
            break;

            case "*":
                System.out.println("\nAnswer Is:");
                System.out.println((n1 * n2));
            break;
            
            case "%":
                System.out.println("\nAnswer Is:");
                System.out.println((n1 % n2));
            break;
            
            case "sqrt":
                System.out.println("\nAnswer Is:");
                System.out.printf("\nThe value of e is %.4f%n", Math.E);
                System.out.printf("sqrt(%.3f) is %.3f%n", n1, Math.sqrt(n2));
            break; 
            
            default:  
                System.out.println("\n" + "'" + operation + "'" + " is an invalid opration");
                System.out.println("Please Enter A Valid Operation");
                
             
                         
        }
    }  
}