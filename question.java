package QuestionsPractice;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
    String input=scan.nextLine();
    char c=scan.nextLine().charAt(0);//this is used for taking input of char.
    int count=0;
    for(int i=0;i<input.length();i++)
    {
       int com=Character.compare(input.charAt(i), c);// comparing character if value==0 then char are same ;
       if(com==0){
           count++;
       }
    }
    System.out.println(count);
    }
}
