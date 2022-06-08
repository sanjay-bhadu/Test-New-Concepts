package QuestionsPractice;

import java.util.Date;
import java.text.Format;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Dateinput {
    public static void main(String[] args) {
        Date date=new java.util.Date();
        Scanner scan=new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String input=scan.nextLine();
        
        try {
            date=format.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
