package scconditions;

import java.util.Scanner;

public class Scconditions {

    public static void main(String[] args) 
//    {
            
//           Find a number is odd or even 

//        int n;
//        
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Enter a Number :");
//        
//        n=sc.nextInt();
//        
//        if (n%2==0)
//        {
//            System.out.println("It is an Even Number ");
//        }
//        
//        else
//        {
//            System.out.println("It is an Odd Number ");
//        }
//    }

            
            
            
            
            
//    {
////        Find person is young or not young56
//        int age;
//        
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Enter the age :");
//        
//        age=sc.nextInt();
//        
////        if (age>=14&&age<=55)   if (age<14||age>55)
//        {
//            System.out.println("The Person is Young ");
//        }
//        
//        else
//        {
//            System.out.println("The Person is not Young ");
//        }
//    }

            



    {
        int m1,m2,m3;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter marks of 3 Subjects :");
        
        m1=sc.nextInt();
        
        m2=sc.nextInt();
        
        m3=sc.nextInt();
        
        float avg=(float)(m1+m2+m3)/3;
        
        if (avg>=70)
        {
            System.out.println("Grade A");
        }
        
        else if(avg>=60&&avg<70)
        {
            System.out.println("Grade B");
        }
        
        else if(avg>=50&&avg<60)
        {
            System.out.println("Grade C");
        }
        
        else 
        {
            System.out.println("Grade E");
        }
    }
}
