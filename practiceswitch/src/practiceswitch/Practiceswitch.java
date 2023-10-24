package practiceswitch;

import java.util.*;

public class Practiceswitch {

    public static void main(String[] args) 
    {
        String str;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        
        str=sc.next();
        
        switch(str)
        {
            case "1":
                System.out.println("One");
                break;
                
            case "2":
                System.out.println("Two");
                break;
                
            case "3":
                System.out.println("Three");
                break;
                
            default :
                System.out.println("Invalid");
        }
    }
    
}
