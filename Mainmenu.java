package Project;

import java.util.Scanner;

public class Mainmenu {
    public Mainmenu(){
        System.out.println("Welcome to Hotel Management Application");
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("1. Book a Room");
        System.out.println("2. See my reservation");
        System.out.println("3. Create a Account");
        System.out.println("4. Admin Menu");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
    }
    public void startaction(){
        System.out.println("Enter your choice");
        Scanner scan=new Scanner(System.in);
        String action=scan.nextLine();
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
                AdminMenu admin=new AdminMenu();
                admin.start();
                break;
            }
        }


    }
    
}
