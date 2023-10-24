package scconditions2;

import java.util.*;

public class Scconditions2 {

    public static void main(String[] args) 
            
//            FIND RADIX OF A NUMBER GIVEN IN A STRING
            
//    {
//        Scanner sc=new Scanner(System.in);
//        
//        String num;
//        
//        System.out.println("Enter a Number :");
//        
//        num=sc.nextLine();
//        
//        if (num.matches("[01]+"))
//        {
//            System.out.println("Binary Radix = 2");
//        }
//        
//        else if (num.matches("[0-7]+"))
//        {
//            System.out.println("Octal Radix = 8");
//        }
//        
//        else if (num.matches("[0-9]+"))
//        {
//            System.out.println("Decimal Radix = 10");
//        }
//        
//        else if (num.matches("[0-9A-F]"))
//        {
//            System.out.println("HexaDecimal Radix = 16");
//        }
//        
//        else
//        {
//            System.out.println("Not a Number");
//        }
//    }
//   
            
            
            
            
            
            
//      FIND A GIVEN YEAR IS A LEAP YEAR      
            
    {
        Scanner sc=new Scanner(System.in);
        
        int year;
        
        System.out.println("Enter a Year Number :");
        
        year=sc.nextInt();
        
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("It's a Leap Year");
                }
                
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            
            else
            {
                System.out.println("It's a Leap Year");
            }
        }
        
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
