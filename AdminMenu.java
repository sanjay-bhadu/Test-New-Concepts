package Project;

import java.util.Scanner;

public class AdminMenu {
    public AdminMenu(){
        System.out.println("This is Admin Menu");
        System.out.println("----------------------------");
        System.out.println("Hello");

    }
    public void start(){
        System.out.println("Hello Admin menu has been started");
        Scanner scan=new Scanner(System.in);
        String action=scan.nextLine();
        scan.close();
        switch(action)
        {
            case "1":
            {
                System.out.println("This is case 1");
                break;
            }
            case "2":
            {
                System.out.println("This is case 2");
                break;
            }
            case "3":
            {
                System.out.println("This is case 3");
                break;
            }
            case "4":
            {
                System.out.println("This is case 4");
                break;
            }
            case "5":
            {
                System.out.println("This is case 5");
                
                break;
            }
        }
    }
    
}
