package scloop2;

import java.util.*;

public class Scloop2 {

    public static void main(String[] args) 
    
    /*
    {
//        DISPLAY DIGITS OF NUMBER
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n=scan.nextInt();
        
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            
            System.out.println(r);
        }
        System.out.println(n);
    }
    */
            
    /*        
    {
//        COUNT DIGITS OF A NUMBER
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n=scan.nextInt();
        
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    */
    
    /*
    {
//        ARMSTRONG NUMBER
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n=scan.nextInt();
        
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            
            sum=sum+r*r*r;
        }
        
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armstrong Number");
    }
    */
            
    /*        
    {
//        REVERSING A NUMBER
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n=scan.nextInt();
        
        int rev=0,r;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse Number "+rev);
    }
    */
    
    
    {
//        CHECK A NUMBER IS PALINDROME OR NOT
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Number :");
        int n=scan.nextInt();
        int m=n;
        
        int rev=0,r;
        
        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
        }
        
        if(m==rev)
            System.out.println("The Given Number is a Palindrome");
        else
            System.out.println("The Given Number is not a Palindrome");
    }
}
