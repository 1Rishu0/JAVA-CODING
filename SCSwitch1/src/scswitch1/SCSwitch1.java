package scswitch1;

import java.util.* ;

public class SCSwitch1 {

    public static void main(String[] args) 
    {
//        DISPLAY NAME OF A DAY BASED ON NUMBER
        /*
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Day Number :");
        
        int day=scan.nextInt();
        
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
                
            case 2:
                System.out.println("Tuesday");
                break;
                
            case 3:
                System.out.println("Wednesday");
                break;
                
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Invalid");
                break;
                
        }*/
        
        
        
//        DISPLAY TYPE OF WEBSITE
       /* 
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Domain Name :");
        
        String domain=scan.nextLine();
        
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com":
                System.out.println("Commercial");
                break;
                
            case "org":
                System.out.println("Organisation");
                break;
                
            case "gov":
                System.out.println("Government");
                break;
                
            case "net":
                System.out.println("Network");
                break;
                
            case "in":
                System.out.println("Indian Website");
                break;
                
            default:
                System.out.println("There are more other Website");
                break;
                
        }*/
        
        
        
        
        
//        DISPLAY NAME OF A MONTH BASED ON NUMBER
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Month Number :");
        
        int month=sc.nextInt();
        
        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
                
            case 2:
                System.out.println("February");
                break;
                
            case 3:
                System.out.println("March");
                break;
                
            case 4:
                System.out.println("April");
                break;
                
            case 5:
                System.out.println("May");
                break;
                
            case 6:
                System.out.println("June");
                break;
                
            case 7:
                System.out.println("July");
                break;
                
            case 8:
                System.out.println("August");
                break;
                
            case 9:
                System.out.println("September");
                break;
                
            case 10:
                System.out.println("October");
                break;
                
            case 11:
                System.out.println("November");
                break;
                
            case 12:
                System.out.println("December");
                break;
                
            default:
                System.out.println("This is not a month number");
                break;
        }
    }
    
}
