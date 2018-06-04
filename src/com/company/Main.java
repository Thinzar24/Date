package com.company;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        SimpleDateFormat inputData = new SimpleDateFormat();
        System.out.println("What is the Date ? ");

        Date date = new Date();
        String userinput ="";
        userinput =input.nextLine();


        String dateFormat ="dd/MM/yyyy";
        inputData = new SimpleDateFormat(dateFormat);

        Date userInputDt=inputData.parse(userinput);

        while (userInputDt.after(new Date())){
            System.out.println("Please Enter Date again ");
            userinput =input.nextLine();

            inputData = new SimpleDateFormat(dateFormat);
            userInputDt=inputData.parse(userinput);

        } System.out.println("OK");


    }
}
