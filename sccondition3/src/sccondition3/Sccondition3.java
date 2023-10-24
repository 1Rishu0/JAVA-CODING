package sccondition3;

import java.util.*;

public class Sccondition3 {

    public static void main(String[] args) 
    {
//            FIND TYPE OF WEBSITE AND THE PROTOCOL USED
            
        Scanner sc=new Scanner(System.in);
//        
        System.out.println("Enter a URL");
//        
        String url=sc.nextLine();
//        
        String protocol=url.substring(0, url.indexOf(":"));
//        
        if (protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol");
//        
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
//        
        String ext=url.substring(url.lastIndexOf(".")+1);
//        
        if (ext.equals("com"))
            System.out.println("Commercial");
//        
        else if (ext.equals("org"))
            System.out.println("Organisation");
//        
        else if (ext.equals("net"))
            System.out.println("Network");
    }
    
            
            
            
//    {
////        DISPLAY DAY NAME, BY TALKING DAY NUMBER
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Enter a Day Number");
//        
//        int day=sc.nextInt();
//        
//        if (day==1)
//        {
//            System.out.println("Mon");
//        }
//        
//        else if (day==2)
//        {
//            System.out.println("Tue");
//        }
//        
//        else if (day==3)
//        {
//            System.out.println("Wed");
//        }
//        
//        else if (day==4)
//        {
//            System.out.println("Thur");
//        }
//        
//        else if(day==5)
//        {
//            System.out.println("Fri");
//        }
//        
//        else if (day==6)
//        {
//            System.out.println("Sat");
//        }
//        
//        else if (day==7)
//        {
//            System.out.println("Sun");
//        }
//        
//        else
//        {
//            System.out.println("Invalid Day Number");
//        }
//    }
}
